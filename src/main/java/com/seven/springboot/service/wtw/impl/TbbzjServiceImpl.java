package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.TbbzjDao;
import com.seven.springboot.pojo.TPjTbbzjsq;
import com.seven.springboot.service.wtw.TbbzjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbbzjServiceImpl implements TbbzjService {
    @Autowired
    private TbbzjDao tbbzjDao;
    //查询全部信息
    public List<TPjTbbzjsq> queryAll() {
        return tbbzjDao.queryAll();
    }
    //添加信息
    public void add(TPjTbbzjsq tPjTbbzjsq) {
        tbbzjDao.add(tPjTbbzjsq);
    }
    //根据编号查询的一条数据
    public TPjTbbzjsq finallys(String serial) {
        return tbbzjDao.finallys(serial);
    }
    //删除信息
    public void delete(String serial) {
        tbbzjDao.delete(serial);
    }
    //修改审批状态
    public void update(String serial) {
        tbbzjDao.update(serial);
    }
    //修改审批状态
    public void update1(String serial) {
        tbbzjDao.update1(serial);
    }
    //修改审批状态
    public void update2(String serial) {
        tbbzjDao.update2(serial);
    }
    //根据项目名称模糊查询
    public List<TPjTbbzjsq> selects(String name) {
        return tbbzjDao.selects(name);
    }
}
