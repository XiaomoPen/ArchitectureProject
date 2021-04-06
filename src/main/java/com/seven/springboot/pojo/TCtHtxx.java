package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TCtHtxx {

  private String htxxBh;
  private String htxxMc;
  private Timestamp htxxQdrq;
  private String khxxXm;
  private String userNumber;
  private double thxxHtje;
  private String htxxBz;
  private String khBh;
  private String userMc;


  public String getHtxxBh() {
    return htxxBh;
  }

  public void setHtxxBh(String htxxBh) {
    this.htxxBh = htxxBh;
  }


  public String getHtxxMc() {
    return htxxMc;
  }

  public void setHtxxMc(String htxxMc) {
    this.htxxMc = htxxMc;
  }


  public Timestamp getHtxxQdrq() {
    return htxxQdrq;
  }

  public void setHtxxQdrq(Timestamp htxxQdrq) {
    this.htxxQdrq = htxxQdrq;
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


  public double getThxxHtje() {
    return thxxHtje;
  }

  public void setThxxHtje(double thxxHtje) {
    this.thxxHtje = thxxHtje;
  }


  public String getHtxxBz() {
    return htxxBz;
  }

  public void setHtxxBz(String htxxBz) {
    this.htxxBz = htxxBz;
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
