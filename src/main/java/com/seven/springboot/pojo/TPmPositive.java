package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPmPositive {

  private String positiveSerial;
  private String userNumber;
  private Timestamp positiveTime;
  private Timestamp postiveSqpositive;
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


  public Timestamp getPositiveTime() {
    return positiveTime;
  }

  public void setPositiveTime(Timestamp positiveTime) {
    this.positiveTime = positiveTime;
  }


  public Timestamp getPostiveSqpositive() {
    return postiveSqpositive;
  }

  public void setPostiveSqpositive(Timestamp postiveSqpositive) {
    this.postiveSqpositive = postiveSqpositive;
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

}
