package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjMaintain {
  private String maintainNumber;
  private java.sql.Date maintainTabulationDate;
  private String maintainDeviceName;
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

}
