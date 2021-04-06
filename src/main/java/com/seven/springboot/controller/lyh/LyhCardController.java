package com.seven.springboot.controller.lyh;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.seven.springboot.pojo.TPmCard;
import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.service.lyh.impl.LyhCardService;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tpm")
public class LyhCardController {

    @Resource
    private LyhCardService bs;

    @Resource
    private ReturnContent returnContent;


    @RequestMapping("find-card")
    public RestContent tpmCard(Integer pageNum, Integer size) {
        Map<String, Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmCard> cards = bs.findAll();
        map.put("rows", cards);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"返回成功","返回失败");

    }

    @RequestMapping("find-card2")
    public RestContent tpmUser2(Integer pageNum, Integer size,String search) {
        TPmCard s = JSONObject.toJavaObject(JSON.parseObject(search), TPmCard.class);

        Map<String, Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<TPmCard> list = bs.findAll2(s);

        map.put("rows", list);
        map.put("total", page.getTotal());
        return returnContent.getContent(map,"返回成功","返回失败");

    }



    @PostMapping("add-card")
    public RestContent addCard(@RequestBody TPmCard tPmCard){
        Integer addCard = bs.addCard(tPmCard);
        return returnContent.getContent(addCard,"成功","失败");

    }


    @GetMapping("find-cardId")
    public RestContent findById( String cardSerial){

        List<TPmCard> byId = bs.findById(cardSerial);
        return returnContent.getContent(byId,"成功","失败");
    }

}
