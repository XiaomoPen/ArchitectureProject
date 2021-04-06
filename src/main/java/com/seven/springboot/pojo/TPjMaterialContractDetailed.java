package com.seven.springboot.pojo;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjMaterialContractDetailed {

  private String contractNumber;
  @JSONField(format = "yyyy年MM月dd日")
  private Timestamp contractAwardTime;
  private String contractName;
  private String contractType;
  @JSONField(format = "yyyy年MM月dd日")
  private Timestamp contractStartTime;
  @JSONField(format = "yyyy年MM月dd日")
  private Timestamp contractEndTime;
  private double contractMoney;
  private String contractMoneyMax;
  private double contractAdvanceCharge;
  private double contractBond;
  private String contractSupplierPeople;
  private String contractPayment;
  private String contractSettlement;
  private String contractDelivery;
  private String contractAppointmentAddress;
  private String contractBookPeople;
  private String contractPaymentCondition;
  private String contractMainRequirement;
  private String contractMask;


  public String getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }


  public Timestamp getContractAwardTime() {
    return contractAwardTime;
  }

  public void setContractAwardTime(Timestamp contractAwardTime) {
    this.contractAwardTime = contractAwardTime;
  }


  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }


  public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }


  public Timestamp getContractStartTime() {
    return contractStartTime;
  }

  public void setContractStartTime(Timestamp contractStartTime) {
    this.contractStartTime = contractStartTime;
  }


  public Timestamp getContractEndTime() {
    return contractEndTime;
  }

  public void setContractEndTime(Timestamp contractEndTime) {
    this.contractEndTime = contractEndTime;
  }


  public double getContractMoney() {
    return contractMoney;
  }

  public void setContractMoney(double contractMoney) {
    this.contractMoney = contractMoney;
  }


  public String getContractMoneyMax() {
    return contractMoneyMax;
  }

  public void setContractMoneyMax(String contractMoneyMax) {
    this.contractMoneyMax = contractMoneyMax;
  }


  public double getContractAdvanceCharge() {
    return contractAdvanceCharge;
  }

  public void setContractAdvanceCharge(double contractAdvanceCharge) {
    this.contractAdvanceCharge = contractAdvanceCharge;
  }


  public double getContractBond() {
    return contractBond;
  }

  public void setContractBond(double contractBond) {
    this.contractBond = contractBond;
  }


  public String getContractSupplierPeople() {
    return contractSupplierPeople;
  }

  public void setContractSupplierPeople(String contractSupplierPeople) {
    this.contractSupplierPeople = contractSupplierPeople;
  }


  public String getContractPayment() {
    return contractPayment;
  }

  public void setContractPayment(String contractPayment) {
    this.contractPayment = contractPayment;
  }


  public String getContractSettlement() {
    return contractSettlement;
  }

  public void setContractSettlement(String contractSettlement) {
    this.contractSettlement = contractSettlement;
  }


  public String getContractDelivery() {
    return contractDelivery;
  }

  public void setContractDelivery(String contractDelivery) {
    this.contractDelivery = contractDelivery;
  }


  public String getContractAppointmentAddress() {
    return contractAppointmentAddress;
  }

  public void setContractAppointmentAddress(String contractAppointmentAddress) {
    this.contractAppointmentAddress = contractAppointmentAddress;
  }


  public String getContractBookPeople() {
    return contractBookPeople;
  }

  public void setContractBookPeople(String contractBookPeople) {
    this.contractBookPeople = contractBookPeople;
  }


  public String getContractPaymentCondition() {
    return contractPaymentCondition;
  }

  public void setContractPaymentCondition(String contractPaymentCondition) {
    this.contractPaymentCondition = contractPaymentCondition;
  }


  public String getContractMainRequirement() {
    return contractMainRequirement;
  }

  public void setContractMainRequirement(String contractMainRequirement) {
    this.contractMainRequirement = contractMainRequirement;
  }


  public String getContractMask() {
    return contractMask;
  }

  public void setContractMask(String contractMask) {
    this.contractMask = contractMask;
  }

}
