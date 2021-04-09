package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjGys;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GysDao {//供应商
    //查询所有数据
    @Select("select * from t_pj_gys")
    public List<TPjGys> queryAll();
}
