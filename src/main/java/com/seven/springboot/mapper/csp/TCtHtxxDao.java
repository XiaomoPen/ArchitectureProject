package com.seven.springboot.mapper.csp;

import com.seven.springboot.pojo.TCtHtxx;
import com.seven.springboot.pojo.TCtKhxx;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TCtHtxxDao {

    //查询全部合同列表,根据编号倒叙排列
    @Select("select * from t_ct_htxx ORDER by htxx_bh DESC")
    public List<TCtHtxx> queryAll();

    /*//查询所有客户信息列表并以录入时间降序排列并且无负责人编号查询
    @Select("select * from t_ct_khfp WHERE user_number is NULL ORDER by khxx_lrsj DESC")
    public List<TCtKhfpDao> queryNullAll();*/

    //根据合同表编号查询
    @Select("select * from t_ct_htxx where khfp_bh = #{htxxBh}")
    public List<TCtHtxx> queryId(@Param("htxxBh") String htxxBh);

    //模糊查询客户名称或负责人名称
    @Select("select * from t_ct_htxx WHERE khxx_xm LIKE CONCAT('%',#{khxxXm},'%') or " +
            "user_mc like CONCAT('%',#{khxxXm},'%') /*where user_number is NULL*/")
    public List<TCtHtxx> querymhcx(@Param("khxxXm") String khxxXm);

    //新增信息
    @Insert("insert into t_ct_htxx (htxx_bh, htxx_mc, htxx_qdrq, khxx_xm, user_number, thxx_htje, htxx_bz,kh_bh,user_mc)value " +
            "(#{htxxBh},#{htxxMc},#{htxxQdrq},#{khxxXm},#{userNumber},#{thxxHtje},#{htxxBz},#{khBh},#{userMc})")
    public Integer addHtxx(TCtHtxx tCtHtxx);

    //根据编号删除数据
    @Delete("delete from t_ct_htxx where htxx_bh = #{htxxBh} ")
    public Integer delHtxx(@Param("htxxBh") String htxxBh);

}
