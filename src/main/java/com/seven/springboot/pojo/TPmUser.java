package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPmUser {

  private String userNumber;
  private String userJobNumber;
  private String userName;
  private String userSex;
  private Timestamp userBirthday;
  private Timestamp userIntime;
  private Timestamp userPositive;
  private Timestamp userDeparture;
  private String positionNumber;
  private String departmentNumber;


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


  public Timestamp getUserBirthday() {
    return userBirthday;
  }

  public void setUserBirthday(Timestamp userBirthday) {
    this.userBirthday = userBirthday;
  }


  public Timestamp getUserIntime() {
    return userIntime;
  }

  public void setUserIntime(Timestamp userIntime) {
    this.userIntime = userIntime;
  }


  public Timestamp getUserPositive() {
    return userPositive;
  }

  public void setUserPositive(Timestamp userPositive) {
    this.userPositive = userPositive;
  }


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

}
