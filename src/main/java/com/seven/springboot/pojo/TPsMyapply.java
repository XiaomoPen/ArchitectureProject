package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPsMyapply {

  private String myapplyNum;
  private String myapplyNumber;
  private String myapplyName;
  private Integer myapplyState;
  private Integer myapplyUrge;
  private String myapplyType;
  private String userNumber;


  public String getMyapplyNum() {
    return myapplyNum;
  }

  public void setMyapplyNum(String myapplyNum) {
    this.myapplyNum = myapplyNum;
  }


  public String getMyapplyNumber() {
    return myapplyNumber;
  }

  public void setMyapplyNumber(String myapplyNumber) {
    this.myapplyNumber = myapplyNumber;
  }


  public String getMyapplyName() {
    return myapplyName;
  }

  public void setMyapplyName(String myapplyName) {
    this.myapplyName = myapplyName;
  }


  public Integer getMyapplyState() {
    return myapplyState;
  }

  public void setMyapplyState(Integer myapplyState) {
    this.myapplyState = myapplyState;
  }


  public Integer getMyapplyUrge() {
    return myapplyUrge;
  }

  public void setMyapplyUrge(Integer myapplyUrge) {
    this.myapplyUrge = myapplyUrge;
  }


  public String getMyapplyType() {
    return myapplyType;
  }

  public void setMyapplyType(String myapplyType) {
    this.myapplyType = myapplyType;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }

}
