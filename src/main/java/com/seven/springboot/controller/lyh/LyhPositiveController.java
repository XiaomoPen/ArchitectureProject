package com.seven.springboot.controller.lyh;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.seven.springboot.pojo.TPmContract;
import com.seven.springboot.pojo.TPmPositive;
import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.service.lyh.impl.LyhPositiveService;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tpm")
public class LyhPositiveController {

    @Resource
    private LyhPositiveService bs;

    @Resource
    private ReturnContent returnContent;


    @RequestMapping("find-positive")
    public RestContent tpmPositive(Integer pageNum, Integer size) {
        Map<String, Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmPositive> pmPositives = bs.findAll();

        map.put("rows", pmPositives);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"成功","失败");
    }

    @RequestMapping("find-positive2")
    public RestContent tpmPositive2(Integer pageNum, Integer size,String search) {
        TPmPositive s = JSONObject.toJavaObject(JSON.parseObject(search), TPmPositive.class);
        Map<String, Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmPositive> list = bs.findAll2(s);
        map.put("rows", list);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"返回成功","返回失败");
    }



    @PostMapping("add-positive")
    public RestContent addPositive(@RequestBody TPmPositive tPmPositive){
        Integer integer = bs.addPositive(tPmPositive);
        return returnContent.getContent(integer,"成功","失败");
    }

    @GetMapping("del-positive")
    public RestContent delPositive(String positiveSerial){
        Integer integer = bs.delPositive(positiveSerial);
        return returnContent.getContent(integer,"成功","失败");
    }

    @PostMapping("add-myapplyPositive")
    public RestContent addMyapply(@RequestBody TPmPositive tPmPositive){
        Integer integer = bs.addMyapply(tPmPositive);
        return returnContent.getContent(integer,"成功","失败");
    }
}
