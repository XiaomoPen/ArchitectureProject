package com.seven.springboot.controller.csp;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TCtKhfp;
import com.seven.springboot.pojo.TCtLxjl;
import com.seven.springboot.service.csp.impl.TCtLxjlServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.utils.impl.RandomNumberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lxjl")
public class TCtLxjlController {

    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;
    @Autowired
    private TCtLxjlServiceImpl tCtLxjlService;

    //新增联系记录
    @RequestMapping ("/addlxjl/{lxjl}")
    public RestContent addlxjl(@PathVariable String lxjl){
        TCtLxjl tCtLxjl= JSON.parseObject(lxjl, TCtLxjl.class);
        String random = randomNumber.getRandom();//随机编号
        tCtLxjl.setLxjlBh(random);
        tCtLxjl.setUserNumber("20210405");
        /*System.out.println(tCtKhfp.toString());*/
        tCtLxjlService.addlxjl(tCtLxjl);
        return returnContent.getContent(tCtLxjl,"新增成功","error");
    }

    //查询全部联系记录列表
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TCtLxjl> tCtLxjls = tCtLxjlService.queryAll();
        return returnContent.getContent(tCtLxjls,"查询成功","error");
    }

    //根据编号删除联系记录表数据
    @RequestMapping("/dellxjl/{lxjlBh}")
    public RestContent dellxjl(@PathVariable String lxjlBh) {
        /*khxxBh="111111";*/
        System.out.println(lxjlBh);
        tCtLxjlService.dellxjl(JSON.parseObject(lxjlBh, String.class));
        List<TCtLxjl> tCtLxjls = tCtLxjlService.queryAll();
        return returnContent.getContent(tCtLxjls,"查询成功","error");
    }
}
