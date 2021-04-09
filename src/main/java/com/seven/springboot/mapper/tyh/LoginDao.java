package com.seven.springboot.mapper.tyh;

import com.seven.springboot.pojo.TPmLogin;
import com.seven.springboot.pojo.TPmUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface LoginDao {
    public TPmUser loginn(@Param("userJobNumber") String userJobNumber, @Param("userPassword") String loginPassword);

    @Select("select * from t_pm_login where login_password=#{loginPassword} and user_number=#{userNumber}")
    public TPmLogin suodatepaw(@Param("loginPassword") String loginPassword, @Param("userNumber") String userNumber);

    @Update("update t_pm_login set login_password=#{loginPassword} where user_number=#{userNumber}")
    public Integer updatepaw(@Param("userNumber") String userNumber, @Param("loginPassword") String xmima);
}
