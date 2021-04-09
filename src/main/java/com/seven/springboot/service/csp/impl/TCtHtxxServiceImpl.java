package com.seven.springboot.service.csp.impl;

import com.seven.springboot.mapper.csp.TCtHtxxDao;
import com.seven.springboot.pojo.TCtHtxx;
import com.seven.springboot.service.csp.TCtHtxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCtHtxxServiceImpl implements TCtHtxxService {

    @Autowired
    private TCtHtxxDao tCtHtxxDao;
    //新增信息合同信息
    public void addhtxx(TCtHtxx tCtHtxx) {
        tCtHtxxDao.addhtxx(tCtHtxx);
    }
    //查询全部合同列表
    public List<TCtHtxx> queryAll() {
        return tCtHtxxDao.queryAll();
    }
    //根据编号删除合同信息表数据
    public void delhtxx(String htxxBh) {
        tCtHtxxDao.delhtxx(htxxBh);
    }
}
