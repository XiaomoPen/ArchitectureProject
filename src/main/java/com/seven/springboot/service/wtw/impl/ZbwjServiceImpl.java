package com.seven.springboot.service.wtw.impl;
import com.seven.springboot.mapper.wtw.ZbwjgmDao;
import com.seven.springboot.pojo.TPjZbwj;
import com.seven.springboot.service.wtw.ZbwjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZbwjServiceImpl implements ZbwjService {
    @Autowired
    private ZbwjgmDao zbwjgmDao;
    //查询全部信息
    public List<TPjZbwj> queryAll() {
        return zbwjgmDao.queryAll();
    }
    //添加信息
    public void zbwjAdd(TPjZbwj tPjZbwj) {
        zbwjgmDao.zbwjAdd(tPjZbwj);
    }
    //根据编号查询的一条数据
    public TPjZbwj zbwjFinally(String serial) {
        return zbwjgmDao.zbwjFinally(serial);
    }
    //删除信息
    public void zbwjDelete(String serial) {
        zbwjgmDao.zbwjDelete(serial);
    }
    //修改审批状态
    public void zbwjUpdate(String serial) {
        zbwjgmDao.zbwjUpdate(serial);
    }
    //修改审批状态
    public void zbwjUpdate1(String serial) {
        zbwjgmDao.zbwjUpdate1(serial);
    }
    //修改审批状态
    public void zbwjUpdate2(String serial) {
        zbwjgmDao.zbwjUpdate2(serial);
    }
    //根据项目名称模糊查询
    public List<TPjZbwj> zbwjSelect(String name) {
        return zbwjgmDao.zbwjSelect(name);
    }
}
