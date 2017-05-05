package com.watermelon.spring.Thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Async;

/**
 * Created by Administrator on 2017/5/5.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = ctx.getBean(AsyncTaskService.class);
         for(int i = 0;i<10; i++){
             asyncTaskService.executeAsyncTask(i);
             asyncTaskService.executeAsyncTaskPlus(i);
         }
         ctx.close();
    }
}
