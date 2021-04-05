package com.seven.springboot.controller.lyh;

import com.seven.springboot.pojo.TPmDepartment;
import com.seven.springboot.service.lyh.impl.LyhDeptService;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("tpm")
public class LyhdeptController {


    @Resource
    private LyhDeptService bs;

    @Resource
    private ReturnContent returnContent;


    @RequestMapping("find-dept")
    public RestContent findAll(){
        List<TPmDepartment> all = bs.findAll();
        return returnContent.getContent(all,"成功","失败");
    }

}
