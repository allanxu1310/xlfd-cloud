package com.xlfd.service.user.impl;

import com.xlfd.api.user.UserMapper;
import com.xlfd.domain.user.User;
import com.xlfd.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther Allan
 * @date 2018/9/17 19:00
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(String id) {
        return userMapper.getUser(id);
    }
}
