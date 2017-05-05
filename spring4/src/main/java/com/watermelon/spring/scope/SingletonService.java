package com.watermelon.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by watermelon_r on 2017/5/5.
 */
@Service
@Scope("singleton")//默认为单例
public class SingletonService {
}
