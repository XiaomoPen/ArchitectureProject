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
    //查询全部信息
    public List<TPjZgzs> queryAll() {
        return zgzsDao.queryAll();
    }
    //添加信息
    public void add(TPjZgzs tPjZgzs) {
        zgzsDao.add(tPjZgzs);
    }
    //根据编号查询的一条数据
    public TPjZgzs finallys(String serial) {
        return zgzsDao.finallys(serial);
    }
    //删除信息
    public void delete(String serial) {
        zgzsDao.delete(serial);
    }
    //修改审批状态
    public void update(String serial) {
        zgzsDao.update(serial);
    }
    //修改审批状态
    public void update1(String serial) {
        zgzsDao.update1(serial);
    }
    //修改审批状态
    public void update2(String serial) {
        zgzsDao.update2(serial);
    }
    //根据项目名称模糊查询
    public List<TPjZgzs> selects(String name) {
        return zgzsDao.selects(name);
    }
}
