package com.seven.springboot.utils;

import org.springframework.stereotype.Component;

@Component
public interface RandomNumber {

//    生成随机编码
    public String getRandom();

//    生成简单编码
    public String getOrder();
}
