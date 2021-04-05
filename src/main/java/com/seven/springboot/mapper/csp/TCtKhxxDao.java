package com.seven.springboot.mapper.csp;

import com.seven.springboot.pojo.TCtKhxx;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TCtKhxxDao {

    //查询全部客户信息列表
    @Select("select * from t_ct_khxx ORDER by khxx_lrsj DESC")
    public List<TCtKhxx> queryAll();

    //查询所有客户信息列表并以录入时间降序排列并且无负责人编号查询
    @Select("select * from t_ct_khxx WHERE user_number is NULL ORDER by khxx_lrsj DESC")
    public List<TCtKhxx> queryNullAll();

    //根据登录的员工ID来查询负责的客户，返回给客户信息列表
    @Select("select * from t_ct_khxx where user_number = #{userNumber}")
    public List<TCtKhxx> queryIdAll(@Param("userNumber") String userNumber);

    //模糊查询客户名称或负责人名称,时间降序排列并且无负责人编号
    @Select("select * from t_ct_khxx WHERE khxx_xm LIKE CONCAT('%',#{khxxXm},'%') or " +
            "user_mc like CONCAT('%',#{khxxXm},'%') where user_number is NULL ORDER by khxx_lrsj DESC;")
    public List<TCtKhxx> querymhcx(@Param("khxxXm") String khxxXm);

    //新增信息
    @Insert("insert into t_ct_khxx (khxx_bh, khxx_xm, khxx_khlx, khxx_khhy, khxx_khly, khxx_khdj, khxx_khdh, khxx_lrsj, user_number, user_mc)value " +
            "(#{khxxBh},#{khxxXm},#{khxxKhlx},#{khxxKhhy},#{khxxKhly},#{khxxKhdj},#{khxxKhdh},#{khxxLrsj},#{userNumber},#{userMc})")
    public Integer addKhxx(TCtKhxx tCtKhxx);
}
