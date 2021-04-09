package com.seven.springboot.controller.wtw;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TPjZbjgdj;
import com.seven.springboot.service.wtw.impl.ZbjgdjServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.utils.impl.RandomNumberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zbjgdj")
public class ZbjgdjController {//招标结果登记
    @Autowired
    private ZbjgdjServiceImpl zbjgdjService;
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;
    //信息查询所有
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TPjZbjgdj> tPjZbjgdjs = zbjgdjService.queryAll();
        return returnContent.getContent(tPjZbjgdjs,"数据传输成功！","数据传输错误！");
    }
    //信息添加
    @PostMapping("/add/{date}")
    public RestContent add(@PathVariable String date){
        TPjZbjgdj tPjZbjgdj = JSON.parseObject(date, TPjZbjgdj.class);
        zbjgdjService.add(tPjZbjgdj);
        return returnContent.getContent(tPjZbjgdj,"数据传输成功！","数据添加失败！");
    }

    //删除数据
    @PostMapping("/deletes/{serial}")
    public void deletes(@PathVariable String serial){
        zbjgdjService.delete(JSON.parseObject(serial, String.class));
    }

    //修改审批状态为待审批
    @GetMapping("/updates/{serial}")
    public void updates(@PathVariable String serial){
        zbjgdjService.update(JSON.parseObject(serial,String.class));
    }
    //修改审批状态为通过
    @GetMapping("/updates1/{serial}")
    public void updates1(@PathVariable String serial){
        zbjgdjService.update1(JSON.parseObject(serial,String.class));
    }
    //修改审批状态为不通过
    @GetMapping("/updates2/{serial}")
    public void updates2(@PathVariable String serial){
        zbjgdjService.update2(JSON.parseObject(serial,String.class));
    }

    //模糊查询
    @GetMapping("/selects/{name}")
    public RestContent selects(@PathVariable String name){
        List<TPjZbjgdj> tPjZbwjs =  zbjgdjService.selects(JSON.parseObject(name,String.class));
        return returnContent.getContent(tPjZbwjs,"数据传输成功！","数据传输错误!");
    }
}
