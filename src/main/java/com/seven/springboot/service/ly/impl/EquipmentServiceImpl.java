package com.seven.springboot.service.ly.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seven.springboot.mapper.ly.EquipmentDao;
import com.seven.springboot.pojo.TPjEquipment;
import com.seven.springboot.service.ly.EquipmentService;
import com.seven.springboot.vo.ly.ParamsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentDao equipmentDao;

    @Override
    public PageInfo<TPjEquipment> findEquipmentAll(ParamsVo paramsVo) {
        PageHelper.startPage(paramsVo.getPage(), paramsVo.getLimit());
        return new PageInfo<>(equipmentDao.findEquipmentAll(paramsVo));
    }
}
