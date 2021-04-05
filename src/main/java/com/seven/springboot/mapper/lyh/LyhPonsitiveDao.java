package com.seven.springboot.mapper.lyh;


import com.seven.springboot.pojo.TPmPositive;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhPonsitiveDao {


    public List<TPmPositive> findAll();

    public List<TPmPositive> findAll2(TPmPositive pmPositive);
    public Integer addPositive(TPmPositive pmPositive);

    public Integer addMyapply(TPmPositive pmPositive);

    public Integer delPositive(String positiveSerial);
}
