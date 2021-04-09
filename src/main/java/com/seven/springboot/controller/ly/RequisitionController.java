package com.seven.springboot.controller.ly;

import com.seven.springboot.common.Contrast;
import com.seven.springboot.pojo.TPjReceive;
import com.seven.springboot.service.ly.RequisitionService;
import com.seven.springboot.vo.ly.ParamsVo;
import com.seven.springboot.vo.ly.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requisition")
public class RequisitionController {
    @Autowired
    private RequisitionService requisitionService;

    @PostMapping("/addRequisitionApplication")
    public ResultVo addRequisitionApplication(TPjReceive receive) {
        try {
            requisitionService.addRequisitionApplication(receive);
            return ResultVo.ADD_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVo.ADD_ERROR;
        }
    }

    @DeleteMapping("/delRequisitionById")
    public ResultVo delRequisitionById(String[] id) {
        try {
            requisitionService.delRequisitionById(id);
            return ResultVo.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVo.DELETE_ERROR;
        }
    }

    @PostMapping("/findReceiveAll")
    public ResultVo findReceiveAll(ParamsVo paramsVo) {
        try {
            return new ResultVo(Contrast.OK, Contrast.QUERY_SUCCESS, requisitionService.findReceiveAll(paramsVo));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVo.QUERY_ERROR;
        }
    }
}
