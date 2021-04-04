package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPmMobilize {

  private String mobilizeSerial;
  private String userNumber;
  private String userName;
  private String mobilizeLeix;
  private String mobilizeDept;
  private String mobilizeGw;
  private String deptNumber;
  private String deptNote;
  private Timestamp deptTime;
  private Integer mobilizeState;


  public String getMobilizeSerial() {
    return mobilizeSerial;
  }

  public void setMobilizeSerial(String mobilizeSerial) {
    this.mobilizeSerial = mobilizeSerial;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getMobilizeLeix() {
    return mobilizeLeix;
  }

  public void setMobilizeLeix(String mobilizeLeix) {
    this.mobilizeLeix = mobilizeLeix;
  }


  public String getMobilizeDept() {
    return mobilizeDept;
  }

  public void setMobilizeDept(String mobilizeDept) {
    this.mobilizeDept = mobilizeDept;
  }


  public String getMobilizeGw() {
    return mobilizeGw;
  }

  public void setMobilizeGw(String mobilizeGw) {
    this.mobilizeGw = mobilizeGw;
  }


  public String getDeptNumber() {
    return deptNumber;
  }

  public void setDeptNumber(String deptNumber) {
    this.deptNumber = deptNumber;
  }


  public String getDeptNote() {
    return deptNote;
  }

  public void setDeptNote(String deptNote) {
    this.deptNote = deptNote;
  }


  public Timestamp getDeptTime() {
    return deptTime;
  }

  public void setDeptTime(Timestamp deptTime) {
    this.deptTime = deptTime;
  }


  public Integer getMobilizeState() {
    return mobilizeState;
  }

  public void setMobilizeState(Integer mobilizeState) {
    this.mobilizeState = mobilizeState;
  }

}
