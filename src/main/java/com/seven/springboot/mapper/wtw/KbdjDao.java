package com.seven.springboot.mapper.wtw;

import com.seven.springboot.pojo.TPjJzdsmx;
import com.seven.springboot.pojo.TPjKbdj;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KbdjDao {//开标登记
    //查询全部信息
    @Select("select * from t_pj_kbdj")
    public List<TPjKbdj> queryAll();
    //添加信息
    @Select("insert into t_pj_kbdj(kbdj_rq,kbdj_bh,kbdj_xmmc,kbdj_xmlx,kbdj_kbsj,kbdj_kbdd,kbdj_lbjg,kbdj_pbjzz,kbdj_yzbr,kbdj_lrr,kbdj_bz,kbdj_spjg,tbxx_bh) values" +
            "(#{kbdjRq},#{kbdjBh},#{kbdjXmmc},#{kbdjXmlx},#{kbdjKbsj},#{kbdjKbdd},#{kbdjLbjg},#{kbdjPbjzz},#{kbdjYzbr},#{kbdjLrr},#{kbdjBz},#{kbdjSpjg},#{tbxxBh})")
    public void kbdjAdd(TPjKbdj tPjZgzs);

    @Select("insert into t_pj_jzdsmx(jzdsmx_gsmc,jzdsmx_tbbj,jzdsmx_pcl,jzdsmx_xfqk,jzdsmx_pm,jzdsmx_bz,jzdsmx_zt,kbdj_bh) values" +
            "(#{jzdsmxGsmc},#{jzdsmxTbbj},#{jzdsmxPcl},#{jzdsmxXfqk},#{jzdsmxPm},#{jzdsmxBz},#{jzdsmxZt},#{kbdjBh})")
    public void jzdsmxAdd(TPjJzdsmx tPjJzdsmx);

    //根据编号查询的一条数据
    @Select("select * from t_pj_kbdj where kbdj_bh = #{serial}")
    public TPjKbdj finallys(String serial);
    //删除信息
    @Select("delete from t_pj_kbdj where kbdj_bh = #{serial}")
    public void delete(String serial);
    //修改审批状态
    @Select("update t_pj_kbdj set kbdj_spjg = 1 where kbdj_bh = #{serial}")
    public void update(String serial);
    //修改审批状态
    @Select("update t_pj_kbdj set kbdj_spjg = 2 where kbdj_bh = #{serial}")
    public void update1(String serial);
    //修改审批状态
    @Select("update t_pj_kbdj set kbdj_spjg = 3 where kbdj_bh = #{serial}")
    public void update2(String serial);
    //根据项目名称模糊查询
    @Select("select * from t_pj_kbdj where kbdj_xmmc like concat('%',#{name},'%');")
    public List<TPjKbdj> selects(String name);
}
