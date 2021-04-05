package com.seven.springboot.service.lyh.impl;

import com.seven.springboot.mapper.lyh.LyhUserDao;
import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.service.lyh.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhUserService implements UserService {

    @Resource
    LyhUserDao bs;

    public List<TPmUser> findAll() {
        return bs.findAll();
    }


    public Integer adduser(TPmUser tPmUser) {
        return bs.adduser(tPmUser);
    }


    public List<TPmUser> gj(TPmUser tPmUser) {
        return bs.gj(tPmUser);
    }


    public List<TPmUser> findByUserNumber(String userNumber) {
        return bs.findByUserNumber(userNumber);
    }
}
