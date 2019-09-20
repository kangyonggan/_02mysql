package com.kangyonggan.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kangyonggan
 * @since 2019-09-20
 */
public class UserRepositoryTest extends AbstractTest {

    @Autowired
    private UserRepository userRepository;

    /**
     * 测试保存用户
     */
    @Test
    public void testSave() {
        User user = new User();
        user.setAccount("admin");
        user.setPassword("123456");
        user.setSalt("abcd");
        user.setIsDeleted((byte) 0);
        userRepository.save(user);
    }

}
