package com.seven.springboot.controller.lyh;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.service.lyh.impl.LyhUserService;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tpm")
public class LyhuserController {
    @Resource
    LyhUserService bs;
    @Autowired
    private ReturnContent returnContent;


    @RequestMapping("find-user")
    public RestContent tpmUser(Integer pageNum, Integer size) {
        Map<String, Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmUser> users = bs.findAll();
        map.put("rows", users);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"返回成功","返回失败");

    }

    @RequestMapping("find-user2")
    public RestContent tpmUser2(Integer pageNum, Integer size,String search) {
        TPmUser s = JSONObject.toJavaObject(JSON.parseObject(search), TPmUser.class);

        Map<String, Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmUser> list = bs.gj(s);

        map.put("rows", list);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"返回成功","返回失败");

    }



    @PostMapping("add-user")
    public RestContent adduser(@RequestBody TPmUser pmUser){
        Integer adduser = bs.adduser(pmUser);
        return returnContent.getContent(adduser,"成功","失败");

    }


    @GetMapping("find-user")
    public RestContent findById( String userNumber){

        List<TPmUser> byUserNumber = bs.findByUserNumber(userNumber);
        return returnContent.getContent(byUserNumber,"成功","失败");
    }
}
