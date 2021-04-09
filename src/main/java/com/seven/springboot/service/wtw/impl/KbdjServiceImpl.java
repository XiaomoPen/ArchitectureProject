package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.KbdjDao;
import com.seven.springboot.pojo.TPjJzdsmx;
import com.seven.springboot.pojo.TPjKbdj;
import com.seven.springboot.service.wtw.KbdjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KbdjServiceImpl implements KbdjService {//开标登记
    @Autowired
    private KbdjDao kbdjDao;
    //查询全部信息
    public List<TPjKbdj> queryAll() {
        return kbdjDao.queryAll();
    }
    //添加信息
    public void kbdjAdd(TPjKbdj tPjZgzs) {
        kbdjDao.kbdjAdd(tPjZgzs);
    }
    //添加信息
    public void jzdsmxAdd(TPjJzdsmx tPjJzdsmx) {
        kbdjDao.jzdsmxAdd(tPjJzdsmx);
    }
    //根据编号查询的一条数据
    public TPjKbdj finallys(String serial) {
        return kbdjDao.finallys(serial);
    }
    //删除信息
    public void delete(String serial) {
        kbdjDao.delete(serial);
    }
    //修改审批状态
    public void update(String serial) {
        kbdjDao.update(serial);
    }
    //修改审批状态
    public void update1(String serial) {
        kbdjDao.update1(serial);
    }
    //修改审批状态
    public void update2(String serial) {
        kbdjDao.update2(serial);
    }
    //根据项目名称模糊查询
    public List<TPjKbdj> selects(String name) {
        return kbdjDao.selects(name);
    }
}
