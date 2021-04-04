package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjScrap {

  private String scrapNumber;
  private java.sql.Date scrapDocumentationDate;
  private String scrapDevicename;
  private String scrapModelNumber;
  private String scrapUnits;
  private String scrapProposer;
  private String scrapDepartment;
  private java.sql.Date scrapApplicationDate;
  private java.sql.Date scrapDateOfRetirement;
  private double scrapCost;
  private String scrapDocumentMaker;
  private String scrapDiscardReason;
  private Integer scrapProcessState;


  public String getScrapNumber() {
    return scrapNumber;
  }

  public void setScrapNumber(String scrapNumber) {
    this.scrapNumber = scrapNumber;
  }


  public java.sql.Date getScrapDocumentationDate() {
    return scrapDocumentationDate;
  }

  public void setScrapDocumentationDate(java.sql.Date scrapDocumentationDate) {
    this.scrapDocumentationDate = scrapDocumentationDate;
  }


  public String getScrapDevicename() {
    return scrapDevicename;
  }

  public void setScrapDevicename(String scrapDevicename) {
    this.scrapDevicename = scrapDevicename;
  }


  public String getScrapModelNumber() {
    return scrapModelNumber;
  }

  public void setScrapModelNumber(String scrapModelNumber) {
    this.scrapModelNumber = scrapModelNumber;
  }


  public String getScrapUnits() {
    return scrapUnits;
  }

  public void setScrapUnits(String scrapUnits) {
    this.scrapUnits = scrapUnits;
  }


  public String getScrapProposer() {
    return scrapProposer;
  }

  public void setScrapProposer(String scrapProposer) {
    this.scrapProposer = scrapProposer;
  }


  public String getScrapDepartment() {
    return scrapDepartment;
  }

  public void setScrapDepartment(String scrapDepartment) {
    this.scrapDepartment = scrapDepartment;
  }


  public java.sql.Date getScrapApplicationDate() {
    return scrapApplicationDate;
  }

  public void setScrapApplicationDate(java.sql.Date scrapApplicationDate) {
    this.scrapApplicationDate = scrapApplicationDate;
  }


  public java.sql.Date getScrapDateOfRetirement() {
    return scrapDateOfRetirement;
  }

  public void setScrapDateOfRetirement(java.sql.Date scrapDateOfRetirement) {
    this.scrapDateOfRetirement = scrapDateOfRetirement;
  }


  public double getScrapCost() {
    return scrapCost;
  }

  public void setScrapCost(double scrapCost) {
    this.scrapCost = scrapCost;
  }


  public String getScrapDocumentMaker() {
    return scrapDocumentMaker;
  }

  public void setScrapDocumentMaker(String scrapDocumentMaker) {
    this.scrapDocumentMaker = scrapDocumentMaker;
  }


  public String getScrapDiscardReason() {
    return scrapDiscardReason;
  }

  public void setScrapDiscardReason(String scrapDiscardReason) {
    this.scrapDiscardReason = scrapDiscardReason;
  }


  public Integer getScrapProcessState() {
    return scrapProcessState;
  }

  public void setScrapProcessState(Integer scrapProcessState) {
    this.scrapProcessState = scrapProcessState;
  }

}
