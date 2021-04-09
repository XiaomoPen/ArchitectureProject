package com.seven.springboot.controller.csp;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TCtHtxx;
import com.seven.springboot.pojo.TCtKhfp;
import com.seven.springboot.service.csp.impl.TCtHtxxServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.utils.impl.RandomNumberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/xshtxx")
public class TCtHtxxController {

    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;
    @Autowired
    private TCtHtxxServiceImpl tCtHtxxService;


    //新增信息合同信息
    @RequestMapping("/addhtxx/{htxx}")
    public RestContent addhtxx(@PathVariable String htxx){
        TCtHtxx tCtHtxx= JSON.parseObject(htxx, TCtHtxx.class);
        String random = randomNumber.getRandom();//随机编号
        tCtHtxx.setHtxxBh(random);
        tCtHtxx.setUserNumber("20210405");
        /*System.out.println(tCtKhfp.toString());*/
        tCtHtxxService.addhtxx(tCtHtxx);
        return returnContent.getContent(tCtHtxx,"新增成功","error");
    }

    //查询全部合同列表
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TCtHtxx> tCtHtxxes = tCtHtxxService.queryAll();
        return returnContent.getContent(tCtHtxxes,"查询成功","error");
    }

    //根据编号删除合同信息表数据
    @RequestMapping("/delhtxx/{htxxBh}")
    public RestContent delKhfp(@PathVariable String htxxBh) {
        /*khxxBh="111111";*/
        System.out.println(htxxBh);
        tCtHtxxService.delhtxx(JSON.parseObject(htxxBh, String.class));
        List<TCtHtxx> tCtHtxxes = tCtHtxxService.queryAll();
        return returnContent.getContent(tCtHtxxes,"查询成功","error");
    }
}
