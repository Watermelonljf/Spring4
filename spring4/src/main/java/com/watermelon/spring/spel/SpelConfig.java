package com.watermelon.spring.spel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/5.
 */

@Configuration
@ComponentScan("com.watermelon.spring.spel")
//@PropertySource("classpath:com/watermelon/spring/spel/test.properties")
public class SpelConfig {

    @Value("I love you")
    private String normal;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randNum;

    @Value("#{DemoService.anthoer}")
    private String fromAnother;

    @Value("classpath:com/watermelon/spring/spel/test.txt")
    private Resource testFlie;

    @Value("http:www.baidu.com")
    private Resource testUrl;


    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    public void out() throws IOException {
        System.out.println(this.normal);
        System.out.println(this.randNum);
        System.out.println(this.fromAnother);
        System.out.println(IOUtils.toString(this.testUrl.getInputStream()));
        System.out.println(this.environment.getProperty("book.author"));
        System.out.println(IOUtils.toString(this.testFlie.getInputStream()));
    }
}
