package com.seven.springboot.controller.wtw;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TPjZbwj;
import com.seven.springboot.service.wtw.impl.ZbwjServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.utils.impl.RandomNumberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zbwj")
public class ZbwjController {
    @Autowired
    private ZbwjServiceImpl zbwjService;
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;
    //信息查询所有
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TPjZbwj> tPjTbxxes = zbwjService.queryAll();
        return returnContent.getContent(tPjTbxxes,"数据传输成功！","数据传输错误！");
    }
    //信息添加
    @PostMapping("/zbwjAdd/{date}")
    public RestContent zbwjAdd(@PathVariable String date){
        TPjZbwj tPjZbwj = JSON.parseObject(date, TPjZbwj.class);
        //获取随机生成的编号
        String random = randomNumber.getRandom();
        tPjZbwj.setZbwjBsgmbh(random);
        zbwjService.zbwjAdd(tPjZbwj);
        TPjZbwj zbwj = null;
        zbwj = zbwjService.zbwjFinally(random);
        return returnContent.getContent(zbwj,"数据传输成功！","数据添加失败！");
    }

    //删除数据
    @PostMapping("/zbwjDelete/{tbxxBh}")
    public void zbwjDelete(@PathVariable String tbxxBh){
        zbwjService.zbwjDelete(JSON.parseObject(tbxxBh, String.class));
    }

    //修改审批状态为待审批
    @GetMapping("/zbwjUpdate/{serial}")
    public void zbwjUpdate(@PathVariable String serial){
        zbwjService.zbwjUpdate(JSON.parseObject(serial,String.class));
    }
    //修改审批状态为通过
    @GetMapping("/zbwjUpdate1/{serial}")
    public void zbwjUpdate1(@PathVariable String serial){
        zbwjService.zbwjUpdate1(JSON.parseObject(serial,String.class));
    }
    //修改审批状态为不通过
    @GetMapping("/zbwjUpdate2/{serial}")
    public void zbwjUpdate2(@PathVariable String serial){
        zbwjService.zbwjUpdate2(JSON.parseObject(serial,String.class));
    }

    //模糊查询
    @GetMapping("/zbwjSelect/{name}")
    public RestContent zbwjSelect(@PathVariable String name){
        List<TPjZbwj> tPjZbwjs =  zbwjService.zbwjSelect(JSON.parseObject(name,String.class));
        return returnContent.getContent(tPjZbwjs,"数据传输成功！","数据传输错误!");
    }



}
