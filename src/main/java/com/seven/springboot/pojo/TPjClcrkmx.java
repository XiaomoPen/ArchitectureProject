package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjClcrkmx {

  private String clcrkNumber;
  private String clcrkmxName;
  private String clcrkmxNumber;
  private String clcrkmxCompany;
  private String clcrkmxWarehouse;
  private Integer clcrkmxSum;
  private double clcrkmxIncluded;
  private double clcrkmxNoIncluded;
  private double clcrkmxTaxRate;
  private double clcrkmxNoMoney;
  private double clcrkmxMoney;


  public String getClcrkNumber() {
    return clcrkNumber;
  }

  public void setClcrkNumber(String clcrkNumber) {
    this.clcrkNumber = clcrkNumber;
  }


  public String getClcrkmxName() {
    return clcrkmxName;
  }

  public void setClcrkmxName(String clcrkmxName) {
    this.clcrkmxName = clcrkmxName;
  }


  public String getClcrkmxNumber() {
    return clcrkmxNumber;
  }

  public void setClcrkmxNumber(String clcrkmxNumber) {
    this.clcrkmxNumber = clcrkmxNumber;
  }


  public String getClcrkmxCompany() {
    return clcrkmxCompany;
  }

  public void setClcrkmxCompany(String clcrkmxCompany) {
    this.clcrkmxCompany = clcrkmxCompany;
  }


  public String getClcrkmxWarehouse() {
    return clcrkmxWarehouse;
  }

  public void setClcrkmxWarehouse(String clcrkmxWarehouse) {
    this.clcrkmxWarehouse = clcrkmxWarehouse;
  }


  public Integer getClcrkmxSum() {
    return clcrkmxSum;
  }

  public void setClcrkmxSum(Integer clcrkmxSum) {
    this.clcrkmxSum = clcrkmxSum;
  }


  public double getClcrkmxIncluded() {
    return clcrkmxIncluded;
  }

  public void setClcrkmxIncluded(double clcrkmxIncluded) {
    this.clcrkmxIncluded = clcrkmxIncluded;
  }


  public double getClcrkmxNoIncluded() {
    return clcrkmxNoIncluded;
  }

  public void setClcrkmxNoIncluded(double clcrkmxNoIncluded) {
    this.clcrkmxNoIncluded = clcrkmxNoIncluded;
  }


  public double getClcrkmxTaxRate() {
    return clcrkmxTaxRate;
  }

  public void setClcrkmxTaxRate(double clcrkmxTaxRate) {
    this.clcrkmxTaxRate = clcrkmxTaxRate;
  }


  public double getClcrkmxNoMoney() {
    return clcrkmxNoMoney;
  }

  public void setClcrkmxNoMoney(double clcrkmxNoMoney) {
    this.clcrkmxNoMoney = clcrkmxNoMoney;
  }


  public double getClcrkmxMoney() {
    return clcrkmxMoney;
  }

  public void setClcrkmxMoney(double clcrkmxMoney) {
    this.clcrkmxMoney = clcrkmxMoney;
  }

}
