package com.seven.springboot.service.wtw;

import com.seven.springboot.pojo.TPjZbwj;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ZbwjService {
    //查询所有
    public List<TPjZbwj> queryAll();
    //添加一条信息
    public void zbwjAdd(TPjZbwj tPjZbwj);
    //根据编号查询的一条数据
    public TPjZbwj zbwjFinally(String serial);
    //信息删除
    public void zbwjDelete(String serial);
    //信息审批状态修改
    public void zbwjUpdate(String serial);
    //信息审批状态修改
    public void zbwjUpdate1(String serial);
    //投标信息登记审批状态修改
    public void zbwjUpdate2(String serial);
    //根据项目名称模糊查询
    public List<TPjZbwj> zbwjSelect(String name);
}
