package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjTbxx;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TbxxDao {
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
    //投标信息登记最后一条数据
    @Select("select * from t_pj_tbxx order by tbxx_id desc limit 1")
    public TPjTbxx tbxxFinally();

}
