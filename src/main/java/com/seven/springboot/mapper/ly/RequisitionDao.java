package com.seven.springboot.mapper.ly;

import com.seven.springboot.pojo.TPjReceive;
import com.seven.springboot.vo.ly.ParamsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RequisitionDao {
    void addRequisitionApplication(TPjReceive receive);

    void delRequisitionById(String[] id);

    List<TPjReceive> findReceiveAll(@Param("paramsVo") ParamsVo paramsVo);
}
