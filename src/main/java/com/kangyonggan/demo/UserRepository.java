package com.kangyonggan.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * @author kangyonggan
 * @since 2019-09-20
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
