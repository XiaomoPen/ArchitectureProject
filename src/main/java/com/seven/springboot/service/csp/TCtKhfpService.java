package com.seven.springboot.service.csp;

import com.seven.springboot.pojo.TCtKhfp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TCtKhfpService {
    //新增信息客户分配信息
    public void addkhfp(TCtKhfp tCtKhfp);
    //查询全部客户分配列表
    public List<TCtKhfp> queryAll();
    //根据编号删除客户分配表的数据
    public void delKhxx(@Param("khfpBh") String khfpBh);
}
