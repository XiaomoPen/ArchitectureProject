package com.seven.springboot.service.ly.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seven.springboot.mapper.ly.RequisitionDao;
import com.seven.springboot.pojo.TPjReceive;
import com.seven.springboot.service.ly.RequisitionService;
import com.seven.springboot.utils.BuildTime;
import com.seven.springboot.vo.ly.ParamsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RequisitionServiceImpl implements RequisitionService {
    @Autowired
    private RequisitionDao requisitionDao;

    @Override
    public void addRequisitionApplication(TPjReceive receive) {
        receive.setReceiveDrawingNumber(BuildTime.getTime());
        requisitionDao.addRequisitionApplication(receive);
    }

    @Override
    public void delRequisitionById(String[] id) {
        requisitionDao.delRequisitionById(id);
    }

    @Override
    public PageInfo<TPjReceive> findReceiveAll(ParamsVo paramsVo) {
        PageHelper.startPage(paramsVo.getPage(), paramsVo.getLimit());
        return new PageInfo<>(requisitionDao.findReceiveAll(paramsVo));
    }
}
