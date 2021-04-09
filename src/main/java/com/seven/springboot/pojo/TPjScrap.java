package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjScrap {

  private String scrapNumber;
  private Date scrapDocumentationDate;
  private String scrapDeviceName;
  private String scrapModelNumber;
  private String scrapUnits;
  private String scrapProposer;
  private String scrapDepartment;
  private Date scrapApplicationDate;
  private Date scrapDateOfRetirement;
  private double scrapCost;
  private String scrapDocumentMaker;
  private String scrapDiscardReason;
  private Integer scrapProcessState;
}
