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
    //查询新增的一条数据
    public TPjTbxx tbxxFinally(String tbxxBh) {
        return tbxxDao.tbxxFinally(tbxxBh);
    }

    //删除数据
    public void tbxxDelete(String tbxxBh) {
        tbxxDao.tbxxDelete(tbxxBh);
    }
    //修改审批状态为待审批
    public void tbxxUpdate(String tbxxBh) {
        tbxxDao.tbxxUpdate(tbxxBh);
    }
    //修改审批状态为通过
    public void tbxxUpdate1(String tbxxBh) {
        tbxxDao.tbxxUpdate1(tbxxBh);
    }
    //修改审批状态为不通过
    public void tbxxUpdate2(String tbxxBh) {
        tbxxDao.tbxxUpdate2(tbxxBh);
    }
    //模糊查询
    public List<TPjTbxx> tbxxSelect(String tbxxName) {
        return tbxxDao.tbxxSelect(tbxxName);
    }

}
