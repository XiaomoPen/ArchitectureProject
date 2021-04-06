package com.seven.springboot.service.lyh;

import com.seven.springboot.pojo.TPmUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    public List<TPmUser> findAll();

    public Integer adduser(TPmUser tPmUser);

    public List<TPmUser> gj(TPmUser tPmUser);

    public List<TPmUser> findByUserNumber(String userNumber);
}
