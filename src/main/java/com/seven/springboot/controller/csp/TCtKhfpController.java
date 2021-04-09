package com.seven.springboot.controller.csp;
import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TCtKhfp;
import com.seven.springboot.pojo.TCtKhxx;
import com.seven.springboot.service.csp.impl.TCtKhfpServiceImpl;
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
@RequestMapping("/khfp")
public class TCtKhfpController {

    @Autowired
    private TCtKhfpServiceImpl tCtKhfpService;
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;

    //新增信息客户分配信息
    @RequestMapping ("/addKhfp/{khfp}")
    public RestContent addKhfp(@PathVariable String khfp){
        TCtKhfp tCtKhfp= JSON.parseObject(khfp, TCtKhfp.class);
        String random = randomNumber.getRandom();//随机编号
        tCtKhfp.setKhfpBh(random);
        tCtKhfp.setUserNumber("20210405");
        /*System.out.println(tCtKhfp.toString());*/
        tCtKhfpService.addkhfp(tCtKhfp);
        return returnContent.getContent(tCtKhfp,"新增成功","error");
    }

    //查询全部客户分配列表
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TCtKhfp> tCtKhfps = tCtKhfpService.queryAll();
        return returnContent.getContent(tCtKhfps,"查询成功","error");
    }

    //根据编号删除客户分配表的数据
    @RequestMapping("/delKhfp/{khfpBh}")
    public RestContent delKhfp(@PathVariable String khfpBh) {
        /*khxxBh="111111";*/
        System.out.println(khfpBh);
        tCtKhfpService.delKhxx(JSON.parseObject(khfpBh, String.class));
        List<TCtKhfp> tCtKhfps = tCtKhfpService.queryAll();
        return returnContent.getContent(tCtKhfps, "删除成功", "error");
    }
}
