package com.joofont.springboot;

import com.joofont.springboot.async.TaskPool;
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
public class AsyncTests {

    @Autowired
    private TaskPool taskPool;

    @Test
    public void test() throws Exception {
        for (int i = 0; i < 10000; i++) {
            taskPool.doTaskOne();
            taskPool.doTaskTwo();
            taskPool.doTaskThree();

            if (i == 9999) {
                System.exit(0);
            }
        }
    }

}
