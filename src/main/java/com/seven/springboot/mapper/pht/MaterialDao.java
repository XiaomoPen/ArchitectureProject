package com.seven.springboot.mapper.pht;

import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.pojo.TPjMaterialPlan;
import com.seven.springboot.pojo.TPjMaterialPlanDetailed;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MaterialDao {

    @Select("select * from t_pj_materialContractDetailed")
    public List<TPjMaterialContractDetailed> getMaterialContractDetailed();

    //新增材料计划表
    @Insert("insert into t_pj_materialPlan value (#{planNumber},#{userNumber},#{lxxxdjBh},#{planName},#{planPerson},#{planMask},#{planDate},#{planApproval},#{planType},#{planSource})")
    public Integer addMaterial(TPjMaterialPlan material);

    //批量新增材料明细
    public Integer addMaterialDetails(List<TPjMaterialPlanDetailed> detaileds);

    //通过材料计划类别获取对应的材料总量
    @Select("select count(*) from t_pj_materialPlan where plan_type=#{type}")
    public Integer getMaterialPlanSum(@Param("type") Integer type);

    //通过材料计划类别、分页，获取对应的材料计划
    @Select("select * from t_pj_materialPlan where plan_type=#{type} limit #{page},10")
    public List<TPjMaterialPlan> getMaterialPlanByLimit(@Param("type") Integer type, @Param("page") Integer page);

    //通过编制人、计划名称等信息，查询材料需用计划数据
    @Select("select * from t_pj_materialPlan where plan_person like '%${data}%' or plan_name like '%${data}%' and plan_type=#{type}")
    public List<TPjMaterialPlan> getMaterialPlanBynameOrpersonal(@Param("data") String data,@Param("type") Integer type);

    //修改材料需用计划表中的审批状态
    @Select("update t_pj_materialPlan set plan_approval=#{approval} where plan_number=#{number}")
    public Integer upMaterialApproval(@Param("approval") Integer approval,@Param("number") String planNumber);

    //通过计划编号删除材料计划表数据
    @Delete("delete from t_pj_materialPlan where plan_number=#{number}")
    public void delMaterial(@Param("number") String number);

    //通过计划编号删除材料计划明细表数据
    @Delete("delete from t_pj_materialPlanDetailed where plan_number=#{number}")
    public void delMaterialDetailed(@Param("number") String number);

    //通过的审批进度与材料分类获取材料计划
    @Select("select * from t_pj_materialPlan where plan_approval=#{approval} and plan_type=#{type}")
    public List<TPjMaterialPlan> getMaterialPlansByApprovalOrType(@Param("approval") Integer approval,@Param("type") Integer type);

}
