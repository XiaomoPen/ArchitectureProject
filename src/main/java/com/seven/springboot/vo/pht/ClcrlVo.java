package com.seven.springboot.vo.pht;

import com.seven.springboot.pojo.TPjClcrk;
import com.seven.springboot.pojo.TPjClcrkmx;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClcrlVo {

    private TPjClcrk clcrk;
    private List<TPjClcrkmx> clcrkmxes;
}
