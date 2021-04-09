package com.seven.springboot.service.csp;

import com.seven.springboot.pojo.TCtKhfp;
import com.seven.springboot.pojo.TCtLxr;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TCtLxrService {

    //新增信息联系人
    public void addlxr(TCtLxr tCtLxr);

    //查询全部联系人列表
    public List<TCtLxr> queryAll();

    //根据编号联系人列表删除数据
    public void dellxr(String lxrBh);
}
