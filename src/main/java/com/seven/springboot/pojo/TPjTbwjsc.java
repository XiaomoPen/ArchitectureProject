package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjTbwjsc {

  private Integer tbwjscId;
  private Timestamp tbwjscRq;
  private String thwjscTbbh;
  private String tbwjscXmmc;
  private String tbwjscXmlx;
  private String tbwjscJsdw;
  private double tbwjscTbje;
  private String tbwjscSqr;
  private String tbwjscTbnr;
  private Integer tbwjscSpjg;
  private String tbxxBh;


  public Integer getTbwjscId() {
    return tbwjscId;
  }

  public void setTbwjscId(Integer tbwjscId) {
    this.tbwjscId = tbwjscId;
  }


  public Timestamp getTbwjscRq() {
    return tbwjscRq;
  }

  public void setTbwjscRq(Timestamp tbwjscRq) {
    this.tbwjscRq = tbwjscRq;
  }


  public String getThwjscTbbh() {
    return thwjscTbbh;
  }

  public void setThwjscTbbh(String thwjscTbbh) {
    this.thwjscTbbh = thwjscTbbh;
  }


  public String getTbwjscXmmc() {
    return tbwjscXmmc;
  }

  public void setTbwjscXmmc(String tbwjscXmmc) {
    this.tbwjscXmmc = tbwjscXmmc;
  }


  public String getTbwjscXmlx() {
    return tbwjscXmlx;
  }

  public void setTbwjscXmlx(String tbwjscXmlx) {
    this.tbwjscXmlx = tbwjscXmlx;
  }


  public String getTbwjscJsdw() {
    return tbwjscJsdw;
  }

  public void setTbwjscJsdw(String tbwjscJsdw) {
    this.tbwjscJsdw = tbwjscJsdw;
  }


  public double getTbwjscTbje() {
    return tbwjscTbje;
  }

  public void setTbwjscTbje(double tbwjscTbje) {
    this.tbwjscTbje = tbwjscTbje;
  }


  public String getTbwjscSqr() {
    return tbwjscSqr;
  }

  public void setTbwjscSqr(String tbwjscSqr) {
    this.tbwjscSqr = tbwjscSqr;
  }


  public String getTbwjscTbnr() {
    return tbwjscTbnr;
  }

  public void setTbwjscTbnr(String tbwjscTbnr) {
    this.tbwjscTbnr = tbwjscTbnr;
  }


  public Integer getTbwjscSpjg() {
    return tbwjscSpjg;
  }

  public void setTbwjscSpjg(Integer tbwjscSpjg) {
    this.tbwjscSpjg = tbwjscSpjg;
  }


  public String getTbxxBh() {
    return tbxxBh;
  }

  public void setTbxxBh(String tbxxBh) {
    this.tbxxBh = tbxxBh;
  }

}
