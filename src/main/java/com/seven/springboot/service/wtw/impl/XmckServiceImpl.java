package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.XmkcDao;
import com.seven.springboot.pojo.TPjXmkc;
import com.seven.springboot.service.wtw.XmkcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XmckServiceImpl implements XmkcService {
    @Autowired
    private XmkcDao xmkcDao;
    //查询全部信息
    public List<TPjXmkc> queryAll() {
        return xmkcDao.queryAll();
    }
    //添加信息
    public void add(TPjXmkc tPjTbxx) {
        xmkcDao.add(tPjTbxx);
    }
    //根据编号查询的一条数据
    public TPjXmkc finallys(String serial) {
        return xmkcDao.finallys(serial);
    }
    //删除信息
    public void deletes(String serial) {
        xmkcDao.delete(serial);
    }
    //修改审批状态
    public void updates(String serial) {
        xmkcDao.update(serial);
    }
    //修改审批状态
    public void updates1(String serial) {
        xmkcDao.update1(serial);
    }
    //修改审批状态
    public void updates2(String serial) {
        xmkcDao.update2(serial);
    }
    //根据项目名称模糊查询
    public List<TPjXmkc> selects(String name) {
        return xmkcDao.selects(name);
    }
}
