package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjTbxx;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TbxxDao {

    @Select("select * from t_pj_tbxx")
    public List<TPjTbxx> queryAll();
}
