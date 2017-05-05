package com.watermelon.spring.prepost;

/**
 * Created by Administrator on 2017/5/5.
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init");
    }

    public BeanWayService() {
        super();
        System.out.println("构造了-BeanWay");
    }

    public void destroy(){
        System.out.println("@Bean-destroy");
    }
}
