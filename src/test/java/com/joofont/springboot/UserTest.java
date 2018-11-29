package com.joofont.springboot;

import com.joofont.springboot.entity.User;
import com.joofont.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cui jun on 2018/11/28.
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUser() {
        User user = userService.getUser(16);
        System.out.println("User:"+user);
    }

}
