package com.seven.springboot.service.csp.impl;

import com.seven.springboot.mapper.csp.TCtKhxxDao;
import com.seven.springboot.pojo.TCtKhxx;
import com.seven.springboot.service.csp.TCtKhxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TCtKhxxServiceImpl implements TCtKhxxService {

    @Autowired
    private TCtKhxxDao tCtKhxxDao;

    //查询全部客户信息列表
    public List<TCtKhxx> queryAll() {
        return tCtKhxxDao.queryAll();
    }
    //查询所有客户信息列表并以录入时间降序排列并且无负责人编号查询
    public List<TCtKhxx> queryNullAll() {
        return tCtKhxxDao.queryNullAll();
    }
    //根据登录的员工ID来查询负责的客户，返回给客户信息列表
    public List<TCtKhxx> queryIdAll(String userNumber) {
        return tCtKhxxDao.queryIdAll(userNumber);
    }
    //模糊查询客户名称或负责人名称,时间降序排列
    public List<TCtKhxx> querymhcx(String khxxXm) {
        return tCtKhxxDao.querymhcx(khxxXm);
    }
    //新增信息
    public Integer addKhxx(TCtKhxx tCtKhxx) {
        return tCtKhxxDao.addKhxx(tCtKhxx);
    }

    public Integer delKhxx(String khxxBh) {
        return tCtKhxxDao.delKhxx(khxxBh);
    }
}
