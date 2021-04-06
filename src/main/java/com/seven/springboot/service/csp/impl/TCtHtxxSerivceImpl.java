package com.seven.springboot.service.csp.impl;

import com.seven.springboot.mapper.csp.TCtHtxxDao;
import com.seven.springboot.service.csp.TCtHtxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TCtHtxxSerivceImpl implements TCtHtxxService {

    @Autowired
    private TCtHtxxDao tCtHtxxDao;


}
