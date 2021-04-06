package com.seven.springboot.controller.lyh;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.seven.springboot.pojo.TPmContract;
import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.service.lyh.impl.LyhContractService;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tpm")
public class LyhContractController {

    @Resource
    private LyhContractService bs;

    @Resource
    private ReturnContent returnContent;

    @RequestMapping("find-Contract")
    public RestContent tpmUser(Integer pageNum, Integer size) {
        Map<String, Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmContract> users = bs.findAll();

        map.put("rows", users);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"成功","失败");

    }


    @RequestMapping("find-Contract2")
    public RestContent tpmUser2(Integer pageNum, Integer size,String search) {
        TPmContract s = JSONObject.toJavaObject(JSON.parseObject(search), TPmContract.class);

        Map<String, Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmContract> list = bs.gj(s);

        map.put("rows", list);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"成功","失败");

    }

    @PostMapping("del-content")
    public RestContent delContent(String contractNumber){
        Integer integer = bs.delContract(contractNumber);
        return returnContent.getContent(integer,"成功","失败");
    }

    @PostMapping("add-content")
    public RestContent addContent(@RequestBody TPmContract tPmContract){

        Integer integer = bs.addContract(tPmContract);
        return returnContent.getContent(integer,"成功","失败");

    }
}
