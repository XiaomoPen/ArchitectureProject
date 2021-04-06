package com.seven.springboot.mapper.csp;

import com.seven.springboot.pojo.TCtHtxx;
import com.seven.springboot.pojo.TCtLxjl;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TCtLxjlDao {

    //查询全部联系记录列表,根据编号倒叙排列
    @Select("select * from t_ct_lxjl ORDER by lxjl_bh DESC")
    public List<TCtLxjl> queryAll();

    /*//查询所有客户信息列表并以录入时间降序排列并且无负责人编号查询
    @Select("select * from t_ct_khfp WHERE user_number is NULL ORDER by khxx_lrsj DESC")
    public List<TCtKhfpDao> queryNullAll();*/

    //根据联系记录表编号查询
    @Select("select * from t_ct_lxjl where lxjl_bh = #{lxjlBh}")
    public List<TCtLxjl> queryId(@Param("lxjlBh") String lxjlBh);

    //模糊查询客户名称或负责人名称
    @Select("select * from t_ct_lxjl WHERE khxx_xm LIKE CONCAT('%',#{khxxXm},'%') or " +
            "user_mc like CONCAT('%',#{khxxXm},'%') /*where user_number is NULL*/")
    public List<TCtLxjl> querymhcx(@Param("khxxXm") String khxxXm);

    //新增信息
    @Insert("insert into t_ct_lxjl (lxjl_bh, khxx_xm, user_number, lxjl_jd, lxjl_sj, lxjl_fs, lxjl_xq,lxjl_xcsj,lxjl_xcmb,user_mc,khxx_bh)value " +
            "(#{lxjlBh},#{khxxXm},#{userNumber},#{lxjlJd},#{lxjlSj},#{lxjlFs},#{lxjlXq},#{lxjlXcsj},#{lxjlXcmb},#{userMc},#{khxxBh})")
    public Integer addLxjl(TCtLxjl tCtLxjl);

    //根据编号删除数据
    @Delete("delete from t_ct_lxjl where htxx_bh = #{lxjlBh} ")
    public Integer delLxjl(@Param("lxjlBh") String lxjlBh);

}
