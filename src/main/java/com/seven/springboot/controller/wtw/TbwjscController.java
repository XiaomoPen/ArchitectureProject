package com.seven.springboot.controller.wtw;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TPjTbwjsc;
import com.seven.springboot.service.wtw.impl.TbwjscServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.utils.impl.RandomNumberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 投标文件审查
 */
@RestController
@RequestMapping("/tbwjsc")
public class TbwjscController {
    @Autowired
    private TbwjscServiceImpl tbwjscService;
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;
    //信息查询所有
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TPjTbwjsc> tPjTbwjscs = tbwjscService.queryAll();
        return returnContent.getContent(tPjTbwjscs,"数据传输成功！","数据传输错误！");
    }
    //信息添加
    @PostMapping("/add/{date}")
    public RestContent add(@PathVariable String date){
        TPjTbwjsc tPjTbwjsc = JSON.parseObject(date, TPjTbwjsc.class);
        //获取随机生成的编号
        String random = randomNumber.getRandom();
        tPjTbwjsc.setThwjscTbbh(random);
        System.out.println(tPjTbwjsc.toString());
        tbwjscService.add(tPjTbwjsc);
        TPjTbwjsc zbwj = null;
        zbwj = tbwjscService.finallys(random);
        return returnContent.getContent(zbwj,"数据传输成功！","数据添加失败！");
    }

    //删除数据
    @PostMapping("/deletes/{serial}")
    public void deletes(@PathVariable String serial){
        tbwjscService.delete(JSON.parseObject(serial, String.class));
    }
    //修改审批状态为待审批
    @GetMapping("/updates/{serial}")
    public void updates(@PathVariable String serial){
        tbwjscService.update(JSON.parseObject(serial,String.class));
    }
    //修改审批状态为通过
    @GetMapping("/updates1/{serial}")
    public void updates1(@PathVariable String serial){
        tbwjscService.update1(JSON.parseObject(serial,String.class));
    }
    //修改审批状态为不通过
    @GetMapping("/updates2/{serial}")
    public void updates2(@PathVariable String serial){
        tbwjscService.update2(JSON.parseObject(serial,String.class));
    }

    //模糊查询
    @GetMapping("/selects/{name}")
    public RestContent selects(@PathVariable String name){
        List<TPjTbwjsc> tPjZbwjs =  tbwjscService.selects(JSON.parseObject(name,String.class));
        return returnContent.getContent(tPjZbwjs,"数据传输成功！","数据传输错误!");
    }

}
