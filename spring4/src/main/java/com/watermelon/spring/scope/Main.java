package com.watermelon.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/5/5.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ScopeConfig.class);
        SingletonService s1 = ctx.getBean(SingletonService.class);
        SingletonService s2 = ctx.getBean(SingletonService.class);

        PrototypeService p1 = ctx.getBean(PrototypeService.class);
        PrototypeService p2 = ctx.getBean(PrototypeService.class);

        System.out.println("s1,s2:"+s1.equals(s2));
        System.out.println("p1,p2:"+p1.equals(p2));

    }
}
