package cloud.service.impl;

import cloud.doa.ProductDao;
import cloud.service.ProductService;
import com.ql.cloud.domain.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:28
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDao productDao;

    @Override
    public Product findByPid(Integer pid) {
        return productDao.findById(pid).get();
    }
}
