package com.seven.springboot.service.pht;

import com.seven.springboot.vo.pht.ClcrlVo;
import org.springframework.stereotype.Service;

@Service
public interface ClcrlService {

    //新增仓库表
    public Integer addClcrl(ClcrlVo clcrlVo);
}
