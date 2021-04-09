package com.seven.springboot.service.csp.impl;

import com.seven.springboot.mapper.csp.TCtLxjlDao;
import com.seven.springboot.pojo.TCtLxjl;
import com.seven.springboot.service.csp.TCtLxjlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCtLxjlServiceImpl implements TCtLxjlService {

    @Autowired
    private TCtLxjlDao tCtLxjlDao;
    //新增联系记录
    public void addlxjl(TCtLxjl tCtLxjl) {
        tCtLxjlDao.addlxjl(tCtLxjl);
    }
    //查询全部联系记录列表
    public List<TCtLxjl> queryAll() {
        return tCtLxjlDao.queryAll();
    }
    //根据编号删除联系记录表数据
    public void dellxjl(String lxjlBh) {
        tCtLxjlDao.dellxjl(lxjlBh);
    }
}
