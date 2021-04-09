package com.seven.springboot.mapper.tyh;

import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.pojo.TPsApply;
import com.seven.springboot.pojo.TPsMyapply;
import com.seven.springboot.utils.RestContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface MyapplyDao {
    public List<TPsMyapply> selmyapp(@Param("myapplyNumber") String sss);

    @Select("select * from t_ps_apply where apply_num=#{applyNum}")
    public TPsApply xqmyappqj(@Param("applyNum") String id);

    @Update("update t_ps_myapply set myapply_state=1 where myapply_number=#{myapplyNumber}")
    public Integer updateapp(@Param("myapplyNumber") String id);

    @Update("update t_ps_myapply set myapply_state=2 where myapply_number=#{myapplyNumber}")
    public Integer updateapp2(@Param("myapplyNumber") String id);

    @Update("Update t_ps_myapply set myapply_urge= myapply_urge+1 where myapply_num=#{myapplyNum}")
    public Integer cuiban(@Param("myapplyNum") String id);

    public List<TPsMyapply> selmyapp2(@Param("myapplyNumber") String sss);

    @Select("select * from t_pm_user")
    public List<TPmUser> seluser();
}
