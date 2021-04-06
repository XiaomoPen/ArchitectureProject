package com.seven.springboot.vo.pht;

import com.seven.springboot.pojo.TPjMaterialPlan;
import com.seven.springboot.pojo.TPjMaterialPlanDetailed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialVo {

    private TPjMaterialPlan plans;
    private List<TPjMaterialPlanDetailed> detaileds;
}
