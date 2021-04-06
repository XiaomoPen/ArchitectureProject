package com.seven.springboot.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPmContract {

  private String contractNumber;
  private String userNumber;
  private String contractName;
  private String contractLeix;
  private String contractState;
  private double contractSy;
  private double contractPositive;
  private Timestamp contractSigning;
  private Timestamp contractEffect;
  private Timestamp contractFailure;
  private Timestamp contactJieshu;

  public String getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }


  public String getContractLeix() {
    return contractLeix;
  }

  public void setContractLeix(String contractLeix) {
    this.contractLeix = contractLeix;
  }


  public String getContractState() {
    return contractState;
  }

  public void setContractState(String contractState) {
    this.contractState = contractState;
  }


  public double getContractSy() {
    return contractSy;
  }

  public void setContractSy(double contractSy) {
    this.contractSy = contractSy;
  }


  public double getContractPositive() {
    return contractPositive;
  }

  public void setContractPositive(double contractPositive) {
    this.contractPositive = contractPositive;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getContactJieshu() {
    return contactJieshu;
  }

  public void setContactJieshu(Timestamp contactJieshu) {
    this.contactJieshu = contactJieshu;
  }
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getContractSigning() {
    return contractSigning;
  }

  public void setContractSigning(Timestamp contractSigning) {
    this.contractSigning = contractSigning;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getContractEffect() {
    return contractEffect;
  }

  public void setContractEffect(Timestamp contractEffect) {
    this.contractEffect = contractEffect;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getContractFailure() {
    return contractFailure;
  }

  public void setContractFailure(Timestamp contractFailure) {
    this.contractFailure = contractFailure;
  }



  private TPmUser user;

  public TPmUser getUser() {
    return user;
  }

  public void setUser(TPmUser user) {
    this.user = user;
  }
}
