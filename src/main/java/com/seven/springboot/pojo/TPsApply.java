package com.seven.springboot.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;



@AllArgsConstructor
@NoArgsConstructor
public class TPsApply {

  private String applyNum;
  private String applyType;
  private String userNumber;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Timestamp applyDate;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Timestamp applyTime;
  private Integer applyNumber;
  private String applyReason;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private String applyTheme;
  private Timestamp applyDatetime;


  public String getApplyNum() {
    return applyNum;
  }

  public void setApplyNum(String applyNum) {
    this.applyNum = applyNum;
  }


  public String getApplyType() {
    return applyType;
  }

  public void setApplyType(String applyType) {
    this.applyType = applyType;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public Timestamp getApplyDate() {
    return applyDate;
  }

  public void setApplyDate(Timestamp applyDate) {
    this.applyDate = applyDate;
  }


  public Timestamp getApplyTime() {
    return applyTime;
  }

  public void setApplyTime(Timestamp applyTime) {
    this.applyTime = applyTime;
  }


  public Integer getApplyNumber() {
    return applyNumber;
  }

  public void setApplyNumber(Integer applyNumber) {
    this.applyNumber = applyNumber;
  }


  public String getApplyReason() {
    return applyReason;
  }

  public void setApplyReason(String applyReason) {
    this.applyReason = applyReason;
  }


  public String getApplyTheme() {
    return applyTheme;
  }

  public void setApplyTheme(String applyTheme) {
    this.applyTheme = applyTheme;
  }


  public Timestamp getApplyDatetime() {
    return applyDatetime;
  }

  public void setApplyDatetime(Timestamp applyDatetime) {
    this.applyDatetime = applyDatetime;
  }

  public TPsMyapply tPsMyapply;

  public TPsMyapply gettPsMyapply() {
    return tPsMyapply;
  }

  public void settPsMyapply(TPsMyapply tPsMyapply) {
    this.tPsMyapply = tPsMyapply;
  }

  public TPmUser tPmUser;

  public TPmUser gettPmUser() {
    return tPmUser;
  }

  public void settPmUser(TPmUser tPmUser) {
    this.tPmUser = tPmUser;
  }
}
