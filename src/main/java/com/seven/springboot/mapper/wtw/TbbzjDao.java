package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjTbbzjsq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TbbzjDao {//投标保证金
    //查询全部信息
    @Select("select * from t_pj_tbbzjsq")
    public List<TPjTbbzjsq> queryAll();
    //添加信息
    @Select("insert into t_pj_tbbzjsq(tbbzjsq_bh,tbbzjsq_xmmc,tbbzjsq_xmlx,tbbzjsq_sqdw,tbbzjsq_khh,tbbzjsq_zh,tbbzjsq_bzjje,tbbzjsq_jkrq,tbbzjsq_yjthrq,tbbzjsq_sqr,tbbzjsq_bz,tbbzjsq_spjg,tbxx_bh) values" +
            "(#{tbbzjsqBh},#{tbbzjsqXmmc},#{tbbzjsqXmlx},#{tbbzjsqSqdw},#{tbbzjsqKhh},#{tbbzjsqZh},#{tbbzjsqBzjje},#{tbbzjsqJkrq},#{tbbzjsqYjthrq},#{tbbzjsqSqr},#{tbbzjsqBz},#{tbbzjsqSpjg},#{tbxxBh})")
    public void add(TPjTbbzjsq tPjTbbzjsq);
    //根据编号查询的一条数据
    @Select("select * from t_pj_tbbzjsq where tbbzjsq_bh = #{serial}")
    public TPjTbbzjsq finallys(String serial);
    //删除信息
    @Select("delete from t_pj_tbbzjsq where tbbzjsq_bh = #{serial}")
    public void delete(String serial);
    //修改审批状态
    @Select("update t_pj_tbbzjsq set tbbzjsq_spjg = 1 where tbbzjsq_bh = #{serial}")
    public void update(String serial);
    //修改审批状态
    @Select("update t_pj_tbbzjsq set tbbzjsq_spjg = 2 where tbbzjsq_bh = #{serial}")
    public void update1(String serial);
    //修改审批状态
    @Select("update t_pj_tbbzjsq set tbbzjsq_spjg = 3 where tbbzjsq_bh = #{serial}")
    public void update2(String serial);
    //根据项目名称模糊查询
    @Select("select * from t_pj_tbbzjsq where tbbzjsq_xmmc like concat('%',#{name},'%');")
    public List<TPjTbbzjsq> selects(String name);

}
