package cloud.doa;

import com.ql.cloud.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:29
 **/
public interface ProductDao extends JpaRepository<Product, Integer> {
}
