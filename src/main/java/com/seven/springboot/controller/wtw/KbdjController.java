package com.seven.springboot.controller.wtw;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.controller.wtw.vo.DataVo;
import com.seven.springboot.pojo.TPjKbdj;
import com.seven.springboot.pojo.TPjTbwjsc;
import com.seven.springboot.service.wtw.impl.KbdjServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.utils.impl.RandomNumberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kbdj")
public class KbdjController {//开标登记

    @Autowired
    private KbdjServiceImpl kbdjService;
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;

    //信息查询所有
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TPjKbdj> tPjXmkcs = kbdjService.queryAll();
        return returnContent.getContent(tPjXmkcs,"数据传输成功！","数据传输错误！");
    }

    //数据添加
    @PostMapping("/dataVo")
    public RestContent voAdd(@RequestBody DataVo dataVo){
        //System.out.println(dataVo.toString());
        String random = randomNumber.getRandom();
        dataVo.gettPjKbdj().setKbdjBh(random);
        kbdjService.kbdjAdd(dataVo.gettPjKbdj());
        for(int i=0;i<dataVo.gettPjJzdsmx().size();i++){
            dataVo.gettPjJzdsmx().get(i).setKbdjBh(random);
            kbdjService.jzdsmxAdd(dataVo.gettPjJzdsmx().get(i));
        }
        return returnContent.getContent(dataVo,"数据传输成功！","数据传输失败！");
    }

    //删除数据
    @PostMapping("/deletes/{serial}")
    public void deletes(@PathVariable String serial){
        kbdjService.delete(JSON.parseObject(serial, String.class));
    }
    //修改审批状态为待审批
    @GetMapping("/updates/{serial}")
    public void updates(@PathVariable String serial){
        kbdjService.update(JSON.parseObject(serial,String.class));
    }
    //修改审批状态为通过
    @GetMapping("/updates1/{serial}")
    public void updates1(@PathVariable String serial){
        kbdjService.update1(JSON.parseObject(serial,String.class));
    }
    //修改审批状态为不通过
    @GetMapping("/updates2/{serial}")
    public void updates2(@PathVariable String serial){
        kbdjService.update2(JSON.parseObject(serial,String.class));
    }

    //模糊查询
    @GetMapping("/selects/{name}")
    public RestContent selects(@PathVariable String name){
        List<TPjKbdj> tPjZbwjs =  kbdjService.selects(JSON.parseObject(name,String.class));
        return returnContent.getContent(tPjZbwjs,"数据传输成功！","数据传输错误!");
    }


}
