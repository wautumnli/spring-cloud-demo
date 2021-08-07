//package com.ql.cloud.config;
//
//import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author: wautumnli
// * @date: 2021-08-07 12:01
// **/
//// @Configuration
//public class FilterContextConfig {
//
//    @Bean
//    public FilterRegistrationBean sentinelFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new CommonFilter());
//        registration.addUrlPatterns("/*");
//        registration.addInitParameter(CommonFilter.WEB_CONTEXT_UNIFY, "false");
//        registration.setOrder(1);
//        registration.setName("sentinelFilter");
//        return registration;
//    }
//}
