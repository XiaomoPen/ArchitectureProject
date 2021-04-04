package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjLabourContractDetailed {

  private String labourNumber;
  private Timestamp labourDatetime;
  private String labourName;
  private String labourType;
  private double labourMoney;
  private String labourMaxMoney;
  private Timestamp labourStartTime;
  private Timestamp labourEndTime;
  private String labourMoneyType;
  private double labourAdvanceCharge;
  private double labourEnsureMoney;
  private String labourPaymentType;
  private String labourPaymentCondition;
  private String labourClause;
  private String labourMask;


  public String getLabourNumber() {
    return labourNumber;
  }

  public void setLabourNumber(String labourNumber) {
    this.labourNumber = labourNumber;
  }


  public Timestamp getLabourDatetime() {
    return labourDatetime;
  }

  public void setLabourDatetime(Timestamp labourDatetime) {
    this.labourDatetime = labourDatetime;
  }


  public String getLabourName() {
    return labourName;
  }

  public void setLabourName(String labourName) {
    this.labourName = labourName;
  }


  public String getLabourType() {
    return labourType;
  }

  public void setLabourType(String labourType) {
    this.labourType = labourType;
  }


  public double getLabourMoney() {
    return labourMoney;
  }

  public void setLabourMoney(double labourMoney) {
    this.labourMoney = labourMoney;
  }


  public String getLabourMaxMoney() {
    return labourMaxMoney;
  }

  public void setLabourMaxMoney(String labourMaxMoney) {
    this.labourMaxMoney = labourMaxMoney;
  }


  public Timestamp getLabourStartTime() {
    return labourStartTime;
  }

  public void setLabourStartTime(Timestamp labourStartTime) {
    this.labourStartTime = labourStartTime;
  }


  public Timestamp getLabourEndTime() {
    return labourEndTime;
  }

  public void setLabourEndTime(Timestamp labourEndTime) {
    this.labourEndTime = labourEndTime;
  }


  public String getLabourMoneyType() {
    return labourMoneyType;
  }

  public void setLabourMoneyType(String labourMoneyType) {
    this.labourMoneyType = labourMoneyType;
  }


  public double getLabourAdvanceCharge() {
    return labourAdvanceCharge;
  }

  public void setLabourAdvanceCharge(double labourAdvanceCharge) {
    this.labourAdvanceCharge = labourAdvanceCharge;
  }


  public double getLabourEnsureMoney() {
    return labourEnsureMoney;
  }

  public void setLabourEnsureMoney(double labourEnsureMoney) {
    this.labourEnsureMoney = labourEnsureMoney;
  }


  public String getLabourPaymentType() {
    return labourPaymentType;
  }

  public void setLabourPaymentType(String labourPaymentType) {
    this.labourPaymentType = labourPaymentType;
  }


  public String getLabourPaymentCondition() {
    return labourPaymentCondition;
  }

  public void setLabourPaymentCondition(String labourPaymentCondition) {
    this.labourPaymentCondition = labourPaymentCondition;
  }


  public String getLabourClause() {
    return labourClause;
  }

  public void setLabourClause(String labourClause) {
    this.labourClause = labourClause;
  }


  public String getLabourMask() {
    return labourMask;
  }

  public void setLabourMask(String labourMask) {
    this.labourMask = labourMask;
  }

}
