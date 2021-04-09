package com.seven.springboot.service.csp;

import com.seven.springboot.pojo.TCtLxjl;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TCtLxjlService {

    //新增联系记录
    public void addlxjl(TCtLxjl tCtLxjl);

    //查询全部联系记录列表
    public List<TCtLxjl> queryAll();

    //根据编号删除联系记录表数据
    public void dellxjl(@Param("lxjlBh") String lxjlBh);
}
