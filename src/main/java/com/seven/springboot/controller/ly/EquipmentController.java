package com.seven.springboot.controller.ly;

import com.seven.springboot.common.Contrast;
import com.seven.springboot.service.ly.EquipmentService;
import com.seven.springboot.vo.ly.ParamsVo;
import com.seven.springboot.vo.ly.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/findEquipmentAll")
    public ResultVo findEquipmentAll(ParamsVo paramsVo) {
        try {
            return new ResultVo(Contrast.OK, Contrast.QUERY_SUCCESS, equipmentService.findEquipmentAll(paramsVo));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVo.QUERY_ERROR;
        }
    }
}
