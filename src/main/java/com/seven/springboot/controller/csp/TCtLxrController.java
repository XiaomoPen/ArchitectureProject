package com.seven.springboot.controller.csp;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TCtKhfp;
import com.seven.springboot.pojo.TCtLxr;
import com.seven.springboot.service.csp.impl.TCtLxrServiceImpl;
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
@RequestMapping("/lxr")
public class TCtLxrController {

    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;
    @Autowired
    private TCtLxrServiceImpl tCtLxrService;

    //新增信息联系人
    @RequestMapping ("/addlxr/{lxr}")
    public RestContent addlxr(@PathVariable String lxr){
        TCtLxr tCtLxr= JSON.parseObject(lxr, TCtLxr.class);
        String random = randomNumber.getRandom();//随机编号
        tCtLxr.setLxrBh(random);
        tCtLxr.setKhxxBh(null);
        /*tCtLxr.setLxrBh("20210405");*/
        /*System.out.println(tCtKhfp.toString());*/
        tCtLxrService.addlxr(tCtLxr);
        return returnContent.getContent(tCtLxr,"新增成功","error");
    }

    //查询全部联系人列表
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TCtLxr> tCtLxrs = tCtLxrService.queryAll();
        return returnContent.getContent(tCtLxrs,"查询成功","error");
    }

    //根据编号联系人列表删除数据
    @RequestMapping("/dellxr/{lxrBh}")
    public RestContent dellxr(@PathVariable String lxrBh) {
        /*khxxBh="111111";*/
        System.out.println(lxrBh);
        tCtLxrService.dellxr(JSON.parseObject(lxrBh, String.class));
        List<TCtLxr> tCtLxrs = tCtLxrService.queryAll();
        return returnContent.getContent(tCtLxrs, "删除成功", "error");
    }

}
