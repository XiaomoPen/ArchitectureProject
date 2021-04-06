package com.seven.springboot.mapper.lyh;

import com.seven.springboot.pojo.TPmDeparture;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhDepartureDao {

    public List<TPmDeparture> findAll();

    public Integer addDeparture(TPmDeparture departure);

    public List<TPmDeparture> findAll2(TPmDeparture departure);

    public List<TPmDeparture> findById(String departureErial);

    public Integer addmyapply(TPmDeparture pmDeparture);

    public Integer deldeparture(String  departureErial);
}



