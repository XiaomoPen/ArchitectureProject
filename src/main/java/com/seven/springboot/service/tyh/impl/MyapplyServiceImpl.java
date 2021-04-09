package com.seven.springboot.service.tyh.impl;

import com.seven.springboot.mapper.tyh.MyapplyDao;
import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.pojo.TPsApply;
import com.seven.springboot.pojo.TPsMyapply;
import com.seven.springboot.service.tyh.MyapplyService;
import com.seven.springboot.utils.RestContent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MyapplyServiceImpl implements MyapplyService {
    @Resource
    MyapplyDao myapplyDao;

    public List<TPsMyapply> selmyapp(String sss) {
        return myapplyDao.selmyapp(sss);
    }

    public String xqmyapp(String type, String id) {
        System.out.println(type);
        if (type.equals("请假")||type.equals("加班")||type.equals("出差")){
            String xqmyappqj= String.valueOf(myapplyDao.xqmyappqj(id));
            return xqmyappqj;
        }
        return null;
    }

    public Integer updateapp(String id,Integer jg) {
        if (jg==1){
            myapplyDao.updateapp(id);
            return 1;
        }else{
            myapplyDao.updateapp2(id);
            return 1;
        }
    }

    @Override
    public Integer cuiban(String id) {
        myapplyDao.cuiban(id);
        return 1;
    }

    @Override
    public List<TPsMyapply> selmyapp2(String sss) {
        return myapplyDao.selmyapp2(sss);
    }

    @Override
    public List<TPmUser> seluser() {
        return myapplyDao.seluser();
    }
}
