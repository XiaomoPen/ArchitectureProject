package com.seven.springboot.service.csp.impl;

import com.seven.springboot.mapper.csp.TCtLxrDao;
import com.seven.springboot.service.csp.TCtLxrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TCtLxrServiceImpl implements TCtLxrService {

    @Autowired
    private TCtLxrDao tCtLxrDao;
}
