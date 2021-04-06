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

}
