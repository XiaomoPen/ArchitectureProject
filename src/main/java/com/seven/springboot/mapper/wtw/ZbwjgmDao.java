package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjZbwj;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ZbwjgmDao {//招标文件购买
    //查询所有
    @Select("select * from t_pj_zbwj")
    public List<TPjZbwj> queryAll();
    //添加一条信息
    @Select("insert into t_pj_zbwj(zbwj_gmrq,zbwj_bsgmbh,zbwj_smmc,zbwj_xmlx,zbwj_jsdw,zbwj_zbwjf,zbwj_sqr,zbwj_bz,zbwj_spjg,tbxx_bh) values " +
            "(#{zbwjGmrq},#{zbwjBsgmbh},#{zbwjSmmc},#{zbwjXmlx},#{zbwjJsdw},#{zbwjZbwjf},#{zbwjSqr},#{zbwjBz},#{zbwjSpjg},#{tbxxBh})")
    public void zbwjAdd(TPjZbwj tPjZbwj);
    //根据编号查询的一条数据
    @Select("select * from t_pj_zbwj where zbwj_bsgmbh = #{serial}")
    public TPjZbwj zbwjFinally(String serial);
    //信息删除
    @Select("delete from t_pj_zbwj where zbwj_bsgmbh = #{serial}")
    public void zbwjDelete(String serial);
    //信息审批状态修改
    @Select("update t_pj_zbwj set zbwj_spjg = 1 where zbwj_bsgmbh = #{serial}")
    public void zbwjUpdate(String serial);
    //信息审批状态修改
    @Select("update t_pj_zbwj set zbwj_spjg = 2 where zbwj_bsgmbh = #{serial}")
    public void zbwjUpdate1(String serial);
    //投标信息登记审批状态修改
    @Select("update t_pj_zbwj set zbwj_spjg = 3 where zbwj_bsgmbh = #{serial}")
    public void zbwjUpdate2(String serial);
    //根据项目名称模糊查询
    @Select("select * from t_pj_zbwj where zbwj_smmc like concat('%',#{name},'%');")
    public List<TPjZbwj> zbwjSelect(String name);
}
