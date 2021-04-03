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
  private String positionNumber;
  private String departmentNumber;
  private String mobilizeNote;
  private Timestamp mobilizeTime;
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


  public String getPositionNumber() {
    return positionNumber;
  }

  public void setPositionNumber(String positionNumber) {
    this.positionNumber = positionNumber;
  }


  public String getDepartmentNumber() {
    return departmentNumber;
  }

  public void setDepartmentNumber(String departmentNumber) {
    this.departmentNumber = departmentNumber;
  }


  public String getMobilizeNote() {
    return mobilizeNote;
  }

  public void setMobilizeNote(String mobilizeNote) {
    this.mobilizeNote = mobilizeNote;
  }


  public Timestamp getMobilizeTime() {
    return mobilizeTime;
  }

  public void setMobilizeTime(Timestamp mobilizeTime) {
    this.mobilizeTime = mobilizeTime;
  }


  public Integer getMobilizeState() {
    return mobilizeState;
  }

  public void setMobilizeState(Integer mobilizeState) {
    this.mobilizeState = mobilizeState;
  }

}
