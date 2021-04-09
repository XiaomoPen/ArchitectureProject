package com.seven.springboot.service.tyh.impl;

import com.seven.springboot.mapper.tyh.LoginDao;
import com.seven.springboot.pojo.TPmLogin;
import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.service.tyh.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginDao loginDao;

    public TPmUser loginn(String name, String paw) {
        return loginDao.loginn(name, paw);
    }

    public Integer soudatepaw(String loginPassword,String userNumber,String xmima) {
        TPmLogin suodatepaw = loginDao.suodatepaw(loginPassword, userNumber);
        if(suodatepaw!=null){
            loginDao.updatepaw(userNumber,xmima);
            return 1;
        }else{
            return 2;
        }
    }
}
