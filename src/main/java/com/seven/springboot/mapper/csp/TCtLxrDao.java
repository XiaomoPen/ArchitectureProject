package com.seven.springboot.mapper.csp;

import com.seven.springboot.pojo.TCtLxjl;
import com.seven.springboot.pojo.TCtLxr;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TCtLxrDao {

    //查询全部联系人列表,根据编号倒叙排列
    @Select("select * from t_ct_lxr ORDER by lxr_bh DESC")
    public List<TCtLxr> queryAll();

    /*//查询所有客户信息列表并以录入时间降序排列并且无负责人编号查询
    @Select("select * from t_ct_khfp WHERE user_number is NULL ORDER by khxx_lrsj DESC")
    public List<TCtKhfpDao> queryNullAll();*/

    //根据联系人表编号查询
    @Select("select * from t_ct_lxr where lxr_bh = #{lxrBh}")
    public List<TCtLxr> queryId(@Param("lxrBh") String lxrBh);

    //模糊查询客户名称或联系人名称
    @Select("select * from t_ct_lxr WHERE lxr_xm LIKE CONCAT('%',#{lxrXm},'%') or " +
            "khxx_xm like CONCAT('%',#{lxrXm},'%') /*where user_number is NULL*/")
    public List<TCtLxr> querymhcx(@Param("lxrXm") String lxrXm);

    //新增信息
    @Insert("insert into t_ct_lxr (lxr_bh, khxx_bh, lxr_xm, lxr_dh, lxr_zw, lxr_yxl, lxr_zt,khxx_xm)value " +
            "(#{lxrBh},#{khxxBh},#{lxrXm},#{lxrDh},#{lxrZw},#{lxrYxl},#{lxrZt},#{khxxXm})")
    public Integer addLxr(TCtLxr tCtLxr);

    //根据编号删除数据
    @Delete("delete from t_ct_lxr where lxr_bh = #{lxrBh} ")
    public Integer delLxr(@Param("lxrBh") String lxrBh);

}
