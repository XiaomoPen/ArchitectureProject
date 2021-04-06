package com.seven.springboot.service.lyh.impl;

import com.seven.springboot.mapper.lyh.LyhContractDao;
import com.seven.springboot.pojo.TPmContract;
import com.seven.springboot.service.lyh.ContractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhContractService implements ContractService {

    @Resource
    private LyhContractDao bs;



    public List<TPmContract> findAll(){
        return bs.findAll();
    }


    public Integer addContract(TPmContract tPmContract) {
     return    bs.addContract(tPmContract);

    }


    public List<TPmContract> gj(TPmContract tPmContract) {
        return bs.gj(tPmContract);
    }


    public Integer delContract(String contractNumber) {
      return   bs.delContract(contractNumber);
    }
}
