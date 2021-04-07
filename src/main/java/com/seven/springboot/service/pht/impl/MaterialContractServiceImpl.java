package com.seven.springboot.service.pht.impl;

import com.seven.springboot.mapper.pht.MaterialContractDao;
import com.seven.springboot.pojo.TPjClcrkmx;
import com.seven.springboot.pojo.TPjMaterialContract;
import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.service.pht.MaterialContractService;
import com.seven.springboot.vo.pht.MaterialContractInfoVo;
import com.seven.springboot.vo.pht.MaterialContractVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MaterialContractServiceImpl implements MaterialContractService {

    @Resource
    private MaterialContractDao contractDao;

    public Integer addMaterialContract(MaterialContractVo contractVo) {
        TPjMaterialContract contract = contractVo.getContract();
        if(contract==null){
            return null;
        }
        Integer inte = contractDao.addContract(contract);
        if(inte>0){
            TPjMaterialContractDetailed detailed = contractVo.getDetailed();
            List<TPjClcrkmx> clcrkmxs = contractVo.getClcrkmxs();
            contractDao.addContractDetailed(detailed);
            contractDao.addClcrkmx(clcrkmxs);
            return 1;
        }
        return null;
    }

    public List<MaterialContractInfoVo> getMaterialContratlimit(Integer page) {
        return contractDao.getMaterialContratlimit(page);
    }

    public Integer getMaterialContractSum() {
        return contractDao.getMaterialContractSum();
    }

    public List<MaterialContractInfoVo> getMaterialContratSearch(String data) {
        return contractDao.getMaterialContratSearch(data);
    }

    public Integer upMaterialContratToApprovalByNumber(String number, Integer approval) {
        return contractDao.upMaterialContratToApprovalByNumber(number,approval);
    }

    public void delMaterialConntract(String number) {
        contractDao.delClcrkmxbyNumber(number);
        contractDao.delMCDbyNumber(number);
        contractDao.delMCbyNumber(number);
    }

    @Override
    public MaterialContractVo getMaterialContractVo(String number) {
        TPjMaterialContract contract = contractDao.getContractByNumber(number);
        TPjMaterialContractDetailed contractDetailed = contractDao.getContractDetailedByNumber(number);
        List<TPjClcrkmx> clcrkmxes = contractDao.getClcrkmxByNumber(number);
        MaterialContractVo materialContractVo=new MaterialContractVo();
        materialContractVo.setContract(contract);
        materialContractVo.setDetailed(contractDetailed);
        materialContractVo.setClcrkmxs(clcrkmxes);
        return materialContractVo;
    }
}
