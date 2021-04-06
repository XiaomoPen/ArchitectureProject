package com.seven.springboot.controller.pht;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TPjClcrkmx;
import com.seven.springboot.pojo.TPjMaterialContract;
import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.service.pht.MaterialContractService;
import com.seven.springboot.utils.RandomNumber;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.vo.pht.MaterialContractInfoVo;
import com.seven.springboot.vo.pht.MaterialContractVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialContractController {

    @Autowired
    private RandomNumber randomNumber;
    @Autowired
    private ReturnContent returnContent;
    @Resource
    private MaterialContractService contractService;

    //新增材料合同表
    @PostMapping("/addMaterialContract")
    public RestContent addMaterialContract(@RequestBody MaterialContractVo contractVo){
        TPjMaterialContract contract = contractVo.getContract();
        String number=randomNumber.getOrder();
        contract.setContractNumber(number);
        contract.setContractApproval(0);
        contractVo.setContract(contract);
        TPjMaterialContractDetailed detailed = contractVo.getDetailed();
        detailed.setContractNumber(number);
        detailed.setContractAwardTime(new Timestamp(new Date().getTime()));
        List<TPjClcrkmx> clcrkmxs = contractVo.getClcrkmxs();
        for(int i=0;i<clcrkmxs.size();i++){
            TPjClcrkmx tPjClcrkmx = clcrkmxs.get(i);
            tPjClcrkmx.setClcrkNumber(number);
            clcrkmxs.set(i,tPjClcrkmx);
        }
        contractVo.setClcrkmxs(clcrkmxs);
        Integer integer = contractService.addMaterialContract(contractVo);
        return returnContent.getContent(integer,"新增数据成功","新增数据失败");
    }
    //分页查询材料合同信息
    @GetMapping("/getMaterialContract/{page}")
    public RestContent getMaterialContract(@PathVariable Integer page){
        List<MaterialContractInfoVo> limit = contractService.getMaterialContratlimit((page-1)*10);
        return returnContent.getContent(JSON.toJSONString(limit),"数据获取成功","数据获取失败");
    }
    //获取材料合同总数量
    @GetMapping("/getMaterialContractSum")
    public RestContent getMaterialContractSum(){
        Integer sum = contractService.getMaterialContractSum();
        return returnContent.getContent(sum,"数据获取成功","数据获取失败");
    }
    //分页查询材料合同信息
    @GetMapping("/getMaterialContractSearch/{data}")
    public RestContent getMaterialContractSearch(@PathVariable String data){
        List<MaterialContractInfoVo> search = contractService.getMaterialContratSearch(data);
        return returnContent.getContent(JSON.toJSONString(search),"数据获取成功","数据获取失败");
    }
    //发起材料合同审批
    @PostMapping("/upMCapproval/{number}")
    public RestContent upMCapproval(@PathVariable String number){
        Integer integer = contractService.upMaterialContratToApprovalByNumber(number, 1);
        return returnContent.getContent(integer,"审批发起成功","审批发起失败");
    }
    //同意材料合同审批
    @PostMapping("/upMCapprovalSure/{number}")
    public RestContent upMCapprovalSure(@PathVariable String number){
        Integer integer = contractService.upMaterialContratToApprovalByNumber(number, 2);
        return returnContent.getContent(integer,"审批发起成功","审批发起失败");
    }
    //不同意材料合同审批
    @PostMapping("/upMCapprovalnoSure/{number}")
    public RestContent upMCapprovalnoSure(@PathVariable String number){
        Integer integer = contractService.upMaterialContratToApprovalByNumber(number, 3);
        return returnContent.getContent(integer,"审批发起成功","审批发起失败");
    }

    //删除材料合同
    @PostMapping("/delMaterialContract/{number}")
    public RestContent delMaterialContract(@PathVariable String number){
        contractService.delMaterialConntract(number);
        return returnContent.getContent(1,"合同删除申请发起成功","数据删除申请发起失败");
    }
}
