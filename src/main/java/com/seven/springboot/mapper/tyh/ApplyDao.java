package com.seven.springboot.mapper.tyh;

import com.seven.springboot.pojo.TPsApply;
import com.seven.springboot.pojo.TPsMyapply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface ApplyDao {
    @Select("select * from t_ps_apply")
    public List<TPsApply> getapply();

    public void addapply(@Param("applyNum") String applyNum, @Param("applyType") String applyType, @Param("userNumber") String userNumber, @Param("applyDate") Timestamp applyDate, @Param("applyTime") Timestamp applyTime, @Param("applyNumber") Integer applyNumber, @Param("applyReason") String applyReason);

    public void addapplyjb(@Param("applyNum") String applyNum, @Param("userNumber") String userNumber, @Param("applyDate") Timestamp applyDate, @Param("applyTime") Timestamp applyTime, @Param("applyNumber") Integer applyNumber);

    public void addapplycc(@Param("applyNum") String applyNum, @Param("userNumber") String userNumber, @Param("applyDate") Timestamp applyDate, @Param("applyTime") Timestamp applyTime, @Param("applyNumber") Integer applyNumber, @Param("applyTheme") String applyTheme, @Param("applyDatetime") Timestamp applyDatetime, @Param("applyReason") String applyReason);

    //新增审核
    public void addmyapply(TPsMyapply tPsMyapply);
}
