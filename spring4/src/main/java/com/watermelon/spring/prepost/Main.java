package com.watermelon.spring.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/5/5.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = ctx.getBean(BeanWayService.class);
        JSR250 jsr250 = ctx.getBean(JSR250.class);
        ctx.close();
    }
}
