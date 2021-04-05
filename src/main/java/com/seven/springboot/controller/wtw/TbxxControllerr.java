package com.seven.springboot.controller.wtw;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.pojo.TPjTbxx;
import com.seven.springboot.service.wtw.impl.TbxxServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return returnContent.getContent(tPjTbxxes,"数据传输成功！","数据传输错误！");
    }

    @PostMapping("/tbxxAdd/{date}")
    public RestContent tbxxAdd(@PathVariable String date){
        TPjTbxx tPjTbxx = JSON.parseObject(date, TPjTbxx.class);
        //添加默认审批状态
        tPjTbxx.setTbxxSpjg(0);
        tbxxService.tbxxAdd(tPjTbxx);
        TPjTbxx tbxx = null;
        tbxx = tbxxService.tbxxFinally();
        return returnContent.getContent(tbxx,"数据传输成功！","数据添加失败！");
    }



}
