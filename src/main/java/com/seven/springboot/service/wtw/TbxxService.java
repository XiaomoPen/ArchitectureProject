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
    //查询最后一条数据
    public TPjTbxx tbxxFinally();
}
