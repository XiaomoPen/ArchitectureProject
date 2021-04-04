package com.seven.springboot.controller.wtw;

import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.pojo.TPjTbxx;
import com.seven.springboot.service.wtw.impl.TbxxServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tbxx")
public class TbxxControllerr {
    @Autowired
    private TbxxServiceImpl tbxxService;
    @Autowired
    private ReturnContent returnContent;

    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TPjTbxx> tPjTbxxes = tbxxService.queryAll();
        return returnContent.getContent(tPjTbxxes,"200","数据传输错误！");
    }



}
