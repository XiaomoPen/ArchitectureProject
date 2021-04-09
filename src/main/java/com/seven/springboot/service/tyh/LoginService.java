package com.seven.springboot.service.tyh;

import com.seven.springboot.pojo.TPmLogin;
import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.utils.RestContent;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public TPmUser loginn(String name, String paw);

    public Integer soudatepaw(String loginPassword, String userNumber, String xmima);
}
