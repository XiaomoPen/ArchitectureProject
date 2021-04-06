package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TCtKhfp {

  private String khfpBh;
  private String khxxXm;
  private String khxxKhlx;
  private String khxxKhhy;
  private String userNumber;
  private String khBh;
  private String userMc;


  public String getKhfpBh() {
    return khfpBh;
  }

  public void setKhfpBh(String khfpBh) {
    this.khfpBh = khfpBh;
  }


  public String getKhxxXm() {
    return khxxXm;
  }

  public void setKhxxXm(String khxxXm) {
    this.khxxXm = khxxXm;
  }


  public String getKhxxKhlx() {
    return khxxKhlx;
  }

  public void setKhxxKhlx(String khxxKhlx) {
    this.khxxKhlx = khxxKhlx;
  }


  public String getKhxxKhhy() {
    return khxxKhhy;
  }

  public void setKhxxKhhy(String khxxKhhy) {
    this.khxxKhhy = khxxKhhy;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public String getKhBh() {
    return khBh;
  }

  public void setKhBh(String khBh) {
    this.khBh = khBh;
  }


  public String getUserMc() {
    return userMc;
  }

  public void setUserMc(String userMc) {
    this.userMc = userMc;
  }

}
