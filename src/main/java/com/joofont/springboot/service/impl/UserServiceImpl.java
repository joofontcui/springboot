package com.joofont.springboot.service.impl;

import com.joofont.springboot.dao.UserMapper;
import com.joofont.springboot.entity.User;
import com.joofont.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author cui jun on 2018/11/4.
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUserList() {
        return userMapper.getAllUserList();
    }

    @Override
    @Cacheable(value = "getUser")
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }

    @Override
    public int updateById(User user) {
        return userMapper.updateById(user);
    }

}
