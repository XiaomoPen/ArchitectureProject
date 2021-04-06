package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPmCard {

  private String cardSerial;
  private String userNumber;
  private String cardNumber;
  private String userName;
  private String cardLeix;
  private String departmentNumber;
  private Timestamp cardForensics;
  private Timestamp cardEffect;
  private Timestamp cardDue;
  private String cardNote;


  public String getCardSerial() {
    return cardSerial;
  }

  public void setCardSerial(String cardSerial) {
    this.cardSerial = cardSerial;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getDepartmentNumber() {
    return departmentNumber;
  }

  public void setDepartmentNumber(String departmentNumber) {
    this.departmentNumber = departmentNumber;
  }

  public String getCardLeix() {
    return cardLeix;
  }

  public void setCardLeix(String cardLeix) {
    this.cardLeix = cardLeix;
  }


  public Timestamp getCardForensics() {
    return cardForensics;
  }

  public void setCardForensics(Timestamp cardForensics) {
    this.cardForensics = cardForensics;
  }


  public Timestamp getCardEffect() {
    return cardEffect;
  }

  public void setCardEffect(Timestamp cardEffect) {
    this.cardEffect = cardEffect;
  }


  public Timestamp getCardDue() {
    return cardDue;
  }

  public void setCardDue(Timestamp cardDue) {
    this.cardDue = cardDue;
  }


  public String getCardNote() {
    return cardNote;
  }

  public void setCardNote(String cardNote) {
    this.cardNote = cardNote;
  }



  private TPmUser user;

  public TPmUser getUser() {
    return user;
  }

  public void setUser(TPmUser user) {
    this.user = user;
  }

  private TPmDepartment department;

  public TPmDepartment getDepartment() {
    return department;
  }

  public void setDepartment(TPmDepartment department) {
    this.department = department;
  }
}
