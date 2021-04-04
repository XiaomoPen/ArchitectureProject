package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjXmkc {

  private Integer xmkcId;
  private Timestamp xmkcRq;
  private String xmkcBh;
  private String xmkcXmmc;
  private String xmkcCmlx;
  private String xmkcJsdw;
  private String xmkcCyry;
  private String xmkcSqr;
  private String xmkcKcqk;
  private String xmkcBz;
  private Integer xmkcSpjg;
  private String tbxxBh;
  private String userNumber;


  public Integer getXmkcId() {
    return xmkcId;
  }

  public void setXmkcId(Integer xmkcId) {
    this.xmkcId = xmkcId;
  }


  public Timestamp getXmkcRq() {
    return xmkcRq;
  }

  public void setXmkcRq(Timestamp xmkcRq) {
    this.xmkcRq = xmkcRq;
  }


  public String getXmkcBh() {
    return xmkcBh;
  }

  public void setXmkcBh(String xmkcBh) {
    this.xmkcBh = xmkcBh;
  }


  public String getXmkcXmmc() {
    return xmkcXmmc;
  }

  public void setXmkcXmmc(String xmkcXmmc) {
    this.xmkcXmmc = xmkcXmmc;
  }


  public String getXmkcCmlx() {
    return xmkcCmlx;
  }

  public void setXmkcCmlx(String xmkcCmlx) {
    this.xmkcCmlx = xmkcCmlx;
  }


  public String getXmkcJsdw() {
    return xmkcJsdw;
  }

  public void setXmkcJsdw(String xmkcJsdw) {
    this.xmkcJsdw = xmkcJsdw;
  }


  public String getXmkcCyry() {
    return xmkcCyry;
  }

  public void setXmkcCyry(String xmkcCyry) {
    this.xmkcCyry = xmkcCyry;
  }


  public String getXmkcSqr() {
    return xmkcSqr;
  }

  public void setXmkcSqr(String xmkcSqr) {
    this.xmkcSqr = xmkcSqr;
  }


  public String getXmkcKcqk() {
    return xmkcKcqk;
  }

  public void setXmkcKcqk(String xmkcKcqk) {
    this.xmkcKcqk = xmkcKcqk;
  }


  public String getXmkcBz() {
    return xmkcBz;
  }

  public void setXmkcBz(String xmkcBz) {
    this.xmkcBz = xmkcBz;
  }


  public Integer getXmkcSpjg() {
    return xmkcSpjg;
  }

  public void setXmkcSpjg(Integer xmkcSpjg) {
    this.xmkcSpjg = xmkcSpjg;
  }


  public String getTbxxBh() {
    return tbxxBh;
  }

  public void setTbxxBh(String tbxxBh) {
    this.tbxxBh = tbxxBh;
  }


  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }

}
