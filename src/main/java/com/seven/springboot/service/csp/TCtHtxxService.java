package com.seven.springboot.service.csp;

import com.seven.springboot.pojo.TCtHtxx;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TCtHtxxService {

    //新增信息合同信息
    public void addhtxx(TCtHtxx tCtHtxx);

    //查询全部合同列表
    public List<TCtHtxx> queryAll();

    //根据编号删除合同信息表数据
    public void delhtxx(String htxxBh);
}
