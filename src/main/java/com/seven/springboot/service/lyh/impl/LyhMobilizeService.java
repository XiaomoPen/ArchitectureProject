package com.seven.springboot.service.lyh.impl;

import com.seven.springboot.mapper.lyh.LyhMobilizeDao;
import com.seven.springboot.pojo.TPmMobilize;
import com.seven.springboot.service.lyh.MobilizeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhMobilizeService implements MobilizeService {

    @Resource
    private LyhMobilizeDao bs;

    public List<TPmMobilize> findAll() {
        return bs.findAll();
    }


    public List<TPmMobilize> findByName(String userName) {
        return bs.findByName(userName);
    }


    public List<TPmMobilize> findAll2(TPmMobilize mobilize) {
        return bs.findAll2(mobilize);
    }


    public Integer addMobilize(TPmMobilize mobilize) {
        return bs.addMobilize(mobilize);
    }


    public Integer addMyapply(TPmMobilize mobilize) {
        return bs.addMyapply(mobilize);
    }
}
