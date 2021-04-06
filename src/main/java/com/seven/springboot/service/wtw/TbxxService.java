package com.seven.springboot.service.wtw;

import com.seven.springboot.pojo.TPjTbxx;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TbxxService {
    //查询所有
    public List<TPjTbxx> queryAll();
    //添加信息
    public void tbxxAdd(TPjTbxx tPjTbxx);
    //查询新增的一条数据
    public TPjTbxx tbxxFinally(String tbxxBh);
    //投标信息登记删除
    public void tbxxDelete(String tbxxBh);
    //投标信息登记审批状态修改
    public void tbxxUpdate(String tbxxBh);
    //投标信息登记审批状态修改
    public void tbxxUpdate1(String tbxxBh);
    //投标信息登记审批状态修改
    public void tbxxUpdate2(String tbxxBh);
    //投标信息登记根据项目名称模糊查询
    public List<TPjTbxx> tbxxSelect(String tbxxName);
}
