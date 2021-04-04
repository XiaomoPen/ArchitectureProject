package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjLabourContract {

  private String labourNumber;
  private String lxxxdjBh;
  private String userNumber;
  private String gysBh;


  public String getLabourNumber() {
    return labourNumber;
  }

  public void setLabourNumber(String labourNumber) {
    this.labourNumber = labourNumber;
  }


  public String getLxxxdjBh() {
    return lxxxdjBh;
  }

  public void setLxxxdjBh(String lxxxdjBh) {
    this.lxxxdjBh = lxxxdjBh;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public String getGysBh() {
    return gysBh;
  }

  public void setGysBh(String gysBh) {
    this.gysBh = gysBh;
  }

}
