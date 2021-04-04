package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjReceive {

  private String receiveDrawingNumber;
  private String receiveDevicename;
  private java.sql.Date receiveApplicationDate;
  private String receiveModelNumber;
  private double receiveDuration;
  private Integer receiveTypeOfUse;
  private java.sql.Date receiveDateOfService;
  private String receiveReason;
  private String receiveRequire;
  private Integer receiveProcessState;


  public String getReceiveDrawingNumber() {
    return receiveDrawingNumber;
  }

  public void setReceiveDrawingNumber(String receiveDrawingNumber) {
    this.receiveDrawingNumber = receiveDrawingNumber;
  }


  public String getReceiveDevicename() {
    return receiveDevicename;
  }

  public void setReceiveDevicename(String receiveDevicename) {
    this.receiveDevicename = receiveDevicename;
  }


  public java.sql.Date getReceiveApplicationDate() {
    return receiveApplicationDate;
  }

  public void setReceiveApplicationDate(java.sql.Date receiveApplicationDate) {
    this.receiveApplicationDate = receiveApplicationDate;
  }


  public String getReceiveModelNumber() {
    return receiveModelNumber;
  }

  public void setReceiveModelNumber(String receiveModelNumber) {
    this.receiveModelNumber = receiveModelNumber;
  }


  public double getReceiveDuration() {
    return receiveDuration;
  }

  public void setReceiveDuration(double receiveDuration) {
    this.receiveDuration = receiveDuration;
  }


  public Integer getReceiveTypeOfUse() {
    return receiveTypeOfUse;
  }

  public void setReceiveTypeOfUse(Integer receiveTypeOfUse) {
    this.receiveTypeOfUse = receiveTypeOfUse;
  }


  public java.sql.Date getReceiveDateOfService() {
    return receiveDateOfService;
  }

  public void setReceiveDateOfService(java.sql.Date receiveDateOfService) {
    this.receiveDateOfService = receiveDateOfService;
  }


  public String getReceiveReason() {
    return receiveReason;
  }

  public void setReceiveReason(String receiveReason) {
    this.receiveReason = receiveReason;
  }


  public String getReceiveRequire() {
    return receiveRequire;
  }

  public void setReceiveRequire(String receiveRequire) {
    this.receiveRequire = receiveRequire;
  }


  public Integer getReceiveProcessState() {
    return receiveProcessState;
  }

  public void setReceiveProcessState(Integer receiveProcessState) {
    this.receiveProcessState = receiveProcessState;
  }

}
