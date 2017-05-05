package com.watermelon.spring.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/5/5.
 */

@Configuration
@ComponentScan("com.watermelon.spring.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
     BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250 jsrService(){
        return new JSR250();
    }
}
