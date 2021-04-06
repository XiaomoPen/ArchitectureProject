package com.seven.springboot.mapper.csp;

import com.seven.springboot.pojo.TCtKhfp;
import com.seven.springboot.pojo.TCtKhxx;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TCtKhfpDao {
    //查询全部分配列表,根据编号倒叙排列
    @Select("select * from t_ct_khfp ORDER by khfp_bh DESC")
    public List<TCtKhfp> queryAll();

    /*//查询所有客户信息列表并以录入时间降序排列并且无负责人编号查询
    @Select("select * from t_ct_khfp WHERE user_number is NULL ORDER by khxx_lrsj DESC")
    public List<TCtKhfpDao> queryNullAll();*/

    //根据分配表编号查询
    @Select("select * from t_ct_khfp where khfp_bh = #{khfpBh}")
    public List<TCtKhfp> queryId(@Param("khfpBh") String khfpBh);

    //模糊查询客户名称或负责人名称
    @Select("select * from t_ct_khfp WHERE khxx_xm LIKE CONCAT('%',#{khxxXm},'%') or " +
            "user_mc like CONCAT('%',#{khxxXm},'%') /*where user_number is NULL*/")
    public List<TCtKhfp> querymhcx(@Param("khxxXm") String khxxXm);

    //新增信息
    @Insert("insert into t_ct_khfp (khxx_bh, khxx_xm, khxx_khlx, khxx_khhy, user_number, kh_bh, user_mc)value " +
            "(#{khxxBh},#{khxxXm},#{khxxKhlx},#{khxxKhhy},#{userNumber},#{khBh},#{userMc})")
    public Integer addKhfp(TCtKhfp tCtKhfp);

    //根据编号删除数据
    @Delete("delete from t_ct_khfp where khfp_bh = #{khfpBh} ")
    public Integer delKhfp(@Param("khfpBh") String khfpBh);


}
