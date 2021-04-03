package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPsApply {

  private String applyNum;
  private String applyType;
  private String userNumber;
  private Timestamp applyDate;
  private Timestamp applyTime;
  private Integer applyNumber;
  private String applyReason;
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

}
