package cloud.service;

import com.ql.cloud.domain.Product;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:28
 **/
public interface ProductService {

    Product findByPid(Integer pid);
}
