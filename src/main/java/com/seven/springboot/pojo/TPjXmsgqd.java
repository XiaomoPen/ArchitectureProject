package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjXmsgqd {

  private Integer xmsgqdId;
  private String xmsgqdBh;
  private String xmsgqdMc;
  private String xmsgqdDw;
  private double xmsgqdGcl;
  private double xmsgqdDj;
  private double xmsgqdHj;
  private String xmsgqdBz;
  private String xmsgqdZt;
  private String lxxxdjBh;


  public Integer getXmsgqdId() {
    return xmsgqdId;
  }

  public void setXmsgqdId(Integer xmsgqdId) {
    this.xmsgqdId = xmsgqdId;
  }


  public String getXmsgqdBh() {
    return xmsgqdBh;
  }

  public void setXmsgqdBh(String xmsgqdBh) {
    this.xmsgqdBh = xmsgqdBh;
  }


  public String getXmsgqdMc() {
    return xmsgqdMc;
  }

  public void setXmsgqdMc(String xmsgqdMc) {
    this.xmsgqdMc = xmsgqdMc;
  }


  public String getXmsgqdDw() {
    return xmsgqdDw;
  }

  public void setXmsgqdDw(String xmsgqdDw) {
    this.xmsgqdDw = xmsgqdDw;
  }


  public double getXmsgqdGcl() {
    return xmsgqdGcl;
  }

  public void setXmsgqdGcl(double xmsgqdGcl) {
    this.xmsgqdGcl = xmsgqdGcl;
  }


  public double getXmsgqdDj() {
    return xmsgqdDj;
  }

  public void setXmsgqdDj(double xmsgqdDj) {
    this.xmsgqdDj = xmsgqdDj;
  }


  public double getXmsgqdHj() {
    return xmsgqdHj;
  }

  public void setXmsgqdHj(double xmsgqdHj) {
    this.xmsgqdHj = xmsgqdHj;
  }


  public String getXmsgqdBz() {
    return xmsgqdBz;
  }

  public void setXmsgqdBz(String xmsgqdBz) {
    this.xmsgqdBz = xmsgqdBz;
  }


  public String getXmsgqdZt() {
    return xmsgqdZt;
  }

  public void setXmsgqdZt(String xmsgqdZt) {
    this.xmsgqdZt = xmsgqdZt;
  }


  public String getLxxxdjBh() {
    return lxxxdjBh;
  }

  public void setLxxxdjBh(String lxxxdjBh) {
    this.lxxxdjBh = lxxxdjBh;
  }

}
