package com.seven.springboot.service.lyh.impl;

import com.seven.springboot.mapper.lyh.LyhPonsitiveDao;
import com.seven.springboot.pojo.TPmPositive;
import com.seven.springboot.service.lyh.PositiveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhPositiveService implements PositiveService {

    @Resource
    private LyhPonsitiveDao bs;




    public List<TPmPositive> findAll(){
        return bs.findAll();
    }


    public List<TPmPositive> findAll2(TPmPositive pmPositive) {
        return bs.findAll2(pmPositive);
    }


    public Integer addMyapply(TPmPositive pmPositive) {
        return bs.addMyapply(pmPositive);
    }


    public Integer addPositive(TPmPositive pmPositive) {
        return bs.addPositive(pmPositive);
    }


    public Integer delPositive(String positiveSerial) {
        return bs.delPositive(positiveSerial);
    }


}
