package com.seven.springboot.mapper.csp;

import com.seven.springboot.pojo.TCtLxjl;
import com.seven.springboot.pojo.TCtLxr;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TCtLxjlDao {


    //新增联系记录
    @Insert("insert into t_ct_lxjl (lxjl_bh, khxx_xm,user_number, lxjl_jd, lxjl_sj, lxjl_fs, lxjl_xq,lxjl_xcsj,lxjl_xcmb,user_mc,khxx_bh)value " +
            "(#{lxjlBh},#{khxxXm},#{userNumber},#{lxjlJd},#{lxjlSj},#{lxjlFs},#{lxjlXq},#{lxjlXcsj},#{lxjlXcmb},#{userMc},#{khxxBh})")
    public void addlxjl(TCtLxjl tCtLxjl);

    //查询全部联系记录列表
    @Select("select * from t_ct_lxjl ")
    public List<TCtLxjl> queryAll();

    //根据编号删除联系记录表数据
    @Delete("delete from t_ct_lxjl where lxjl_bh = #{lxjlBh} ")
    public void dellxjl(@Param("lxjlBh") String lxjlBh);
}
