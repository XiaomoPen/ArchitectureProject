package com.seven.springboot.service.tyh;

import com.seven.springboot.pojo.TPsApply;
import com.seven.springboot.pojo.TPsMyapply;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public interface ApplyService {
    public List<TPsApply> getapply();

    public void addapply(String applyNum, String applyType, String userNumber, Timestamp applyDate, Timestamp applyTime, Integer applyNumber, String applyReason);

    public void addapplyjb(String applyNum, String userNumber, Timestamp applyDate, Timestamp applyTime, Integer applyNumber);

    public void addapplycc(String applyNum, String userNumber, Timestamp applyDate, Timestamp applyTime, Integer applyNumber, String applyTheme, Timestamp applyDatetime, String applyReason);

    public void addmyapply(TPsMyapply tPsMyapply);
}
