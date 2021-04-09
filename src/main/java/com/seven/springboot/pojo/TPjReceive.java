package com.seven.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPjReceive {
    private String receiveDrawingNumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date receiveApplicationDate;
    private String receiveModelNumber;
    private Integer receiveDuration;
    private Integer receiveTypeOfUse;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date receiveDateOfService;
    private String receiveReason;
    private String receiveRequire;
    private Integer receiveProcessState;
    private String receiveCompany;
    private String receiveApplicant;
    private Integer receiveUrgency;
    private String departmentNumber;
    private String userNumber;
    private String lxxxdjBh;
    private String equipmentCategoryNumber;
    private TPmDepartment departments;
    private TPmUser users;
    private TPjLxxxdj lxxxdjs;
    private TPjEquipment equipment;
}