package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.TbxxDao;
import com.seven.springboot.pojo.TPjTbxx;
import com.seven.springboot.service.wtw.TbxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbxxServiceImpl implements TbxxService {
    @Autowired
    private TbxxDao tbxxDao;

    //投标信息登记查询所有
    public List<TPjTbxx> queryAll() {
        return tbxxDao.queryAll();
    }
    //投标信息添加
    public void tbxxAdd(TPjTbxx tPjTbxx) {
        tbxxDao.tbxxAdd(tPjTbxx);
    }
    //查询最后一条数据
    public TPjTbxx tbxxFinally() {
        return tbxxDao.tbxxFinally();
    }


}
