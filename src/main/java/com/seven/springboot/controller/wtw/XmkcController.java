package com.seven.springboot.controller.wtw;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TPjXmkc;
import com.seven.springboot.pojo.TPjZgzs;
import com.seven.springboot.service.wtw.impl.XmckServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.utils.impl.RandomNumberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/xmkc")
public class XmkcController {
    @Autowired
    private XmckServiceImpl xmckService;
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;
    //信息查询所有
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TPjXmkc> tPjXmkcs = xmckService.queryAll();
        return returnContent.getContent(tPjXmkcs,"数据传输成功！","数据传输错误！");
    }
    //信息添加
    @PostMapping("/add/{date}")
    public RestContent add(@PathVariable String date){
        TPjXmkc tPjXmkc = JSON.parseObject(date, TPjXmkc.class);
        //获取随机生成的编号
        String random = randomNumber.getRandom();
        tPjXmkc.setTbxxBh(random);
        System.out.println(tPjXmkc.toString());
        xmckService.add(tPjXmkc);
        TPjXmkc xmkc = null;
        xmkc = xmckService.finallys(random);
        return returnContent.getContent(xmkc,"数据传输成功！","数据添加失败！");
    }

    //删除数据
    @PostMapping("/deletes/{serial}")
    public void deletes(@PathVariable String serial){
        xmckService.deletes(JSON.parseObject(serial, String.class));

    }

    //修改审批状态为待审批
    @GetMapping("/updates/{serial}")
    public void updates(@PathVariable String serial){
        xmckService.updates(JSON.parseObject(serial,String.class));
    }
    //修改审批状态为通过
    @GetMapping("/updates1/{serial}")
    public void updates1(@PathVariable String serial){
        xmckService.updates1(JSON.parseObject(serial,String.class));
    }
    //修改审批状态为不通过
    @GetMapping("/updates2/{serial}")
    public void updates2(@PathVariable String serial){
        xmckService.updates2(JSON.parseObject(serial,String.class));
    }

    //模糊查询
    @GetMapping("/selects/{name}")
    public RestContent selects(@PathVariable String name){
        List<TPjXmkc> tPjXmkcs =  xmckService.selects(JSON.parseObject(name,String.class));
        return returnContent.getContent(tPjXmkcs,"数据传输成功！","数据传输错误!");
    }
}
