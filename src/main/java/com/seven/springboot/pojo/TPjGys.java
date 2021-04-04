package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjGys {

  private String gysBh;
  private Integer gysId;
  private String gysMc;


  public String getGysBh() {
    return gysBh;
  }

  public void setGysBh(String gysBh) {
    this.gysBh = gysBh;
  }


  public Integer getGysId() {
    return gysId;
  }

  public void setGysId(Integer gysId) {
    this.gysId = gysId;
  }


  public String getGysMc() {
    return gysMc;
  }

  public void setGysMc(String gysMc) {
    this.gysMc = gysMc;
  }

}
