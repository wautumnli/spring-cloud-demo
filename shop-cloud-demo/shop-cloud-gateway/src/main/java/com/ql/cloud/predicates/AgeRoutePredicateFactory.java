package com.ql.cloud.predicates;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 自定义路由断言
 * 名字必须是 配置 + RoutePredicateFactory
 * 必须继承 AbstractRoutePredicateFactory<配置类>
 * @author: wautumnli
 * @date: 2021-08-07 14:00
 **/
@Component
public class AgeRoutePredicateFactory extends AbstractRoutePredicateFactory<AgeRoutePredicateFactory.Config> {

    // 构造函数
    public AgeRoutePredicateFactory() {
        super(AgeRoutePredicateFactory.Config.class);
    }

    // 读取配置文件参数 赋值到配置属性
    public List<String> shortcutFieldOrder() {
        // 顺序必须对应
        return Arrays.asList("minAge", "maxAge");
    }

    public Predicate<ServerWebExchange> apply(AgeRoutePredicateFactory.Config config) {
        return serverWebExchange -> {
            String ageStr = serverWebExchange.getRequest().getQueryParams().getFirst("age");
            if (StringUtils.isNotEmpty(ageStr)) {
                int age = Integer.parseInt(ageStr);
                return age < config.maxAge && age > config.minAge;
            }
            return false;
        };
    }

    // 用于接收配置文件中的参数
    @Data
    @NoArgsConstructor
    public static class Config {
        private int minAge;
        private int maxAge;
    }
}
