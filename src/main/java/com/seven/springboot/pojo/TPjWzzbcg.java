package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjWzzbcg {

  private Integer wzzbcgId;
  private Timestamp wzzbcgRq;
  private String wzzbcgBh;
  private String wzzbcgXmmc;
  private String wzzbcgBzr;
  private String wzzbcgBz;
  private Integer wzzbcgSpjg;
  private Integer zbjgdjId;


  public Integer getWzzbcgId() {
    return wzzbcgId;
  }

  public void setWzzbcgId(Integer wzzbcgId) {
    this.wzzbcgId = wzzbcgId;
  }


  public Timestamp getWzzbcgRq() {
    return wzzbcgRq;
  }

  public void setWzzbcgRq(Timestamp wzzbcgRq) {
    this.wzzbcgRq = wzzbcgRq;
  }


  public String getWzzbcgBh() {
    return wzzbcgBh;
  }

  public void setWzzbcgBh(String wzzbcgBh) {
    this.wzzbcgBh = wzzbcgBh;
  }


  public String getWzzbcgXmmc() {
    return wzzbcgXmmc;
  }

  public void setWzzbcgXmmc(String wzzbcgXmmc) {
    this.wzzbcgXmmc = wzzbcgXmmc;
  }


  public String getWzzbcgBzr() {
    return wzzbcgBzr;
  }

  public void setWzzbcgBzr(String wzzbcgBzr) {
    this.wzzbcgBzr = wzzbcgBzr;
  }


  public String getWzzbcgBz() {
    return wzzbcgBz;
  }

  public void setWzzbcgBz(String wzzbcgBz) {
    this.wzzbcgBz = wzzbcgBz;
  }


  public Integer getWzzbcgSpjg() {
    return wzzbcgSpjg;
  }

  public void setWzzbcgSpjg(Integer wzzbcgSpjg) {
    this.wzzbcgSpjg = wzzbcgSpjg;
  }


  public Integer getZbjgdjId() {
    return zbjgdjId;
  }

  public void setZbjgdjId(Integer zbjgdjId) {
    this.zbjgdjId = zbjgdjId;
  }

}
