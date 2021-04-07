package com.seven.springboot.service.pht;

import com.seven.springboot.vo.pht.ClcrlDataVo;
import com.seven.springboot.vo.pht.ClcrlVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClcrlService {

    //新增仓库表
    public Integer addClcrl(ClcrlVo clcrlVo);

    //获取入库数量
    public Integer getClcrkSum();

    //通过分页查询入库表信息
    public List<ClcrlDataVo> getClcrltoLimit(Integer page);

    //通过模糊查询入库表信息
    public List<ClcrlDataVo> getClcrltoSearch(String data);

    //修改入库表状态
    public Integer upClcrkApprovalByNumber(Integer data,String number);
}
