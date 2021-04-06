package com.seven.springboot.service.lyh;

import com.seven.springboot.pojo.TPmPositive;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PositiveService {


    public List<TPmPositive> findAll();
    public List<TPmPositive> findAll2(TPmPositive pmPositive);

    public Integer addMyapply(TPmPositive pmPositive);
    public Integer addPositive(TPmPositive pmPositive);

    public Integer delPositive(String positiveSerial);
}
