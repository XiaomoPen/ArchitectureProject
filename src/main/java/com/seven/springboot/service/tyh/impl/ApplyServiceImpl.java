package com.seven.springboot.service.tyh.impl;

import com.seven.springboot.mapper.tyh.ApplyDao;
import com.seven.springboot.pojo.TPsApply;
import com.seven.springboot.pojo.TPsMyapply;
import com.seven.springboot.service.tyh.ApplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class ApplyServiceImpl implements ApplyService {
    @Resource
    private ApplyDao applyDao;

    public List<TPsApply> getapply() {
        return applyDao.getapply();
    }

    public void addapply(String applyNum, String applyType, String userNumber, Timestamp applyDate, Timestamp applyTime, Integer applyNumber, String applyReason) {
        applyDao.addapply(applyNum,applyType,userNumber,applyDate,applyTime,applyNumber,applyReason);
    }

    public void addapplyjb(String applyNum, String userNumber, Timestamp applyDate, Timestamp applyTime, Integer applyNumber) {
        applyDao.addapplyjb(applyNum,userNumber,applyDate,applyTime,applyNumber);
    }

    public void addapplycc(String applyNum, String userNumber, Timestamp applyDate, Timestamp applyTime, Integer applyNumber, String applyTheme, Timestamp applyDatetime, String applyReason) {
        applyDao.addapplycc(applyNum,userNumber,applyDate,applyTime,applyNumber,applyTheme,applyDatetime,applyReason);
    }

    //新增请假审核表
    public void addmyapply(TPsMyapply tPsMyapply) {
        applyDao.addmyapply(tPsMyapply);
    }


}
