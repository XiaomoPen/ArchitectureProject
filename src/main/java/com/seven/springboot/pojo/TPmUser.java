package com.seven.springboot.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPmUser {

  private String userNumber;
  private String userJobNumber;
  private String userName;
  private String  userSex;
  private Timestamp userBirthday;
  private Timestamp userIntime;
  private Timestamp userPositive;
  private Timestamp userDeparture;
  private String positionNumber;
  private String departmentNumber;
  private Integer userState;


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public String getUserJobNumber() {
    return userJobNumber;
  }

  public void setUserJobNumber(String userJobNumber) {
    this.userJobNumber = userJobNumber;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getUserBirthday() {
    return userBirthday;
  }

  public void setUserBirthday(Timestamp userBirthday) {
    this.userBirthday = userBirthday;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getUserIntime() {
    return userIntime;
  }

  public void setUserIntime(Timestamp userIntime) {
    this.userIntime = userIntime;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getUserPositive() {
    return userPositive;
  }

  public void setUserPositive(Timestamp userPositive) {
    this.userPositive = userPositive;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getUserDeparture() {
    return userDeparture;
  }

  public void setUserDeparture(Timestamp userDeparture) {
    this.userDeparture = userDeparture;
  }


  public String getPositionNumber() {
    return positionNumber;
  }

  public void setPositionNumber(String positionNumber) {
    this.positionNumber = positionNumber;
  }


  public String getDepartmentNumber() {
    return departmentNumber;
  }

  public void setDepartmentNumber(String departmentNumber) {
    this.departmentNumber = departmentNumber;
  }


  public Integer getUserState() {
    return userState;
  }

  public void setUserState(Integer userState) {
    this.userState = userState;
  }





  private TPmDepartment department;


  public TPmDepartment getDepartment() {
    return department;
  }

  public void setDepartment(TPmDepartment department) {
    this.department = department;
  }


  private TPmPosition tPmPosition;


  public TPmPosition gettPmPosition() {
    return tPmPosition;
  }

  public void settPmPosition(TPmPosition tPmPosition) {
    this.tPmPosition = tPmPosition;
  }



  private List<TPmContract> tPmContracts;

  public List<TPmContract> gettPmContracts() {
    return tPmContracts;
  }

  public void settPmContracts(List<TPmContract> tPmContracts) {
    this.tPmContracts = tPmContracts;
  }



  private List<TPmPositive> pmPositives;

  public List<TPmPositive> getPmPositives() {
    return pmPositives;
  }

  public void setPmPositives(List<TPmPositive> pmPositives) {
    this.pmPositives = pmPositives;
  }


  private List<TPmDeparture> tPmDepartures;

  public List<TPmDeparture> gettPmDepartures() {
    return tPmDepartures;
  }

  public void settPmDepartures(List<TPmDeparture> tPmDepartures) {
    this.tPmDepartures = tPmDepartures;
  }


  private List<TPmCard> cards;

  public List<TPmCard> getCards() {
    return cards;
  }

  public void setCards(List<TPmCard> cards) {
    this.cards = cards;
  }
}
