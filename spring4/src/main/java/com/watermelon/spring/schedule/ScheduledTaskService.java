package com.watermelon.spring.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/5.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//每个5秒执行一次
    public void reportCurrentTime(){
        System.out.println("5秒："+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 51 13 ? * *")//每个5秒执行一次
    public void fixTimeExecution(){
        System.out.println("制定时间"+dateFormat.format(new Date()));
    }
}
