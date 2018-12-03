package com.joofont.springboot;

import com.joofont.springboot.mq.Sender;
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
public class RebbitMQTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        for (int i = 0; i < 10000; i++) {
            sender.send();
        }
    }

}
