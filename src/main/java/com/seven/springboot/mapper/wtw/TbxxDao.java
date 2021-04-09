package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjTbxx;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TbxxDao {//投标信息
    //投标信息登记查询
    @Select("select * from t_pj_tbxx")
    public List<TPjTbxx> queryAll();
    //投标信息登记添加
    @Select("insert into t_pj_tbxx (tbxx_date,tbxx_bh,tbxx_name,tbxx_jj,\n" +
            "tbxx_dz,tbxx_xz,tbxx_lx,tbxx_fzr,tbxx_tbrq,tbxx_yjtbfy,tbxx_yjhtje,tbxx_jsdw," +
            "tbxx_lxr,tbxx_lxdh,tbxx_lrr,tbxx_spjg) " +
            "values (#{tbxxDate},#{tbxxBh},#{tbxxName},#{tbxxJj}," +
            "#{tbxxDz},#{tbxxXz},#{tbxxLx},#{tbxxFzr},#{tbxxTbrq},#{tbxxYjtbfy},#{tbxxYjhtje}," +
            "#{tbxxJsdw},#{tbxxLxr},#{tbxxLxdh},#{tbxxLrr},#{tbxxSpjg})\n")
    public void tbxxAdd(TPjTbxx tPjTbxx);
    //根据编号查询的一条数据
    @Select("select * from t_pj_tbxx where tbxx_bh = #{tbxxBh}")
    public TPjTbxx tbxxFinally(String tbxxBh);
    //投标信息登记删除
    @Select("delete from t_pj_tbxx where tbxx_bh = #{tbxxBh}")
    public void tbxxDelete(String tbxxBh);
    //投标信息登记审批状态修改
    @Select("update t_pj_tbxx set tbxx_spjg = 1 where tbxx_bh = #{tbxxBh}")
    public void tbxxUpdate(String tbxxBh);
    //投标信息登记审批状态修改
    @Select("update t_pj_tbxx set tbxx_spjg = 2 where tbxx_bh = #{tbxxBh}")
    public void tbxxUpdate1(String tbxxBh);
    //投标信息登记审批状态修改
    @Select("update t_pj_tbxx set tbxx_spjg = 3 where tbxx_bh = #{tbxxBh}")
    public void tbxxUpdate2(String tbxxBh);
    //根据项目名称模糊查询
    @Select("select * from t_pj_tbxx where tbxx_name like concat('%',#{tbxxName},'%');")
    public List<TPjTbxx> tbxxSelect(String tbxxName);

}
