package com.seven.springboot.service.lyh;

import com.seven.springboot.pojo.TPmMobilize;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MobilizeService {


    public List<TPmMobilize> findAll();

    public List<TPmMobilize> findByName(String userName);

    public List<TPmMobilize> findAll2(TPmMobilize mobilize);

    public Integer addMobilize(TPmMobilize mobilize);

    public Integer addMyapply(TPmMobilize mobilize);
}
