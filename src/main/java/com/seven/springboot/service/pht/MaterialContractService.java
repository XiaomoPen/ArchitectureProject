package com.seven.springboot.service.pht;

import com.seven.springboot.vo.pht.MaterialContractInfoVo;
import com.seven.springboot.vo.pht.MaterialContractVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MaterialContractService {

    //新增材料合同服务
    public Integer addMaterialContract(MaterialContractVo contractVo);

    //分页查询材料合同信息
    public List<MaterialContractInfoVo> getMaterialContratlimit(Integer page);

    //获取材料合同信息总数量
    public Integer getMaterialContractSum();

    //分页查询材料合同信息
    public List<MaterialContractInfoVo> getMaterialContratSearch(String data);

    //修改材料合同审批进度
    public Integer upMaterialContratToApprovalByNumber(String number,Integer approval);

    //删除材料合同
    public void delMaterialConntract(String number);

    //通过材料编号获取材料合同
    public MaterialContractVo getMaterialContractVo(String number);
}
