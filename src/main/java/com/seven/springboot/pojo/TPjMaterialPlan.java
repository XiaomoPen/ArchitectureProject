package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjMaterialPlan {

  private String planNumber;
  private String userNumber;
  private String lxxxdjBh;
  private String planName;
  private String planPerson;
  private String planMask;
  private Timestamp planDate;
  private Integer planApproval;
  private Integer planType;


  public String getPlanNumber() {
    return planNumber;
  }

  public void setPlanNumber(String planNumber) {
    this.planNumber = planNumber;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public String getLxxxdjBh() {
    return lxxxdjBh;
  }

  public void setLxxxdjBh(String lxxxdjBh) {
    this.lxxxdjBh = lxxxdjBh;
  }


  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public String getPlanPerson() {
    return planPerson;
  }

  public void setPlanPerson(String planPerson) {
    this.planPerson = planPerson;
  }


  public String getPlanMask() {
    return planMask;
  }

  public void setPlanMask(String planMask) {
    this.planMask = planMask;
  }


  public Timestamp getPlanDate() {
    return planDate;
  }

  public void setPlanDate(Timestamp planDate) {
    this.planDate = planDate;
  }


  public Integer getPlanApproval() {
    return planApproval;
  }

  public void setPlanApproval(Integer planApproval) {
    this.planApproval = planApproval;
  }


  public Integer getPlanType() {
    return planType;
  }

  public void setPlanType(Integer planType) {
    this.planType = planType;
  }

}
