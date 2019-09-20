package com.kangyonggan.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author kangyonggan
 * @since 2019-09-20
 */
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * 根据账号查询
     *
     * @param admin
     * @return
     */
    @Query(value = "SELECT * FROM tb_user WHERE account = ?1", nativeQuery = true)
    User findUserByAccount(String admin);
}
