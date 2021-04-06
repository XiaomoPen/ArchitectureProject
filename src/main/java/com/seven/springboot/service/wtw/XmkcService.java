package com.seven.springboot.service.wtw;

import com.seven.springboot.pojo.TPjXmkc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface XmkcService {
    //查询所有
    public List<TPjXmkc> queryAll();
    //添加信息
    public void add(TPjXmkc tPjTbxx);
    //查询新增的一条数据
    public TPjXmkc finallys(String serial);
    //投标信息登记删除
    public void deletes(String serial);
    //投标信息登记审批状态修改
    public void updates(String serial);
    //投标信息登记审批状态修改
    public void updates1(String serial);
    //投标信息登记审批状态修改
    public void updates2(String serial);
    //投标信息登记根据项目名称模糊查询
    public List<TPjXmkc> selects(String name);
}
