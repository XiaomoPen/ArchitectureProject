package com.seven.springboot.service.wtw;

import com.seven.springboot.pojo.TPjGys;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GysService {
    public List<TPjGys> queryAll();
}
