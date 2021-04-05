package com.seven.springboot.controller.lyh;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.seven.springboot.pojo.TPmDeparture;
import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.service.lyh.impl.LyhDepartureService;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tpm")
public class LyhDepartureController {

    @Resource
    private LyhDepartureService bs;

    @Resource
    private ReturnContent returnContent;



    @RequestMapping("find-departure")
    public RestContent tpmDeparture(Integer pageNum, Integer size) {
        Map<String, Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmDeparture> users = bs.findAll();
        map.put("rows", users);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"返回成功","返回失败");

    }


    @RequestMapping("find-departure2")
    public RestContent tpmUser2(Integer pageNum, Integer size,String search) {
        TPmDeparture s = JSONObject.toJavaObject(JSON.parseObject(search), TPmDeparture.class);

        Map<String, Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmDeparture> list = bs.findAll2(s);

        map.put("rows", list);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"返回成功","返回失败");

    }


    @RequestMapping("find-departureName")
    public RestContent tpmDepartureName(String departureErial) {
        Map<String, Object> map = new HashMap<>();

        List<TPmDeparture> departures = bs.findById(departureErial);
        map.put("rows", departures);
        return returnContent.getContent(map,"返回成功","返回失败");
    }


    @PostMapping("add-departure")
    public RestContent addDeparture(@RequestBody TPmDeparture departure){
        Integer integer = bs.addDeparture(departure);
        return returnContent.getContent(integer,"成功","失败");
    }

    @PostMapping("add-myapplyDeparture")
    public RestContent addMyapply(@RequestBody TPmDeparture departure){
        Integer addmyapply = bs.addmyapply(departure);
        return returnContent.getContent(addmyapply,"成功","失败");
    }

    @PostMapping("del-departure")
    public RestContent delDeparture(String departureErial){
        Integer deldeparture = bs.deldeparture(departureErial);
        return returnContent.getContent(deldeparture,"成功","失败");
    }

}
