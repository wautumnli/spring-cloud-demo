package com.ql.cloud.doa;

import com.ql.cloud.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: wautumnli
 * @date: 2021-08-04 23:29
 **/
public interface UserDao extends JpaRepository<User, Integer> {
}
