package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjTbwjsc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TbwjscDao {//投标文件上传
    //查询全部信息
    @Select("select * from t_pj_tbwjsc")
    public List<TPjTbwjsc> queryAll();
    //添加信息
    @Select("insert into t_pj_tbwjsc(tbwjsc_rq,thwjsc_tbbh,tbwjsc_xmmc,tbwjsc_xmlx,tbwjsc_jsdw,tbwjsc_tbje,tbwjsc_sqr,tbwjsc_tbnr,tbwjsc_spjg,tbxx_bh) values" +
            "(#{tbwjscRq},#{thwjscTbbh},#{tbwjscXmmc},#{tbwjscXmlx},#{tbwjscJsdw},#{tbwjscTbje},#{tbwjscSqr},#{tbwjscTbnr},#{tbwjscSpjg},#{tbxxBh})")
    public void add(TPjTbwjsc tPjTbwjsc);
    //根据编号查询的一条数据
    @Select("select * from t_pj_tbwjsc where thwjsc_tbbh = #{serial}")
    public TPjTbwjsc finallys(String serial);
    //删除信息
    @Select("delete from t_pj_tbwjsc where thwjsc_tbbh = #{serial}")
    public void delete(String serial);
    //修改审批状态
    @Select("update t_pj_tbwjsc set tbwjsc_spjg = 1 where thwjsc_tbbh = #{serial}")
    public void update(String serial);
    //修改审批状态
    @Select("update t_pj_tbwjsc set tbwjsc_spjg = 2 where thwjsc_tbbh = #{serial}")
    public void update1(String serial);
    //修改审批状态
    @Select("update t_pj_tbwjsc set tbwjsc_spjg = 3 where thwjsc_tbbh = #{serial}")
    public void update2(String serial);
    //根据项目名称模糊查询
    @Select("select * from t_pj_tbwjsc where tbwjsc_xmmc like concat('%',#{name},'%');")
    public List<TPjTbwjsc> selects(String name);
}
