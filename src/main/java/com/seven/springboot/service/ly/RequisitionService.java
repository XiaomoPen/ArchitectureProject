package com.seven.springboot.service.ly;

import com.github.pagehelper.PageInfo;
import com.seven.springboot.pojo.TPjReceive;
import com.seven.springboot.vo.ly.ParamsVo;


public interface RequisitionService {

    void addRequisitionApplication(TPjReceive receive);

    void delRequisitionById(String[] id);

    PageInfo<TPjReceive> findReceiveAll(ParamsVo paramsVo);

}
