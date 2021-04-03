package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjZbbjdb {

  private Integer zbbjdbId;
  private Timestamp zbbjdbRq;
  private String zbbjdbBh;
  private String zbbjdbXmmc;
  private String zbbjdbBzr;
  private String zbbjdbBz;
  private Integer zbbjdbZt;
  private Integer zbjgdjId;


  public Integer getZbbjdbId() {
    return zbbjdbId;
  }

  public void setZbbjdbId(Integer zbbjdbId) {
    this.zbbjdbId = zbbjdbId;
  }


  public Timestamp getZbbjdbRq() {
    return zbbjdbRq;
  }

  public void setZbbjdbRq(Timestamp zbbjdbRq) {
    this.zbbjdbRq = zbbjdbRq;
  }


  public String getZbbjdbBh() {
    return zbbjdbBh;
  }

  public void setZbbjdbBh(String zbbjdbBh) {
    this.zbbjdbBh = zbbjdbBh;
  }


  public String getZbbjdbXmmc() {
    return zbbjdbXmmc;
  }

  public void setZbbjdbXmmc(String zbbjdbXmmc) {
    this.zbbjdbXmmc = zbbjdbXmmc;
  }


  public String getZbbjdbBzr() {
    return zbbjdbBzr;
  }

  public void setZbbjdbBzr(String zbbjdbBzr) {
    this.zbbjdbBzr = zbbjdbBzr;
  }


  public String getZbbjdbBz() {
    return zbbjdbBz;
  }

  public void setZbbjdbBz(String zbbjdbBz) {
    this.zbbjdbBz = zbbjdbBz;
  }


  public Integer getZbbjdbZt() {
    return zbbjdbZt;
  }

  public void setZbbjdbZt(Integer zbbjdbZt) {
    this.zbbjdbZt = zbbjdbZt;
  }


  public Integer getZbjgdjId() {
    return zbjgdjId;
  }

  public void setZbjgdjId(Integer zbjgdjId) {
    this.zbjgdjId = zbjgdjId;
  }

}
