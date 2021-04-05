package com.seven.springboot.service.csp.impl;

import com.seven.springboot.mapper.csp.TCtLxjlDao;
import com.seven.springboot.service.csp.TCtLxjlService;
import org.springframework.beans.factory.annotation.Autowired;

public class TCtLxjlServiceImpl implements TCtLxjlService {

    @Autowired
    private TCtLxjlDao tCtLxjlDao;
}
