package com.seven.springboot.service.lyh;


import com.seven.springboot.pojo.TPmContract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContractService {


    public List<TPmContract> findAll();


    public Integer addContract(TPmContract tPmContract);

    public List<TPmContract> gj(TPmContract tPmContract);

    public Integer delContract(String contractNumber);
}
