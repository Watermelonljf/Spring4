package com.watermelon.spring.spel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/5.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpelConfig.class);

        SpelConfig spelConfig = ctx.getBean(SpelConfig.class);

        try {
            spelConfig.out();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
