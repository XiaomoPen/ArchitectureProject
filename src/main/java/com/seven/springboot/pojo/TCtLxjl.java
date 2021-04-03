package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TCtLxjl {

  private String lxjlBh;
  private String khxxXm;
  private String userNumber;
  private String lxjlJd;
  private Timestamp lxjlSj;
  private String lxjlFs;
  private String lxjlXq;
  private Timestamp lxjlXcsj;
  private String lxjlXcmb;


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


  public Timestamp getLxjlSj() {
    return lxjlSj;
  }

  public void setLxjlSj(Timestamp lxjlSj) {
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


  public Timestamp getLxjlXcsj() {
    return lxjlXcsj;
  }

  public void setLxjlXcsj(Timestamp lxjlXcsj) {
    this.lxjlXcsj = lxjlXcsj;
  }


  public String getLxjlXcmb() {
    return lxjlXcmb;
  }

  public void setLxjlXcmb(String lxjlXcmb) {
    this.lxjlXcmb = lxjlXcmb;
  }

}
