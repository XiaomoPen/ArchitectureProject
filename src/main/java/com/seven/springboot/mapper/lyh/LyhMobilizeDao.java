package com.seven.springboot.mapper.lyh;

import com.seven.springboot.pojo.TPmMobilize;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhMobilizeDao {

    public List<TPmMobilize> findAll();

    public List<TPmMobilize> findByName(String userName);

    public List<TPmMobilize> findAll2(TPmMobilize mobilize);

    public Integer addMobilize(TPmMobilize mobilize);

    public Integer addMyapply(TPmMobilize mobilize);



}
