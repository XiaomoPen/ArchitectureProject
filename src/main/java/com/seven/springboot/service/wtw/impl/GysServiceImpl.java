package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.GysDao;
import com.seven.springboot.pojo.TPjGys;
import com.seven.springboot.service.wtw.GysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GysServiceImpl implements GysService {
    @Autowired
    private GysDao gysDao;

    public List<TPjGys> queryAll() {
        return gysDao.queryAll();
    }
}
