package com.seven.springboot.mapper.lyh;

import com.seven.springboot.pojo.TPmDepartment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LyhDeptDao {

    @Select("select * from t_pm_department")
    public List<TPmDepartment> findAll();
}
