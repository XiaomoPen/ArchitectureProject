package com.seven.springboot.service.ly;

import com.github.pagehelper.PageInfo;
import com.seven.springboot.pojo.TPjEquipment;
import com.seven.springboot.vo.ly.ParamsVo;
import org.apache.ibatis.annotations.Param;


public interface EquipmentService {
    PageInfo<TPjEquipment> findEquipmentAll(@Param("paramsVo") ParamsVo paramsVo);
}
