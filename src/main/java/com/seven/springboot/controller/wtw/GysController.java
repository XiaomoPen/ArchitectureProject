package com.seven.springboot.controller.wtw;

import com.seven.springboot.service.wtw.impl.GysServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gys")
public class GysController {//供应商
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private GysServiceImpl gysService;
    //数据查询
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        return returnContent.getContent(gysService.queryAll(),"数据传输成功！","数据传输失败！");
    }

}
