package com.seven.springboot.mapper.csp;

import com.seven.springboot.pojo.TCtKhxx;
import com.seven.springboot.pojo.TPmUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

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

    //模糊查询客户名称或负责人名称,时间降序排列
    @Select("select * from t_ct_khxx WHERE khxx_xm LIKE CONCAT('%',#{khxxXm},'%') or " +
            "user_mc like CONCAT('%',#{khxxXm},'%') /*where user_number is NULL*/ ORDER by khxx_lrsj DESC")
    public List<TCtKhxx> querymhcx(@Param("khxxXm") String khxxXm);

    //新增信息
    @Insert("insert into t_ct_khxx (khxx_bh, khxx_xm, khxx_khlx, khxx_khhy, khxx_khly, khxx_khdj, khxx_khdh, khxx_lrsj, user_number, user_mc)value " +
            "(#{khxxBh},#{khxxXm},#{khxxKhlx},#{khxxKhhy},#{khxxKhly},#{khxxKhdj},#{khxxKhdh},#{khxxLrsj},#{userNumber},#{userMc})")
    public void addKhxx(TCtKhxx tCtKhxx);

    //根据编号删除数据
    @Delete("delete from t_ct_khxx where khxx_bh = #{khxxBh} ")
    public void delKhxx(@Param("khxxBh") String khxxBh);

    //查询客户名称或负责人名称，并在录入时间之前，时间降序排列
    @Select("select * from t_ct_khxx WHERE (khxx_xm LIKE CONCAT('%',#{khxxXm},'%')or user_mc like CONCAT('%',#{khxxXm},'%')) and khxx_lrsj < #{khxxLrsj} ORDER by khxx_lrsj DESC ")
    public List<TCtKhxx> mhcxsj(@Param("khxxXm") String khxxXm,@Param("khxxLrsj") Timestamp khxxLrsj);

    //查询录入时间之前,时间降序排列
    @Select("select * from t_ct_khxx WHERE khxx_lrsj < #{khxxLrsj} ORDER by khxx_lrsj DESC ")
    public List<TCtKhxx> sj(@Param("khxxLrsj") Timestamp khxxLrsj);

    //查询全部员工信息列表，用于前台搜索员工id和员工名称
    @Select("select * from t_pm_user ")
    public List<TPmUser> scuser();

    //用于后台接受到userNumber，查询取出对象的属性
    @Select("select * from t_pm_user where user_number = #{userNumber}")
    public List<TPmUser> scuserid(String userNumber);
}
