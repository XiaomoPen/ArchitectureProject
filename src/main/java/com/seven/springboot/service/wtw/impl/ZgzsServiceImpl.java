package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.ZgzsDao;
import com.seven.springboot.pojo.TPjZbwj;
import com.seven.springboot.pojo.TPjZgzs;
import com.seven.springboot.service.wtw.ZbwjService;
import com.seven.springboot.service.wtw.ZgzsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZgzsServiceImpl implements ZgzsService {
    @Autowired
    private ZgzsDao zgzsDao;


    public List<TPjZgzs> queryAll() {
        return zgzsDao.queryAll();
    }

    public void add(TPjZgzs tPjZgzs) {
        zgzsDao.add(tPjZgzs);
    }

    public TPjZgzs finallys(String serial) {
        return zgzsDao.finallys(serial);
    }

    public void delete(String serial) {
        zgzsDao.delete(serial);
    }

    public void update(String serial) {
        zgzsDao.update(serial);
    }

    public void update1(String serial) {
        zgzsDao.update1(serial);
    }

    public void update2(String serial) {
        zgzsDao.update2(serial);
    }

    public List<TPjZgzs> selects(String name) {
        return zgzsDao.selects(name);
    }
}
