package com.seven.springboot.service.pht.impl;

import com.seven.springboot.mapper.pht.ClcrkDao;
import com.seven.springboot.pojo.TPjClcrk;
import com.seven.springboot.pojo.TPjClcrkmx;
import com.seven.springboot.service.pht.ClcrlService;
import com.seven.springboot.vo.pht.ClcrlDataVo;
import com.seven.springboot.vo.pht.ClcrlVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ClcrlServiceImpl implements ClcrlService {

    @Resource
    private ClcrkDao clcrkDao;

    @Override
    public Integer addClcrl(ClcrlVo clcrlVo) {
        TPjClcrk clcrk = clcrlVo.getClcrk();
        if(null==clcrk){
            return 0;
        }
        Integer integer = clcrkDao.addClcrk(clcrk);
        if(null==integer||integer==0){
            return 0;
        }
        List<TPjClcrkmx> clcrkmxes = clcrlVo.getClcrkmxes();
        if(null!=clcrkmxes&&clcrkmxes.size()>0){
            return clcrkDao.beathAddClcrkms(clcrkmxes);
        }
        return 1;
    }

    @Override
    public Integer getClcrkSum() {
        return clcrkDao.getClcrkSum();
    }

    @Override
    public List<ClcrlDataVo> getClcrltoLimit(Integer page) {
        return clcrkDao.getClcrltoLimit(page);
    }

    @Override
    public List<ClcrlDataVo> getClcrltoSearch(String data) {
        return clcrkDao.getClcrltoSearch(data);
    }

    @Override
    public Integer upClcrkApprovalByNumber(Integer data, String number) {
        return clcrkDao.upClcrkApprovalByNumber(data,number);
    }
}
