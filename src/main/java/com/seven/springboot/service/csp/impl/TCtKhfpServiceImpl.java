package com.seven.springboot.service.csp.impl;

import com.seven.springboot.mapper.csp.TCtKhfpDao;
import com.seven.springboot.pojo.TCtKhfp;
import com.seven.springboot.service.csp.TCtKhfpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCtKhfpServiceImpl implements TCtKhfpService {


    @Autowired
    private TCtKhfpDao tCtKhfpDao;
    //新增信息客户分配信息
    public void addkhfp(TCtKhfp tCtKhfp) {
        tCtKhfpDao.addkhfp(tCtKhfp);
    }
    //查询全部客户分配列表
    public List<TCtKhfp> queryAll() {
        return tCtKhfpDao.queryAll();
    }
    //根据编号删除客户分配表的数据
    public void delKhxx(String khfpBh) {
        tCtKhfpDao.delKhfp(khfpBh);
    }
}
