package com.seven.springboot.service.pht.impl;

import com.seven.springboot.mapper.pht.ClcrkDao;
import com.seven.springboot.pojo.TPjClcrk;
import com.seven.springboot.service.pht.ClcrlService;
import com.seven.springboot.vo.pht.ClcrlVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

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
        return clcrkDao.beathAddClcrkms(clcrlVo.getClcrkmxes());
    }
}
