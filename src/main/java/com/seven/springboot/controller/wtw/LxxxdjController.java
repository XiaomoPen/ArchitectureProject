package com.seven.springboot.controller.wtw;

import com.seven.springboot.pojo.TPjLxxxdj;
import com.seven.springboot.service.wtw.impl.LxxxdjServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.utils.impl.ReturnContentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/lxxx")
public class LxxxdjController {//立项信息
    @Autowired
    private LxxxdjServiceImpl lxxxdjService;
    @Autowired
    private ReturnContent returnContent;
    //数据查询
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TPjLxxxdj> lxxxdjs = lxxxdjService.queryAll();
        return returnContent.getContent(lxxxdjs,"数据传输成功！","数据传输失败");
    }


}
