package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.TbwjscDao;
import com.seven.springboot.pojo.TPjTbwjsc;
import com.seven.springboot.service.wtw.TbwjscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbwjscServiceImpl implements TbwjscService {
    @Autowired
    private TbwjscDao tbwjscDao;
    public List<TPjTbwjsc> queryAll() {
        return tbwjscDao.queryAll();
    }

    public void add(TPjTbwjsc tPjTbwjsc) {
        tbwjscDao.add(tPjTbwjsc);
    }

    public TPjTbwjsc finallys(String serial) {
        return tbwjscDao.finallys(serial);
    }

    public void delete(String serial) {
        tbwjscDao.delete(serial);
    }

    public void update(String serial) {
        tbwjscDao.update(serial);
    }

    public void update1(String serial) {
        tbwjscDao.update1(serial);
    }

    public void update2(String serial) {
        tbwjscDao.update2(serial);
    }

    public List<TPjTbwjsc> selects(String name) {
        return tbwjscDao.selects(name);
    }
}
