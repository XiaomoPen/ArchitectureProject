package com.seven.springboot.utils.impl;

import com.seven.springboot.utils.RandomNumber;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Component
public class RandomNumberImpl implements RandomNumber {

    private volatile int i=0;

    public String getRandom() {
        StringBuilder id=new StringBuilder();
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        Random random=new Random();
        id.append(format.format(new Date()));
        id.append(random.nextInt(10000));
        return id.toString();
    }

    public String getOrder() {
        StringBuilder id=new StringBuilder();
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMddss");
        id.append(format.format(new Date()));
        Random random=new Random();
        id.append(random.nextInt(100));
        id.append(i++);
        if(i==100){
            i=0;
        }
        return id.toString();
    }
}
