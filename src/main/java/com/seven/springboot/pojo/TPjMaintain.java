package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjMaintain {

  private String maintainNumber;
  private java.sql.Date maintainTabulationDate;
  private String maintainDevicename;
  private String maintainSpecification;
  private String maintainUnit;
  private String maintainReporter;
  private java.sql.Date maintainOccurrenceTime;
  private Integer maintainDegreeOfFault;
  private double maintainUpkeepCosts;
  private java.sql.Date maintainExpectedTime;
  private String maintainDocumentMaker;
  private String maintainFaultSymptom;
  private Integer maintainProcessState;


  public String getMaintainNumber() {
    return maintainNumber;
  }

  public void setMaintainNumber(String maintainNumber) {
    this.maintainNumber = maintainNumber;
  }


  public java.sql.Date getMaintainTabulationDate() {
    return maintainTabulationDate;
  }

  public void setMaintainTabulationDate(java.sql.Date maintainTabulationDate) {
    this.maintainTabulationDate = maintainTabulationDate;
  }


  public String getMaintainDevicename() {
    return maintainDevicename;
  }

  public void setMaintainDevicename(String maintainDevicename) {
    this.maintainDevicename = maintainDevicename;
  }


  public String getMaintainSpecification() {
    return maintainSpecification;
  }

  public void setMaintainSpecification(String maintainSpecification) {
    this.maintainSpecification = maintainSpecification;
  }


  public String getMaintainUnit() {
    return maintainUnit;
  }

  public void setMaintainUnit(String maintainUnit) {
    this.maintainUnit = maintainUnit;
  }


  public String getMaintainReporter() {
    return maintainReporter;
  }

  public void setMaintainReporter(String maintainReporter) {
    this.maintainReporter = maintainReporter;
  }


  public java.sql.Date getMaintainOccurrenceTime() {
    return maintainOccurrenceTime;
  }

  public void setMaintainOccurrenceTime(java.sql.Date maintainOccurrenceTime) {
    this.maintainOccurrenceTime = maintainOccurrenceTime;
  }


  public Integer getMaintainDegreeOfFault() {
    return maintainDegreeOfFault;
  }

  public void setMaintainDegreeOfFault(Integer maintainDegreeOfFault) {
    this.maintainDegreeOfFault = maintainDegreeOfFault;
  }


  public double getMaintainUpkeepCosts() {
    return maintainUpkeepCosts;
  }

  public void setMaintainUpkeepCosts(double maintainUpkeepCosts) {
    this.maintainUpkeepCosts = maintainUpkeepCosts;
  }


  public java.sql.Date getMaintainExpectedTime() {
    return maintainExpectedTime;
  }

  public void setMaintainExpectedTime(java.sql.Date maintainExpectedTime) {
    this.maintainExpectedTime = maintainExpectedTime;
  }


  public String getMaintainDocumentMaker() {
    return maintainDocumentMaker;
  }

  public void setMaintainDocumentMaker(String maintainDocumentMaker) {
    this.maintainDocumentMaker = maintainDocumentMaker;
  }


  public String getMaintainFaultSymptom() {
    return maintainFaultSymptom;
  }

  public void setMaintainFaultSymptom(String maintainFaultSymptom) {
    this.maintainFaultSymptom = maintainFaultSymptom;
  }


  public Integer getMaintainProcessState() {
    return maintainProcessState;
  }

  public void setMaintainProcessState(Integer maintainProcessState) {
    this.maintainProcessState = maintainProcessState;
  }

}
