package com.seven.springboot.pojo;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TCtLxr {

  private String lxrBh;
  private String khxxBh;
  private String lxrXm;
  private String lxrDh;
  private String lxrZw;
  private String lxrYxl;
  private String lxrZt;
  private String khxxXm;


  public String getLxrBh() {
    return lxrBh;
  }

  public void setLxrBh(String lxrBh) {
    this.lxrBh = lxrBh;
  }


  public String getKhxxBh() {
    return khxxBh;
  }

  public void setKhxxBh(String khxxBh) {
    this.khxxBh = khxxBh;
  }


  public String getLxrXm() {
    return lxrXm;
  }

  public void setLxrXm(String lxrXm) {
    this.lxrXm = lxrXm;
  }


  public String getLxrDh() {
    return lxrDh;
  }

  public void setLxrDh(String lxrDh) {
    this.lxrDh = lxrDh;
  }


  public String getLxrZw() {
    return lxrZw;
  }

  public void setLxrZw(String lxrZw) {
    this.lxrZw = lxrZw;
  }


  public String getLxrYxl() {
    return lxrYxl;
  }

  public void setLxrYxl(String lxrYxl) {
    this.lxrYxl = lxrYxl;
  }


  public String getLxrZt() {
    return lxrZt;
  }

  public void setLxrZt(String lxrZt) {
    this.lxrZt = lxrZt;
  }


  public String getKhxxXm() {
    return khxxXm;
  }

  public void setKhxxXm(String khxxXm) {
    this.khxxXm = khxxXm;
  }

}
