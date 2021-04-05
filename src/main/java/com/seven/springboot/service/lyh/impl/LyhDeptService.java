package com.seven.springboot.service.lyh.impl;

import com.seven.springboot.mapper.lyh.LyhDeptDao;
import com.seven.springboot.pojo.TPmDepartment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhDeptService {

    @Resource
    private LyhDeptDao bs;


    public List<TPmDepartment> findAll(){
    return   bs.findAll();
    }
}
