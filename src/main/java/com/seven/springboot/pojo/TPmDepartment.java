package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPmDepartment {

  private String departmentNumber;
  private String departmentName;
  private Timestamp departmentTime;
  private String userNumber;


  public String getDepartmentNumber() {
    return departmentNumber;
  }

  public void setDepartmentNumber(String departmentNumber) {
    this.departmentNumber = departmentNumber;
  }


  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }


  public Timestamp getDepartmentTime() {
    return departmentTime;
  }

  public void setDepartmentTime(Timestamp departmentTime) {
    this.departmentTime = departmentTime;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  private List<TPmMobilize> tPmMobilizes;

  public List<TPmMobilize> gettPmMobilizes() {
    return tPmMobilizes;
  }

  public void settPmMobilizes(List<TPmMobilize> tPmMobilizes) {
    this.tPmMobilizes = tPmMobilizes;
  }

  private List<TPmCard> cards;

  public List<TPmCard> getCards() {
    return cards;
  }

  public void setCards(List<TPmCard> cards) {
    this.cards = cards;
  }
}
