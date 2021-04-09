package com.seven.springboot.vo.ly;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParamsVo {
    private String departmentName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date useDateStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endOfUseDate;
    private Integer approvalStatus;
    private String number;
    private String userName;
    private String equipmentName;
    private String applicant;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applicationDateStarts;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endOfApplicationDate;
    private Integer status;
    private Integer page=1;
    private Integer limit=10;
}
