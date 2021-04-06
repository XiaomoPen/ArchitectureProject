package com.seven.springboot.service.lyh;


import com.seven.springboot.mapper.lyh.LyhDepartureDao;
import com.seven.springboot.pojo.TPmDeparture;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface DepartureService {

    public List<TPmDeparture> findAll();

    public Integer addDeparture(TPmDeparture departure);

    public List<TPmDeparture> findAll2(TPmDeparture departure);

    public List<TPmDeparture> findById(String departureErial);

    public Integer addmyapply(TPmDeparture pmDeparture);

    public Integer deldeparture(String  departureErial);


}
