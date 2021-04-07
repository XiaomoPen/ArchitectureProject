package com.seven.springboot.controller.pht;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.pojo.TPjMaterialPlan;
import com.seven.springboot.pojo.TPjMaterialPlanDetailed;
import com.seven.springboot.service.pht.MaterialService;
import com.seven.springboot.utils.RandomNumber;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.vo.pht.MaterialVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private MaterialService materialService;
    @Autowired
    private RandomNumber randomNumber;

    //新增材料计划
    @PostMapping("/addMaterial")
    public RestContent addMaterial(@RequestBody MaterialVo materialVo){
        TPjMaterialPlan plans = materialVo.getPlans();
        if(null==plans){
            return returnContent.getContent(null,"","上传数据错误");
        }
        String planNumber=randomNumber.getOrder();
        plans.setPlanNumber(planNumber);
        plans.setPlanDate(new Timestamp(new Date().getTime()));
        plans.setPlanApproval(0);
        List<TPjMaterialPlanDetailed> detaileds = materialVo.getDetaileds();
        for(int i=0;i<detaileds.size();i++){
            TPjMaterialPlanDetailed detailed = detaileds.get(i);
            detailed.setPlanNumber(planNumber);
            detaileds.set(i,detailed);
        }
        Integer integer = null;
        try {
            integer = materialService.addMaterial(plans,detaileds);
            if(integer!=null&&integer>0){
                return returnContent.getContent(integer,"新增数据成功","新增数据失败");
            }else{
                return returnContent.getContent(null,"","新增数据失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return returnContent.getContent(null,"","新增数据失败");
        }
    }
    //获取材料计划总数量
    @GetMapping("/getMaterialPlanSum/{type}")
    public RestContent getMaterialPlanSum(@PathVariable Integer type){
        Integer sum = materialService.getMaterialPlanSum(type);
        return returnContent.getContent(sum,"获取数据成功","获取数据失败");
    }
    //获取分页材料计划
    @GetMapping("/getLimitMaterial/{type}/{page}")
    public RestContent getLimitMaterial(@PathVariable Integer type,@PathVariable Integer page){
        List<TPjMaterialPlan> materialPlans = materialService.getMaterialPlanByLimit(type, (page-1)*10);
        return returnContent.getContent(JSON.toJSONString(materialPlans),"获取数据成功","获取数据失败");
    }
    //搜索查询
    @GetMapping("/serchMaterial/{type}/{data}")
    public RestContent getLimitMaterial(@PathVariable String data,@PathVariable Integer type){
        List<TPjMaterialPlan> materialPlans = materialService.getMaterialPlanBynameOrpersonal(data,type);
        return returnContent.getContent(JSON.toJSONString(materialPlans),"获取数据成功","获取数据失败");
    }
    //提交审批
    @PostMapping("/upMaterialSubmit/{number}")
    public RestContent upMaterialSubmit(@PathVariable String number){
        Integer integer = materialService.upMaterialApproval(1, number);
        return returnContent.getContent(JSON.toJSONString(integer),"数据更新成功","数据更新失败");
    }
    //确认审批
    @PostMapping("/upMaterialSure/{number}")
    public RestContent upMaterialSure(@PathVariable String number){
        Integer integer = materialService.upMaterialApproval(2, number);
        return returnContent.getContent(JSON.toJSONString(integer),"数据更新成功","数据更新失败");
    }
    //不同意审批
    @PostMapping("/upMaterialnoSure/{number}")
    public RestContent upMaterialnoSure(@PathVariable String number){
        Integer integer = materialService.upMaterialApproval(3, number);
        return returnContent.getContent(JSON.toJSONString(integer),"数据更新成功","数据更新失败");
    }
    //删除材料计划
    @PostMapping("/delMaterialno/{number}")
    public RestContent delMaterialno(@PathVariable String number){
        try {
            materialService.delMaterial(number);
            return returnContent.getContent(1,"数据删除成功","");
        }catch (Exception e){
            e.printStackTrace();
            return returnContent.getContent(number,"","数据删除失败");
        }
    }
    //获取已通过审批的材料总计划
    @GetMapping("/getTotalMaterialno")
    public RestContent getTotalMaterialno(){
        List<TPjMaterialPlan> materials = materialService.getMaterialPlansByApprovalOrType(2, 0);
        return returnContent.getContent(materials,"获取数据成功","获取数据失败");
    }
    //获取已通过审批的材料需用计划
    @GetMapping("/getNeedMaterialno")
    public RestContent getNeedMaterialno(){
        List<TPjMaterialPlan> materials = materialService.getMaterialPlansByApprovalOrType(2, 1);
        return returnContent.getContent(materials,"获取数据成功","获取数据失败");
    }
    //通过计划编号获取对应数据信息
    @GetMapping("/getMaterialByNumber/{number}")
    public RestContent getMaterialByNumber(@PathVariable String number){
        MaterialVo materialPlanByNumber = materialService.getMaterialPlanByNumber(number);
        return returnContent.getContent(JSON.toJSONString(materialPlanByNumber),"获取数据成功","获取数据失败");
    }
}
