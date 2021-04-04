package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.TbxxDao;
import com.seven.springboot.pojo.TPjTbxx;
import com.seven.springboot.service.wtw.TbxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbxxServiceImpl implements TbxxService {
    @Autowired
    private TbxxDao tbxxDao;

    public List<TPjTbxx> queryAll() {
        return tbxxDao.queryAll();
    }



}
