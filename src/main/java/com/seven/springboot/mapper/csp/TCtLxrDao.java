package com.seven.springboot.mapper.csp;

import com.seven.springboot.pojo.TCtKhfp;
import com.seven.springboot.pojo.TCtLxr;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TCtLxrDao {

    //新增信息联系人
    @Insert("insert into t_ct_lxr (lxr_bh, khxx_bh,lxr_xm, lxr_dh, lxr_zw, lxr_yxl, lxr_zt,khxx_xm)value " +
            "(#{lxrBh},#{khxxBh},#{lxrXm},#{lxrDh},#{lxrZw},#{lxrYxl},#{lxrZt},#{khxxXm})")
    public void addlxr(TCtLxr tCtLxr);

    //查询全部联系人列表
    @Select("select * from t_ct_lxr ")
    public List<TCtLxr> queryAll();

    //根据编号联系人列表删除数据
    @Delete("delete from t_ct_lxr where lxr_bh = #{lxrBh} ")
    public void dellxr(@Param("lxrBh") String lxrBh);
}
