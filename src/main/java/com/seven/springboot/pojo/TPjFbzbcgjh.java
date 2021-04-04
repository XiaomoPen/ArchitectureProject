package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjFbzbcgjh {

  private Integer fbzbcgjhId;
  private Timestamp fbzbcgjhRq;
  private String fbzbcgjhBh;
  private String fbzbcgjhXmmc;
  private String fbzbcgjhBzr;
  private String fbzbcgjhBz;
  private Integer fbzbcgjhZt;
  private Integer zbjgdjId;


  public Integer getFbzbcgjhId() {
    return fbzbcgjhId;
  }

  public void setFbzbcgjhId(Integer fbzbcgjhId) {
    this.fbzbcgjhId = fbzbcgjhId;
  }


  public Timestamp getFbzbcgjhRq() {
    return fbzbcgjhRq;
  }

  public void setFbzbcgjhRq(Timestamp fbzbcgjhRq) {
    this.fbzbcgjhRq = fbzbcgjhRq;
  }


  public String getFbzbcgjhBh() {
    return fbzbcgjhBh;
  }

  public void setFbzbcgjhBh(String fbzbcgjhBh) {
    this.fbzbcgjhBh = fbzbcgjhBh;
  }


  public String getFbzbcgjhXmmc() {
    return fbzbcgjhXmmc;
  }

  public void setFbzbcgjhXmmc(String fbzbcgjhXmmc) {
    this.fbzbcgjhXmmc = fbzbcgjhXmmc;
  }


  public String getFbzbcgjhBzr() {
    return fbzbcgjhBzr;
  }

  public void setFbzbcgjhBzr(String fbzbcgjhBzr) {
    this.fbzbcgjhBzr = fbzbcgjhBzr;
  }


  public String getFbzbcgjhBz() {
    return fbzbcgjhBz;
  }

  public void setFbzbcgjhBz(String fbzbcgjhBz) {
    this.fbzbcgjhBz = fbzbcgjhBz;
  }


  public Integer getFbzbcgjhZt() {
    return fbzbcgjhZt;
  }

  public void setFbzbcgjhZt(Integer fbzbcgjhZt) {
    this.fbzbcgjhZt = fbzbcgjhZt;
  }


  public Integer getZbjgdjId() {
    return zbjgdjId;
  }

  public void setZbjgdjId(Integer zbjgdjId) {
    this.zbjgdjId = zbjgdjId;
  }

}
