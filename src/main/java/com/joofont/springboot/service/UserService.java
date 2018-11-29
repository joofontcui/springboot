package com.joofont.springboot.service;

import com.joofont.springboot.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author cui jun on 2018/11/4.
 * @version 1.0
 */
public interface UserService {

    List<User> getAllUserList();

    User getUser(Integer id);

    int updateById(User user);

}
