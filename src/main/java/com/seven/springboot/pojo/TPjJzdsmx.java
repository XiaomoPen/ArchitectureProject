package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjJzdsmx {

  private Integer jzdsmxId;
  private String jzdsmxGsmc;
  private double jzdsmxTbbj;
  private double jzdsmxPcl;
  private double jzdsmxXfqk;
  private Integer jzdsmxPm;
  private String jzdsmxBz;
  private Integer jzdsmxZt;
  private String kbdjBh;


  public Integer getJzdsmxId() {
    return jzdsmxId;
  }

  public void setJzdsmxId(Integer jzdsmxId) {
    this.jzdsmxId = jzdsmxId;
  }


  public String getJzdsmxGsmc() {
    return jzdsmxGsmc;
  }

  public void setJzdsmxGsmc(String jzdsmxGsmc) {
    this.jzdsmxGsmc = jzdsmxGsmc;
  }


  public double getJzdsmxTbbj() {
    return jzdsmxTbbj;
  }

  public void setJzdsmxTbbj(double jzdsmxTbbj) {
    this.jzdsmxTbbj = jzdsmxTbbj;
  }


  public double getJzdsmxPcl() {
    return jzdsmxPcl;
  }

  public void setJzdsmxPcl(double jzdsmxPcl) {
    this.jzdsmxPcl = jzdsmxPcl;
  }


  public double getJzdsmxXfqk() {
    return jzdsmxXfqk;
  }

  public void setJzdsmxXfqk(double jzdsmxXfqk) {
    this.jzdsmxXfqk = jzdsmxXfqk;
  }


  public Integer getJzdsmxPm() {
    return jzdsmxPm;
  }

  public void setJzdsmxPm(Integer jzdsmxPm) {
    this.jzdsmxPm = jzdsmxPm;
  }


  public String getJzdsmxBz() {
    return jzdsmxBz;
  }

  public void setJzdsmxBz(String jzdsmxBz) {
    this.jzdsmxBz = jzdsmxBz;
  }


  public Integer getJzdsmxZt() {
    return jzdsmxZt;
  }

  public void setJzdsmxZt(Integer jzdsmxZt) {
    this.jzdsmxZt = jzdsmxZt;
  }


  public String getKbdjBh() {
    return kbdjBh;
  }

  public void setKbdjBh(String kbdjBh) {
    this.kbdjBh = kbdjBh;
  }

}
