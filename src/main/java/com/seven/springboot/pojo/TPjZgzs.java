package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjZgzs {

  private Integer zgzsId;
  private Timestamp zgzsRq;
  private String zgzsZsbh;
  private String zgzsXmmc;
  private String zgzsXmlx;
  private String zgzsJsdw;
  private String zgzsSqr;
  private String zgzsBz;
  private Integer zgzsSpjg;
  private String tbxxBh;


  public Integer getZgzsId() {
    return zgzsId;
  }

  public void setZgzsId(Integer zgzsId) {
    this.zgzsId = zgzsId;
  }


  public Timestamp getZgzsRq() {
    return zgzsRq;
  }

  public void setZgzsRq(Timestamp zgzsRq) {
    this.zgzsRq = zgzsRq;
  }


  public String getZgzsZsbh() {
    return zgzsZsbh;
  }

  public void setZgzsZsbh(String zgzsZsbh) {
    this.zgzsZsbh = zgzsZsbh;
  }


  public String getZgzsXmmc() {
    return zgzsXmmc;
  }

  public void setZgzsXmmc(String zgzsXmmc) {
    this.zgzsXmmc = zgzsXmmc;
  }


  public String getZgzsXmlx() {
    return zgzsXmlx;
  }

  public void setZgzsXmlx(String zgzsXmlx) {
    this.zgzsXmlx = zgzsXmlx;
  }


  public String getZgzsJsdw() {
    return zgzsJsdw;
  }

  public void setZgzsJsdw(String zgzsJsdw) {
    this.zgzsJsdw = zgzsJsdw;
  }


  public String getZgzsSqr() {
    return zgzsSqr;
  }

  public void setZgzsSqr(String zgzsSqr) {
    this.zgzsSqr = zgzsSqr;
  }


  public String getZgzsBz() {
    return zgzsBz;
  }

  public void setZgzsBz(String zgzsBz) {
    this.zgzsBz = zgzsBz;
  }


  public Integer getZgzsSpjg() {
    return zgzsSpjg;
  }

  public void setZgzsSpjg(Integer zgzsSpjg) {
    this.zgzsSpjg = zgzsSpjg;
  }


  public String getTbxxBh() {
    return tbxxBh;
  }

  public void setTbxxBh(String tbxxBh) {
    this.tbxxBh = tbxxBh;
  }

}
