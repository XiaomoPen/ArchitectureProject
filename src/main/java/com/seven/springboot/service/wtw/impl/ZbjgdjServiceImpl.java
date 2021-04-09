package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.ZbjgdjDao;
import com.seven.springboot.pojo.TPjZbjgdj;
import com.seven.springboot.service.wtw.ZbjgdjService;
import com.seven.springboot.service.wtw.ZgzsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZbjgdjServiceImpl implements ZbjgdjService {
    @Autowired
    private ZbjgdjDao zbjgdjDao;
    //查询全部信息
    public List<TPjZbjgdj> queryAll() {
        return zbjgdjDao.queryAll();
    }
    //添加信息
    public void add(TPjZbjgdj tPjZbjgdj) {
        zbjgdjDao.add(tPjZbjgdj);
    }
    //根据编号查询的一条数据
    public TPjZbjgdj finallys(String serial) {
        return zbjgdjDao.finallys(serial);
    }
    //删除信息
    public void delete(String serial) {
        zbjgdjDao.delete(serial);
    }
    //修改审批状态
    public void update(String serial) {
        zbjgdjDao.update(serial);
    }
    //修改审批状态
    public void update1(String serial) {
        zbjgdjDao.update1(serial);
    }
    //修改审批状态
    public void update2(String serial) {
        zbjgdjDao.update2(serial);
    }
    //根据项目名称模糊查询
    public List<TPjZbjgdj> selects(String name) {
        return zbjgdjDao.selects(name);
    }
}
