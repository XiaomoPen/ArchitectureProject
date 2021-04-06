package com.seven.springboot.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjMaterialContract {

  private String contractNumber;
  private String lxxxdjBh;
  private String gysBh;
  private String planNumber;
  private String userNumber;
  private Integer contractApproval;

}
