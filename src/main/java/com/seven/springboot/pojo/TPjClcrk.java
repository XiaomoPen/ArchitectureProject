package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjClcrk {

  private String clcrkNumber;
  private Timestamp clcrkTime;
  private String clcrkName;
  private Integer clcrkType;
  private String contractNumber;
  private String lxxxdjBh;
  private String gysBh;
  private String clcrkPurchase;
  private String clcrkDelivery;
  private String clcrkAcceptance;
  private String clcrkWarehousing;
  private String clcrkInput;
  private Integer clcrkApproval;


  public String getClcrkNumber() {
    return clcrkNumber;
  }

  public void setClcrkNumber(String clcrkNumber) {
    this.clcrkNumber = clcrkNumber;
  }


  public Timestamp getClcrkTime() {
    return clcrkTime;
  }

  public void setClcrkTime(Timestamp clcrkTime) {
    this.clcrkTime = clcrkTime;
  }


  public String getClcrkName() {
    return clcrkName;
  }

  public void setClcrkName(String clcrkName) {
    this.clcrkName = clcrkName;
  }


  public Integer getClcrkType() {
    return clcrkType;
  }

  public void setClcrkType(Integer clcrkType) {
    this.clcrkType = clcrkType;
  }


  public String getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }


  public String getLxxxdjBh() {
    return lxxxdjBh;
  }

  public void setLxxxdjBh(String lxxxdjBh) {
    this.lxxxdjBh = lxxxdjBh;
  }


  public String getGysBh() {
    return gysBh;
  }

  public void setGysBh(String gysBh) {
    this.gysBh = gysBh;
  }


  public String getClcrkPurchase() {
    return clcrkPurchase;
  }

  public void setClcrkPurchase(String clcrkPurchase) {
    this.clcrkPurchase = clcrkPurchase;
  }


  public String getClcrkDelivery() {
    return clcrkDelivery;
  }

  public void setClcrkDelivery(String clcrkDelivery) {
    this.clcrkDelivery = clcrkDelivery;
  }


  public String getClcrkAcceptance() {
    return clcrkAcceptance;
  }

  public void setClcrkAcceptance(String clcrkAcceptance) {
    this.clcrkAcceptance = clcrkAcceptance;
  }


  public String getClcrkWarehousing() {
    return clcrkWarehousing;
  }

  public void setClcrkWarehousing(String clcrkWarehousing) {
    this.clcrkWarehousing = clcrkWarehousing;
  }


  public String getClcrkInput() {
    return clcrkInput;
  }

  public void setClcrkInput(String clcrkInput) {
    this.clcrkInput = clcrkInput;
  }


  public Integer getClcrkApproval() {
    return clcrkApproval;
  }

  public void setClcrkApproval(Integer clcrkApproval) {
    this.clcrkApproval = clcrkApproval;
  }

}
