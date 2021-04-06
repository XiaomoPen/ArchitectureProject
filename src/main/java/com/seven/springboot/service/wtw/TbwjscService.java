package com.seven.springboot.service.wtw;

import com.seven.springboot.pojo.TPjTbwjsc;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TbwjscService {
    //查询全部信息
    public List<TPjTbwjsc> queryAll();
    //添加信息
    public void add(TPjTbwjsc tPjTbwjsc);
    //根据编号查询的一条数据
    public TPjTbwjsc finallys(String serial);
    //删除信息
    public void delete(String serial);
    //修改审批状态
    public void update(String serial);
    //修改审批状态
    public void update1(String serial);
    //修改审批状态
    public void update2(String serial);
    //根据项目名称模糊查询
    public List<TPjTbwjsc> selects(String name);
}
