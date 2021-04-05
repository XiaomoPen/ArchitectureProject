package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPmPosition {

  private String positionNumber;
  private String positionName;
  private Timestamp positionTime;
  private String userNumber;


  public String getPositionNumber() {
    return positionNumber;
  }

  public void setPositionNumber(String positionNumber) {
    this.positionNumber = positionNumber;
  }


  public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }


  public Timestamp getPositionTime() {
    return positionTime;
  }

  public void setPositionTime(Timestamp positionTime) {
    this.positionTime = positionTime;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  private List<TPmUser> tPmUsers;

  public List<TPmUser> gettPmUsers() {
    return tPmUsers;
  }

  public void settPmUsers(List<TPmUser> tPmUsers) {
    this.tPmUsers = tPmUsers;
  }


  private List<TPmMobilize> tPmMobilizes;

  public List<TPmMobilize> gettPmMobilizes() {
    return tPmMobilizes;
  }

  public void settPmMobilizes(List<TPmMobilize> tPmMobilizes) {
    this.tPmMobilizes = tPmMobilizes;
  }
}
