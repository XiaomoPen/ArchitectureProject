package com.seven.springboot.service.pht.impl;

import com.seven.springboot.mapper.pht.MaterialDao;
import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.pojo.TPjMaterialPlan;
import com.seven.springboot.pojo.TPjMaterialPlanDetailed;
import com.seven.springboot.service.pht.MaterialService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MaterialServiceImpl implements MaterialService {


    @Resource
    private MaterialDao materialDao;
    
    public List<TPjMaterialContractDetailed> getMaterialContractDetailed() {
        return materialDao.getMaterialContractDetailed();
    }

    public Integer addMaterial(TPjMaterialPlan material,List<TPjMaterialPlanDetailed> detaileds) throws Exception {
        Integer inte = materialDao.addMaterial(material);
        if(null==detaileds||detaileds.size()==0){
            return inte;
        }
        Integer integer1 = materialDao.addMaterialDetails(detaileds);
        if (inte==null||integer1==null){
            throw new Exception("新增材料计划失败");
        }
        if(inte==0||integer1==0){
            throw new Exception("新增材料计划失败");
        }
        return 1;
    }

    public List<TPjMaterialPlan> getMaterialPlanByLimit(Integer type, Integer page) {
        return materialDao.getMaterialPlanByLimit(type,page);
    }

    public Integer getMaterialPlanSum(Integer type) {
        return materialDao.getMaterialPlanSum(type);
    }

    public List<TPjMaterialPlan> getMaterialPlanBynameOrpersonal(String data,Integer type) {
        return materialDao.getMaterialPlanBynameOrpersonal(data,type);
    }

    public Integer upMaterialApproval(Integer approval, String planNumber) {
        return materialDao.upMaterialApproval(approval,planNumber);
    }

    public void delMaterial(final String number) {
        new Thread(new Runnable() {
            public void run() {
                materialDao.delMaterialDetailed(number);
                materialDao.delMaterial(number);
            }
        }).start();
    }

    public List<TPjMaterialPlan> getMaterialPlansByApprovalOrType(Integer approval, Integer type) {
        return materialDao.getMaterialPlansByApprovalOrType(approval,type);
    }

}
