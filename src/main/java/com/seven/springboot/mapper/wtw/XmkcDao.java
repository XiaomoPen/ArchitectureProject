package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjXmkc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface XmkcDao {//项目勘察
    //查询所有
    @Select("select * from t_pj_xmkc")
    public List<TPjXmkc> queryAll();
    //添加一条信息
    @Select("insert into t_pj_xmkc(xmkc_rq,xmkc_bh,xmkc_xmmc,\n" +
            "xmkc_cmlx,xmkc_jsdw,xmkc_cyry,xmkc_sqr,xmkc_kcqk,xmkc_bz,xmkc_spjg,tbxx_bh,user_number)" +
            " values(#{xmkcRq},#{xmkcBh},#{xmkcXmmc},#{xmkcCmlx},#{xmkcJsdw},#{xmkcCyry},#{xmkcSqr},#{xmkcKcqk},#{xmkcBz}," +
            "#{xmkcSpjg},#{tbxxBh},#{userNumber})")
    public void add(TPjXmkc tPjXmkc);
    //根据编号查询的一条数据
    @Select("select * from t_pj_xmkc where xmkc_bh = #{serial}")
    public TPjXmkc finallys(String serial);
    //删除信息
    @Select("delete from t_pj_xmkc where xmkc_bh = #{serial}")
    public void delete(String serial);
    //修改审批状态
    @Select("update t_pj_xmkc set xmkc_spjg = 1 where xmkc_bh = #{serial}")
    public void update(String serial);
    //修改审批状态
    @Select("update t_pj_xmkc set xmkc_spjg = 2 where xmkc_bh = #{serial}")
    public void update1(String serial);
    //修改审批状态
    @Select("update t_pj_xmkc set xmkc_spjg = 3 where xmkc_bh = #{serial}")
    public void update2(String serial);
    //根据项目名称模糊查询
    @Select("select * from t_pj_xmkc where xmkc_xmmc like concat('%',#{name},'%');")
    public List<TPjXmkc> selects(String name);
}
