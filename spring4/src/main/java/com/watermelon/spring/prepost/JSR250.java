package com.watermelon.spring.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2017/5/5.
 */
public class JSR250 {

    @PostConstruct
    public void intitle(){
        System.out.println("JSRWAy-init");
    }

    public JSR250() {
        super();
        System.out.println("构造了-JSR");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("JSRWAy-destroy");
    }
}
