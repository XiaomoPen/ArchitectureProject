package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjMaterialPlanDetailed {

  private String planNumber;
  private String materialName;
  private String materialNumber;
  private String materialCompany;
  private Integer materialSum;
  private double materialConsultMoney;
  private double materialMoney;
  private String materialMask;


  public String getPlanNumber() {
    return planNumber;
  }

  public void setPlanNumber(String planNumber) {
    this.planNumber = planNumber;
  }


  public String getMaterialName() {
    return materialName;
  }

  public void setMaterialName(String materialName) {
    this.materialName = materialName;
  }


  public String getMaterialNumber() {
    return materialNumber;
  }

  public void setMaterialNumber(String materialNumber) {
    this.materialNumber = materialNumber;
  }


  public String getMaterialCompany() {
    return materialCompany;
  }

  public void setMaterialCompany(String materialCompany) {
    this.materialCompany = materialCompany;
  }


  public Integer getMaterialSum() {
    return materialSum;
  }

  public void setMaterialSum(Integer materialSum) {
    this.materialSum = materialSum;
  }


  public double getMaterialConsultMoney() {
    return materialConsultMoney;
  }

  public void setMaterialConsultMoney(double materialConsultMoney) {
    this.materialConsultMoney = materialConsultMoney;
  }


  public double getMaterialMoney() {
    return materialMoney;
  }

  public void setMaterialMoney(double materialMoney) {
    this.materialMoney = materialMoney;
  }


  public String getMaterialMask() {
    return materialMask;
  }

  public void setMaterialMask(String materialMask) {
    this.materialMask = materialMask;
  }

}
