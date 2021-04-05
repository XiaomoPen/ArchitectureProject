package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPmDeparture {

  private String departureErial;
  private String userNumber;
  private Timestamp departureTime;
  private Timestamp departureLztime;
  private String departureLeix;
  private String departureReason;
  private String departureNote;
  private Integer departureState;


  public String getDepartureErial() {
    return departureErial;
  }

  public void setDepartureErial(String departureErial) {
    this.departureErial = departureErial;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public Timestamp getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(Timestamp departureTime) {
    this.departureTime = departureTime;
  }


  public Timestamp getDepartureLztime() {
    return departureLztime;
  }

  public void setDepartureLztime(Timestamp departureLztime) {
    this.departureLztime = departureLztime;
  }


  public String getDepartureLeix() {
    return departureLeix;
  }

  public void setDepartureLeix(String departureLeix) {
    this.departureLeix = departureLeix;
  }


  public String getDepartureReason() {
    return departureReason;
  }

  public void setDepartureReason(String departureReason) {
    this.departureReason = departureReason;
  }


  public String getDepartureNote() {
    return departureNote;
  }

  public void setDepartureNote(String departureNote) {
    this.departureNote = departureNote;
  }


  public Integer getDepartureState() {
    return departureState;
  }

  public void setDepartureState(Integer departureState) {
    this.departureState = departureState;
  }


  private TPmUser tPmUser;

  public TPmUser gettPmUser() {
    return tPmUser;
  }

  public void settPmUser(TPmUser tPmUser) {
    this.tPmUser = tPmUser;
  }
}
