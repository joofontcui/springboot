package com.joofont.springboot;

import com.joofont.springboot.entity.User;
import com.joofont.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cui jun on 2018/11/29.
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CacheTests {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserFromCache() {
        User user1 = userService.getUser(16);
        log.info("第一次查询id=16:" + user1);
        User user2 = userService.getUser(17);
        log.info("第二次查询id=17:" + user2);
        User user3 = userService.getUser(16);
        log.info("第三次查询id=16:" + user3);
    }

}
