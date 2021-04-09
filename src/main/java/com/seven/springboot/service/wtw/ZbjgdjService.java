package com.seven.springboot.service.wtw;

import com.seven.springboot.pojo.TPjZbjgdj;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ZbjgdjService {
    //查询全部信息
    public List<TPjZbjgdj> queryAll();
    //添加信息
    public void add(TPjZbjgdj tPjZbjgdj);
    //根据编号查询的一条数据
    public TPjZbjgdj finallys(String serial);
    //删除信息
    public void delete(String serial);
    //修改审批状态
    public void update(String serial);
    //修改审批状态
    public void update1(String serial);
    //修改审批状态
    public void update2(String serial);
    //根据项目名称模糊查询
    public List<TPjZbjgdj> selects(String name);
}
