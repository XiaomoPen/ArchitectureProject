package com.seven.springboot.service.tyh;

import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.pojo.TPsMyapply;
import com.seven.springboot.utils.RestContent;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MyapplyService {
    public List<TPsMyapply> selmyapp(String sss);

    public String xqmyapp(String type, String id);

    public Integer updateapp(String id, Integer jg);

    @Update("Update t_ps_myapply set myapply_urge= myapply_urge+1 where myapply_num=#{myapplyNum}")
    public Integer cuiban(@Param("myapplyNum") String id);

    public List<TPsMyapply> selmyapp2(String sss);

    public List<TPmUser> seluser();
}
