package com.seven.springboot.vo.pht;

import com.seven.springboot.pojo.TPjClcrkmx;
import com.seven.springboot.pojo.TPjMaterialContract;
import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialContractVo {

    private TPjMaterialContract contract;
    private TPjMaterialContractDetailed detailed;
    private List<TPjClcrkmx> clcrkmxs;
}
