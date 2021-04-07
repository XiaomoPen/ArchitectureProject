package com.seven.springboot.service.pht;

import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.pojo.TPjMaterialPlan;
import com.seven.springboot.pojo.TPjMaterialPlanDetailed;
import com.seven.springboot.vo.pht.MaterialVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MaterialService {

    public List<TPjMaterialContractDetailed> getMaterialContractDetailed();

    //新增材料计划表
    public Integer addMaterial(TPjMaterialPlan material,List<TPjMaterialPlanDetailed> detaileds) throws Exception;

    //通过材料计划类别、分页，获取对应的材料计划
    public List<TPjMaterialPlan> getMaterialPlanByLimit(Integer type,Integer page);

    //通过材料计划类别获取对应的材料总量
    public Integer getMaterialPlanSum(Integer type);

    //通过编制人、计划名称等信息，查询材料需用计划数据
    public List<TPjMaterialPlan> getMaterialPlanBynameOrpersonal(String data,Integer type);

    //修改材料需用计划表中的审批状态
    public Integer upMaterialApproval(Integer approval,String planNumber);

    //通过计划编号删除材料计划表数据
    public void delMaterial(String number);

    //通过的审批进度与材料分类获取材料计划
    public List<TPjMaterialPlan> getMaterialPlansByApprovalOrType(Integer approval,Integer type);

    //通过计划编号获取对应数据信息
    public MaterialVo getMaterialPlanByNumber(String number);
}