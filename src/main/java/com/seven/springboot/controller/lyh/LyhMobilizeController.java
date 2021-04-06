package com.seven.springboot.controller.lyh;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.seven.springboot.pojo.TPmContract;
import com.seven.springboot.pojo.TPmMobilize;
import com.seven.springboot.service.lyh.impl.LyhMobilizeService;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tpm")
public class LyhMobilizeController {

    @Resource
    private LyhMobilizeService bs;

    @Resource
    private ReturnContent returnContent;

    @RequestMapping("find-mobilize")
    public RestContent tpmMobilize(Integer pageNum, Integer size) {
        Map<String, Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmMobilize> mobilizes = bs.findAll();

        map.put("rows", mobilizes);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"成功","失败");

    }


    @RequestMapping("find-mobilizeName")
    public RestContent tpmMobilizeName(String userName) {
        Map<String, Object> map = new HashMap<>();
        List<TPmMobilize> mobilizes = bs.findByName(userName);
        map.put("rows", mobilizes);
        return returnContent.getContent(map,"成功","失败");

    }

    @RequestMapping("find-mobilize2")
    public RestContent tpmMobilize2(Integer pageNum, Integer size,String search) {
        TPmMobilize s = JSONObject.toJavaObject(JSON.parseObject(search), TPmMobilize.class);
        Map<String, Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmMobilize> list = bs.findAll2(s);
        map.put("rows", list);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"成功","失败");

    }

    @PostMapping("add-mobilize")
    public RestContent addMobilize(TPmMobilize tPmMobilize){
        Integer integer = bs.addMobilize(tPmMobilize);
        return returnContent.getContent(integer,"成功","失败");

    }


    @PostMapping("add-myapplyMobilize")
    public RestContent addMyapply(TPmMobilize tPmMobilize){
        Integer integer = bs.addMobilize(tPmMobilize);
        return returnContent.getContent(integer,"成功","失败");

    }

}
