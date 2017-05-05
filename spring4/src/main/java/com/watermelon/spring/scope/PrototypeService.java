package com.watermelon.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by  on 2017/5/5.
 */
@Service
@Scope("prototype")//每次调用都创建
public class PrototypeService {
}
