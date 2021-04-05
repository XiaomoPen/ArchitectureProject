package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjLxxxdj;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LxxxdjDao {
    @Select("select * from t_pj_lxxxdj")
    public List<TPjLxxxdj> queryAll();

}
