package com.joofont.springboot.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cui jun on 2018/11/29.
 * @version 1.0
 */
@Slf4j
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 50000)
    public void reportCurrentTime() {
        log.info("定时任务开启：" + dateFormat.format(new Date()));
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

}
