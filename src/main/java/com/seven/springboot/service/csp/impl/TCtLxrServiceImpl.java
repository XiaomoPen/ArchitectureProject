package com.seven.springboot.service.csp.impl;

import com.seven.springboot.mapper.csp.TCtLxrDao;
import com.seven.springboot.pojo.TCtLxr;
import com.seven.springboot.service.csp.TCtLxrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCtLxrServiceImpl implements TCtLxrService {

    @Autowired
    private TCtLxrDao tCtLxrDao;

    //新增信息联系人
    public void addlxr(TCtLxr tCtLxr) {
        tCtLxrDao.addlxr(tCtLxr);
    }
    //查询全部联系人列表
    public List<TCtLxr> queryAll() {
        return tCtLxrDao.queryAll();
    }
    //根据编号联系人列表删除数据
    public void dellxr(String lxrBh) {
        tCtLxrDao.dellxr(lxrBh);
    }
}
