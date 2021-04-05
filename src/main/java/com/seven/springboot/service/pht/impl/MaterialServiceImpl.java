package com.seven.springboot.service.pht.impl;

import com.seven.springboot.mapper.pht.MaterialDao;
import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.service.pht.MaterialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Resource
    private MaterialDao materialDao;
    
    public List<TPjMaterialContractDetailed> getMaterialContractDetailed() {
        return materialDao.getMaterialContractDetailed();
    }
    
}
