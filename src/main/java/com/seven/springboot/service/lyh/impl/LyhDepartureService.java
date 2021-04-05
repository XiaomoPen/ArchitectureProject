package com.seven.springboot.service.lyh.impl;


import com.seven.springboot.mapper.lyh.LyhDepartureDao;
import com.seven.springboot.pojo.TPmDeparture;
import com.seven.springboot.service.lyh.DepartureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhDepartureService implements DepartureService {
    @Resource
    private LyhDepartureDao bs;



    public List<TPmDeparture> findAll() {
        return bs.findAll();
    }


    public Integer addDeparture(TPmDeparture departure) {
        return bs.addDeparture(departure);
    }


    public List<TPmDeparture> findAll2(TPmDeparture departure) {
        return bs.findAll2(departure);
    }


    public List<TPmDeparture> findById(String departureErial) {
        return bs.findById(departureErial);
    }


    public Integer addmyapply(TPmDeparture pmDeparture) {
        return bs.addmyapply(pmDeparture);
    }



    public Integer deldeparture(String  departureErial) {
        return bs.deldeparture(departureErial);
    }
}
