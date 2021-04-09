package com.seven.springboot.mapper.ly;

import com.seven.springboot.pojo.TPjEquipment;
import com.seven.springboot.vo.ly.ParamsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;

@Mapper
@Resource
public interface EquipmentDao {
    List<TPjEquipment> findEquipmentAll(@Param("paramsVo") ParamsVo paramsVo);

    void addEquipment(TPjEquipment equipment);
}
