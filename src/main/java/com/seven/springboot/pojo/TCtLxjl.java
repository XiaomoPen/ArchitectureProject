package com.seven.springboot.pojo;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TCtLxjl {

  private String lxjlBh;
  private String khxxXm;
  private String userNumber;
  private String lxjlJd;
  private java.sql.Timestamp lxjlSj;
  private String lxjlFs;
  private String lxjlXq;
  private java.sql.Timestamp lxjlXcsj;
  private String lxjlXcmb;
  private String userMc;
  private String khxxBh;


  public String getLxjlBh() {
    return lxjlBh;
  }

  public void setLxjlBh(String lxjlBh) {
    this.lxjlBh = lxjlBh;
  }


  public String getKhxxXm() {
    return khxxXm;
  }

  public void setKhxxXm(String khxxXm) {
    this.khxxXm = khxxXm;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }


  public String getLxjlJd() {
    return lxjlJd;
  }

  public void setLxjlJd(String lxjlJd) {
    this.lxjlJd = lxjlJd;
  }


  public java.sql.Timestamp getLxjlSj() {
    return lxjlSj;
  }

  public void setLxjlSj(java.sql.Timestamp lxjlSj) {
    this.lxjlSj = lxjlSj;
  }


  public String getLxjlFs() {
    return lxjlFs;
  }

  public void setLxjlFs(String lxjlFs) {
    this.lxjlFs = lxjlFs;
  }


  public String getLxjlXq() {
    return lxjlXq;
  }

  public void setLxjlXq(String lxjlXq) {
    this.lxjlXq = lxjlXq;
  }


  public java.sql.Timestamp getLxjlXcsj() {
    return lxjlXcsj;
  }

  public void setLxjlXcsj(java.sql.Timestamp lxjlXcsj) {
    this.lxjlXcsj = lxjlXcsj;
  }


  public String getLxjlXcmb() {
    return lxjlXcmb;
  }

  public void setLxjlXcmb(String lxjlXcmb) {
    this.lxjlXcmb = lxjlXcmb;
  }


  public String getUserMc() {
    return userMc;
  }

  public void setUserMc(String userMc) {
    this.userMc = userMc;
  }


  public String getKhxxBh() {
    return khxxBh;
  }

  public void setKhxxBh(String khxxBh) {
    this.khxxBh = khxxBh;
  }

}
