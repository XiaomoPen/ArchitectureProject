package com.seven.springboot.mapper.lyh;

import com.seven.springboot.pojo.TPmUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LyhUserDao {


    public List<TPmUser> findAll();


    @Insert("Insert into t_pm_user(user_number,user_Jobnumber,user_name,\n" +
            "        user_sex,user_birthday,user_intime,\n" +
            "        position_numbber,department_number,user_state)\n" +
            "         values(#{userName},#{userJobNumber},#{userName},\n" +
            "                #{userSex},#{userBirthday},#{userIntime},#{positionNumber},#{departmentNumber},0)")
    public Integer adduser(TPmUser tPmUser);


    public List<TPmUser> gj(TPmUser tPmUser);



    public List<TPmUser> findByUserNumber(String userNumber);
}
