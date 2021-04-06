package com.seven.springboot.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPmPositive {

  private String positiveSerial;
  private String userNumber;
  private Timestamp positiveTime;
  private Timestamp positiveSqpositive;
  private String positiveNote;
  private Integer positiveState;


  public String getPositiveSerial() {
    return positiveSerial;
  }

  public void setPositiveSerial(String positiveSerial) {
    this.positiveSerial = positiveSerial;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getPositiveTime() {
    return positiveTime;
  }

  public void setPositiveTime(Timestamp positiveTime) {
    this.positiveTime = positiveTime;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getPositiveSqpositive() {
    return positiveSqpositive;
  }

  public void setPositiveSqpositive(Timestamp positiveSqpositive) {
    this.positiveSqpositive = positiveSqpositive;
  }

  public String getPositiveNote() {
    return positiveNote;
  }

  public void setPositiveNote(String positiveNote) {
    this.positiveNote = positiveNote;
  }


  public Integer getPositiveState() {
    return positiveState;
  }

  public void setPositiveState(Integer positiveState) {
    this.positiveState = positiveState;
  }



  private TPmUser tPmUser;

  public TPmUser gettPmUser() {
    return tPmUser;
  }

  public void settPmUser(TPmUser tPmUser) {
    this.tPmUser = tPmUser;
  }



}
