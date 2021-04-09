package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjZgzs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ZgzsDao {//中标
    //查询全部信息
    @Select("select * from t_pj_zgzs")
    public List<TPjZgzs> queryAll();
    //添加信息
    @Select("insert into t_pj_zgzs(zgzs_rq,zgzs_zsbh,zgzs_xmmc,zgzs_xmlx,zgzs_jsdw,zgzs_sqr,zgzs_bz,zgzs_spjg,tbxx_bh) values" +
            "(#{zgzsRq},#{zgzsZsbh},#{zgzsXmmc},#{zgzsXmlx},#{zgzsJsdw},#{zgzsSqr},#{zgzsBz},#{zgzsSpjg},#{tbxxBh})")
    public void add(TPjZgzs tPjZgzs);
    //根据编号查询的一条数据
    @Select("select * from t_pj_zgzs where zgzs_zsbh = #{serial}")
    public TPjZgzs finallys(String serial);
    //删除信息
    @Select("delete from t_pj_zgzs where zgzs_zsbh = #{serial}")
    public void delete(String serial);
    //修改审批状态
    @Select("update t_pj_zgzs set zgzs_spjg = 1 where zgzs_zsbh = #{serial}")
    public void update(String serial);
    //修改审批状态
    @Select("update t_pj_zgzs set zgzs_spjg = 2 where zgzs_zsbh = #{serial}")
    public void update1(String serial);
    //修改审批状态
    @Select("update t_pj_zgzs set zgzs_spjg = 3 where zgzs_zsbh = #{serial}")
    public void update2(String serial);
    //根据项目名称模糊查询
    @Select("select * from t_pj_zgzs where zgzs_xmmc like concat('%',#{name},'%');")
    public List<TPjZgzs> selects(String name);
}
