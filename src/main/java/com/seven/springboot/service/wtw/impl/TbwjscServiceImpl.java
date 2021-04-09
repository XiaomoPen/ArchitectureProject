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
    //查询全部信息
    public List<TPjTbwjsc> queryAll() {
        return tbwjscDao.queryAll();
    }
    //添加信息
    public void add(TPjTbwjsc tPjTbwjsc) {
        tbwjscDao.add(tPjTbwjsc);
    }
    //根据编号查询的一条数据
    public TPjTbwjsc finallys(String serial) {
        return tbwjscDao.finallys(serial);
    }
    //删除信息
    public void delete(String serial) {
        tbwjscDao.delete(serial);
    }
    //修改审批状态
    public void update(String serial) {
        tbwjscDao.update(serial);
    }
    //修改审批状态
    public void update1(String serial) {
        tbwjscDao.update1(serial);
    }
    //修改审批状态
    public void update2(String serial) {
        tbwjscDao.update2(serial);
    }
    //根据项目名称模糊查询
    public List<TPjTbwjsc> selects(String name) {
        return tbwjscDao.selects(name);
    }
}
