package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjMaterialSettlementDetailed {

  private String settlementNumber;
  private Timestamp settlementDatetime;
  private String settlementTheme;
  private String settlementType;
  private double settlementSettiedMoney;
  private double settlementNotSettiedMoney;
  private String settlementMaxMoney;
  private String settlementMask;


  public String getSettlementNumber() {
    return settlementNumber;
  }

  public void setSettlementNumber(String settlementNumber) {
    this.settlementNumber = settlementNumber;
  }


  public Timestamp getSettlementDatetime() {
    return settlementDatetime;
  }

  public void setSettlementDatetime(Timestamp settlementDatetime) {
    this.settlementDatetime = settlementDatetime;
  }


  public String getSettlementTheme() {
    return settlementTheme;
  }

  public void setSettlementTheme(String settlementTheme) {
    this.settlementTheme = settlementTheme;
  }


  public String getSettlementType() {
    return settlementType;
  }

  public void setSettlementType(String settlementType) {
    this.settlementType = settlementType;
  }


  public double getSettlementSettiedMoney() {
    return settlementSettiedMoney;
  }

  public void setSettlementSettiedMoney(double settlementSettiedMoney) {
    this.settlementSettiedMoney = settlementSettiedMoney;
  }


  public double getSettlementNotSettiedMoney() {
    return settlementNotSettiedMoney;
  }

  public void setSettlementNotSettiedMoney(double settlementNotSettiedMoney) {
    this.settlementNotSettiedMoney = settlementNotSettiedMoney;
  }


  public String getSettlementMaxMoney() {
    return settlementMaxMoney;
  }

  public void setSettlementMaxMoney(String settlementMaxMoney) {
    this.settlementMaxMoney = settlementMaxMoney;
  }


  public String getSettlementMask() {
    return settlementMask;
  }

  public void setSettlementMask(String settlementMask) {
    this.settlementMask = settlementMask;
  }

}
