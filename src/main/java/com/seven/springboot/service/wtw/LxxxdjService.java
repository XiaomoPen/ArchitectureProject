package com.seven.springboot.service.wtw;

import com.seven.springboot.pojo.TPjLxxxdj;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LxxxdjService {
    public List<TPjLxxxdj> queryAll();
}
