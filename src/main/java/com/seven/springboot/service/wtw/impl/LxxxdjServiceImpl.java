package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.LxxxdjDao;
import com.seven.springboot.pojo.TPjLxxxdj;
import com.seven.springboot.service.wtw.LxxxdjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LxxxdjServiceImpl implements LxxxdjService {
    @Autowired
    private LxxxdjDao lxxxdjDao;
    //查询所有立项信息
    public List<TPjLxxxdj> queryAll() {
        return lxxxdjDao.queryAll();
    }
}
