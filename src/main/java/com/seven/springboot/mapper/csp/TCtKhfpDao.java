package com.seven.springboot.mapper.csp;

import com.seven.springboot.pojo.TCtKhfp;
import com.seven.springboot.pojo.TCtKhxx;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TCtKhfpDao {


    //新增信息客户分配信息
    @Insert("insert into t_ct_khfp (khfp_bh, khxx_xm,khxx_khlx, khxx_khhy, user_number, kh_bh, user_mc)value " +
            "(#{khfpBh},#{khxxXm},#{khxxKhlx},#{khxxKhhy},#{userNumber},#{khBh},#{userMc})")
    public void addkhfp(TCtKhfp tCtKhfp);

    //查询全部客户分配列表
    @Select("select * from t_ct_khfp ")
    public List<TCtKhfp> queryAll();

    //根据编号删除客户分配表的数据
    @Delete("delete from t_ct_khfp where khfp_bh = #{khfpBh} ")
    public void delKhfp(@Param("khfpBh") String khfpBh);
}
