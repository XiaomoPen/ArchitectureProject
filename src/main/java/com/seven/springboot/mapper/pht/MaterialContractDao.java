package com.seven.springboot.mapper.pht;

import com.seven.springboot.pojo.TPjClcrkmx;
import com.seven.springboot.pojo.TPjMaterialContract;
import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.vo.pht.MaterialContractInfoVo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MaterialContractDao {

    //新增材料合同表
    @Insert("insert into t_pj_materialContract value (#{contractNumber},#{lxxxdjBh},#{gysBh},#{planNumber},#{userNumber},#{contractApproval});")
    public Integer addContract(TPjMaterialContract contract);

    //新增材料合同详细表
    @Insert("insert into t_pj_materialContractDetailed values (#{contractNumber},#{contractAwardTime},#{contractName},#{contractType},#{contractStartTime},#{contractEndTime},#{contractMoney},#{contractMoneyMax},#{contractAdvanceCharge},#{contractBond},#{contractSupplierPeople},#{contractPayment},#{contractSettlement},#{contractDelivery},#{contractAppointmentAddress},#{contractBookPeople},#{contractPaymentCondition},#{contractMainRequirement},#{contractMask})")
    public Integer addContractDetailed(TPjMaterialContractDetailed detailed);

    //批量新增材料合同材料明细表
    public Integer addClcrkmx(List<TPjClcrkmx> tPjClcrkmxs);

    //获取材料合同信息总数量
    @Select("select count(*) from t_pj_materialContract")
    public Integer getMaterialContractSum();

    //分页查询材料合同信息
    @Select("select * from t_pj_materialContract mc left join t_pj_lxxxdj ld on mc.lxxxdj_bh=ld.lxxxdj_bh left join t_pj_gys pg on mc.gys_bh=pg.gys_bh left join t_pj_materialContractDetailed mcd on mc.contract_number=mcd.contract_number left join t_pm_user pu on mc.user_number=pu.user_number limit #{page},10")
    public List<MaterialContractInfoVo> getMaterialContratlimit(@Param("page") Integer page);

    //分页查询材料合同信息
    @Select("select * from t_pj_materialContract mc left join t_pj_lxxxdj ld on mc.lxxxdj_bh=ld.lxxxdj_bh left join t_pj_gys pg on mc.gys_bh=pg.gys_bh left join t_pj_materialContractDetailed mcd on mc.contract_number=mcd.contract_number left join t_pm_user pu on mc.user_number=pu.user_number where mcd.contract_name like '%${data}%' or pu.user_name like '%${data}%'")
    public List<MaterialContractInfoVo> getMaterialContratSearch(@Param("data") String data);

    //修改材料合同审批进度
    @Update("update t_pj_materialContract set contract_approval=#{approval} where contract_number=#{number}")
    public Integer upMaterialContratToApprovalByNumber(@Param("number") String number,@Param("approval") Integer approval);

    //删除材料合同
    @Delete("delete from t_pj_materialContract where contract_number=#{number}")
    public void delMCbyNumber(@Param("number") String number);

    //删除材料合同详情
    @Delete("delete from t_pj_materialContractDetailed where contract_number=#{number}")
    public void delMCDbyNumber(@Param("number") String number);

    //删除材料合同明细表
    @Delete("delete from t_pj_clcrkmx where clcrk_number=#{number}")
    public void delClcrkmxbyNumber(@Param("number") String number);

    //通过材料合同编号获取该材料信息
    @Select("select * from t_pj_materialContract where contract_number=#{number}")
    public TPjMaterialContract getContractByNumber(@Param("number") String  number);

    //通过材料合同编号获取该材料详细信息
    @Select("select * from t_pj_materialContractDetailed where contract_number=#{number}")
    public TPjMaterialContractDetailed getContractDetailedByNumber(@Param("number") String  number);

    //通过材料合同编号获取该材料明细信息
    @Select("select * from t_pj_clcrkmx where clcrkmx_number=#{number}")
    public List<TPjClcrkmx> getClcrkmxByNumber(@Param("number") String  number);
}
