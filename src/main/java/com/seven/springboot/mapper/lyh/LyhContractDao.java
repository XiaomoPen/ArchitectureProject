package com.seven.springboot.mapper.lyh;

import com.seven.springboot.pojo.TPmContract;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LyhContractDao {
    //
    @Select("select * from t_pm_contract")
    public List<TPmContract> findAll();

    public Integer addContract(TPmContract tPmContract);

    public List<TPmContract> gj(TPmContract tPmContract);

    public Integer delContract(String contractNumber);
}
