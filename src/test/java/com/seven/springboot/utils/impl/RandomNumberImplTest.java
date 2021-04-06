package com.seven.springboot.utils.impl;

import com.seven.springboot.utils.RandomNumber;
import jdk.nashorn.internal.ir.annotations.Reference;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RandomNumberImplTest extends TestCase {

    @Resource
    private RandomNumber randomNumber;

    @Test
    public void testGetRandom() {
        System.out.println(randomNumber.getRandom());
    }

    @Test
    public void testGetOrder() {
        System.out.println(randomNumber.getOrder());
    }
}