package com.seven.springboot.service.lyh;

import com.seven.springboot.pojo.TPmDepartment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {

    public List<TPmDepartment> findAll();
}
