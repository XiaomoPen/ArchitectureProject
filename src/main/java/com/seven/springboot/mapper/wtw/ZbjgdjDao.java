package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjZbjgdj;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ZbjgdjDao {//招标结果登记
    //查询全部信息
    @Select("select * from t_pj_zbjgdj")
    public List<TPjZbjgdj> queryAll();
    //添加信息
    @Select("insert into t_pj_zbjgdj(zbjgdj_xmmc,zbjgdj_xmlx,zbjgdj_zbdw,zbjgdj_zbje,zbjgdj_djr,zbjgdj_djsj,zbjgdj_splc,tbxx_bh) values" +
            "(#{zbjgdjXmmc},#{zbjgdjXmlx},#{zbjgdjZbdw},#{zbjgdjZbje},#{zbjgdjDjr},#{zbjgdjDjsj},#{zbjgdjSplc},#{tbxxBh})")
    public void add(TPjZbjgdj tPjZbjgdj);
    //根据编号查询的一条数据
    @Select("select * from t_pj_zbjgdj where zbjgdj_id = #{serial}")
    public TPjZbjgdj finallys(String serial);
    //删除信息
    @Select("delete from t_pj_zbjgdj where zbjgdj_id = #{serial}")
    public void delete(String serial);
    //修改审批状态
    @Select("update t_pj_zbjgdj set zbjgdj_splc = 1 where zbjgdj_id = #{serial}")
    public void update(String serial);
    //修改审批状态
    @Select("update t_pj_zbjgdj set zbjgdj_splc = 2 where zbjgdj_id = #{serial}")
    public void update1(String serial);
    //修改审批状态
    @Select("update t_pj_zbjgdj set zbjgdj_splc = 3 where zbjgdj_id = #{serial}")
    public void update2(String serial);
    //根据项目名称模糊查询
    @Select("select * from t_pj_zbjgdj where zbjgdj_xmmc like concat('%',#{name},'%');")
    public List<TPjZbjgdj> selects(String name);
}
