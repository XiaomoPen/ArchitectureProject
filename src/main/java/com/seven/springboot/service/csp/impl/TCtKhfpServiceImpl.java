package com.seven.springboot.service.csp.impl;

import com.seven.springboot.mapper.csp.TCtKhfpDao;
import com.seven.springboot.service.csp.TCtKhfpService;
import org.springframework.beans.factory.annotation.Autowired;

public class TCtKhfpServiceImpl implements TCtKhfpService {

    @Autowired
    private TCtKhfpDao tCtKhfpDao;
}
