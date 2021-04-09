package com.seven.springboot.mapper.csp;

import com.seven.springboot.pojo.TCtHtxx;
import com.seven.springboot.pojo.TCtLxr;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TCtHtxxDao {

    //新增信息合同信息
    @Insert("insert into t_ct_htxx (htxx_bh, htxx_mc,htxx_qdrq, khxx_xm, user_number, thxx_htje, htxx_bz,kh_bh,user_mc)value " +
            "(#{htxxBh},#{htxxMc},#{htxxQdrq},#{khxxXm},#{userNumber},#{thxxHtje},#{htxxBz},#{khBh},#{userMc})")
    public void addhtxx(TCtHtxx tCtHtxx);

    //查询全部合同列表
    @Select("select * from t_ct_htxx ")
    public List<TCtHtxx> queryAll();

    //根据编号删除合同信息表数据
    @Delete("delete from t_ct_htxx where lxr_bh = #{htxxBh} ")
    public void delhtxx(@Param("htxxBh") String htxxBh);

}
