package com.watermelon.spring.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2017/5/5.
 */
@Configuration
@ComponentScan("com.watermelon.spring.schedule")
@EnableScheduling//启动定时
public class TaskSchedulerConfig {
}
