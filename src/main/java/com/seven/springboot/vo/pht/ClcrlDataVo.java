package com.seven.springboot.vo.pht;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClcrlDataVo {

    private String clcrkNumber;
    private String clcrkName;
    private String lxxxdjXmmc;
    private String gysMc;
    @JSONField(format = "yyyy年MM月dd日")
    private Timestamp  clcrkTime;
    private Integer clcrkApproval;
}
