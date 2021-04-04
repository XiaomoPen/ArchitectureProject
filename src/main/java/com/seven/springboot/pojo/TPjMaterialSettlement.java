package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjMaterialSettlement {

  private String settlementNumber;
  private String lxxxdjBh;
  private String contractNumber;
  private String userNumber;
  private String gysBh;
  private Integer settlementApproval;


  public String getSettlementNumber() {
    return settlementNumber;
  }

  public void setSettlementNumber(String settlementNumber) {
    this.settlementNumber = settlementNumber;
  }


  public String getLxxxdjBh() {
    return lxxxdjBh;
  }

  public void setLxxxdjBh(String lxxxdjBh) {
    this.lxxxdjBh = lxxxdjBh;
  }


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


  public String getGysBh() {
    return gysBh;
  }

  public void setGysBh(String gysBh) {
    this.gysBh = gysBh;
  }


  public Integer getSettlementApproval() {
    return settlementApproval;
  }

  public void setSettlementApproval(Integer settlementApproval) {
    this.settlementApproval = settlementApproval;
  }

}
