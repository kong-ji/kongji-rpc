package org.kongji.server.service;

import org.kongji.api.User;
import org.kongji.api.UserService;

/**
 * @author kong-ji
 * @version 1.0
 * @data 2025/4/7
 */

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(Long id) {
        return User.builder()
                .id(id)
                .username("张三")
                .build();
    }
}
