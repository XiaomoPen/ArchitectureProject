package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjKbdj {

  private Integer kbdjId;
  private Timestamp kbdjRq;
  private String kbdjBh;
  private String kbdjXmmc;
  private String kbdjXmlx;
  private Timestamp kbdjKbsj;
  private String kbdjKbdd;
  private double kbdjLbjg;
  private double kbdjPbjzz;
  private String kbdjYzbr;
  private String kbdjLrr;
  private String kbdjBz;
  private Integer kbdjSpjg;
  private String tbxxBh;


  public Integer getKbdjId() {
    return kbdjId;
  }

  public void setKbdjId(Integer kbdjId) {
    this.kbdjId = kbdjId;
  }


  public Timestamp getKbdjRq() {
    return kbdjRq;
  }

  public void setKbdjRq(Timestamp kbdjRq) {
    this.kbdjRq = kbdjRq;
  }


  public String getKbdjBh() {
    return kbdjBh;
  }

  public void setKbdjBh(String kbdjBh) {
    this.kbdjBh = kbdjBh;
  }


  public String getKbdjXmmc() {
    return kbdjXmmc;
  }

  public void setKbdjXmmc(String kbdjXmmc) {
    this.kbdjXmmc = kbdjXmmc;
  }


  public String getKbdjXmlx() {
    return kbdjXmlx;
  }

  public void setKbdjXmlx(String kbdjXmlx) {
    this.kbdjXmlx = kbdjXmlx;
  }


  public Timestamp getKbdjKbsj() {
    return kbdjKbsj;
  }

  public void setKbdjKbsj(Timestamp kbdjKbsj) {
    this.kbdjKbsj = kbdjKbsj;
  }


  public String getKbdjKbdd() {
    return kbdjKbdd;
  }

  public void setKbdjKbdd(String kbdjKbdd) {
    this.kbdjKbdd = kbdjKbdd;
  }


  public double getKbdjLbjg() {
    return kbdjLbjg;
  }

  public void setKbdjLbjg(double kbdjLbjg) {
    this.kbdjLbjg = kbdjLbjg;
  }


  public double getKbdjPbjzz() {
    return kbdjPbjzz;
  }

  public void setKbdjPbjzz(double kbdjPbjzz) {
    this.kbdjPbjzz = kbdjPbjzz;
  }


  public String getKbdjYzbr() {
    return kbdjYzbr;
  }

  public void setKbdjYzbr(String kbdjYzbr) {
    this.kbdjYzbr = kbdjYzbr;
  }


  public String getKbdjLrr() {
    return kbdjLrr;
  }

  public void setKbdjLrr(String kbdjLrr) {
    this.kbdjLrr = kbdjLrr;
  }


  public String getKbdjBz() {
    return kbdjBz;
  }

  public void setKbdjBz(String kbdjBz) {
    this.kbdjBz = kbdjBz;
  }


  public Integer getKbdjSpjg() {
    return kbdjSpjg;
  }

  public void setKbdjSpjg(Integer kbdjSpjg) {
    this.kbdjSpjg = kbdjSpjg;
  }


  public String getTbxxBh() {
    return tbxxBh;
  }

  public void setTbxxBh(String tbxxBh) {
    this.tbxxBh = tbxxBh;
  }

}
