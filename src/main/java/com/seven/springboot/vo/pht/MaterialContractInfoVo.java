package com.seven.springboot.vo.pht;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialContractInfoVo {

    private String contractNumber;
    private String contractName;
    private String contractMoney;
    private String lxxxdjXmmc;
    private String gysMc;
    @JSONField(format = "yyyy年MM月dd日")
    private Timestamp contractAwardTime;
    private String userName;
    private Integer contractApproval;
}
