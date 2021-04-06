package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TCtKhxx {

  private String khxxBh;
  private String khxxXm;
  private String khxxKhlx;
  private String khxxKhhy;
  private String khxxKhly;
  private String khxxKhdj;
  private String khxxKhdh;
  private Timestamp khxxLrsj;
  private String userNumber;
  private String userMc;


  public String getKhxxBh() {
    return khxxBh;
  }

  public void setKhxxBh(String khxxBh) {
    this.khxxBh = khxxBh;
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


  public String getKhxxKhly() {
    return khxxKhly;
  }

  public void setKhxxKhly(String khxxKhly) {
    this.khxxKhly = khxxKhly;
  }


  public String getKhxxKhdj() {
    return khxxKhdj;
  }

  public void setKhxxKhdj(String khxxKhdj) {
    this.khxxKhdj = khxxKhdj;
  }


  public String getKhxxKhdh() {
    return khxxKhdh;
  }

  public void setKhxxKhdh(String khxxKhdh) {
    this.khxxKhdh = khxxKhdh;
  }


  public Timestamp getKhxxLrsj() {
    return khxxLrsj;
  }

  public void setKhxxLrsj(Timestamp khxxLrsj) {
    this.khxxLrsj = khxxLrsj;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public String getUserMc() {
    return userMc;
  }

  public void setUserMc(String userMc) {
    this.userMc = userMc;
  }

}
