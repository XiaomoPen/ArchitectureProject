package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjProgressDeclareDetailed {

  private String progressNumber;
  private Timestamp progressDatetime;
  private String progressName;
  private double progressMoney;
  private double progressFine;
  private double progressDeduction;
  private String progressMoneyType;
  private double progressApprovedMoney;
  private double progressReplyMoney;
  private String progressMaxMoney;
  private String progressMask;


  public String getProgressNumber() {
    return progressNumber;
  }

  public void setProgressNumber(String progressNumber) {
    this.progressNumber = progressNumber;
  }


  public Timestamp getProgressDatetime() {
    return progressDatetime;
  }

  public void setProgressDatetime(Timestamp progressDatetime) {
    this.progressDatetime = progressDatetime;
  }


  public String getProgressName() {
    return progressName;
  }

  public void setProgressName(String progressName) {
    this.progressName = progressName;
  }


  public double getProgressMoney() {
    return progressMoney;
  }

  public void setProgressMoney(double progressMoney) {
    this.progressMoney = progressMoney;
  }


  public double getProgressFine() {
    return progressFine;
  }

  public void setProgressFine(double progressFine) {
    this.progressFine = progressFine;
  }


  public double getProgressDeduction() {
    return progressDeduction;
  }

  public void setProgressDeduction(double progressDeduction) {
    this.progressDeduction = progressDeduction;
  }


  public String getProgressMoneyType() {
    return progressMoneyType;
  }

  public void setProgressMoneyType(String progressMoneyType) {
    this.progressMoneyType = progressMoneyType;
  }


  public double getProgressApprovedMoney() {
    return progressApprovedMoney;
  }

  public void setProgressApprovedMoney(double progressApprovedMoney) {
    this.progressApprovedMoney = progressApprovedMoney;
  }


  public double getProgressReplyMoney() {
    return progressReplyMoney;
  }

  public void setProgressReplyMoney(double progressReplyMoney) {
    this.progressReplyMoney = progressReplyMoney;
  }


  public String getProgressMaxMoney() {
    return progressMaxMoney;
  }

  public void setProgressMaxMoney(String progressMaxMoney) {
    this.progressMaxMoney = progressMaxMoney;
  }


  public String getProgressMask() {
    return progressMask;
  }

  public void setProgressMask(String progressMask) {
    this.progressMask = progressMask;
  }

}
