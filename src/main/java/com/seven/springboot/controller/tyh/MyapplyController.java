package com.seven.springboot.controller.tyh;

import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.pojo.TPsMyapply;
import com.seven.springboot.service.tyh.MyapplyService;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shenpi")
public class MyapplyController {
    @Autowired
    private MyapplyService myapplyService;
    @Autowired
    private ReturnContent returnContent;

    @GetMapping("/selmyapp")
    public RestContent selmyapp(@RequestParam("s") String sss){
        List<TPsMyapply> selmyapp = myapplyService.selmyapp(sss);
        return returnContent.getContent(selmyapp,"成功","失败");
    }

    @GetMapping("/selmyapp2")
    public RestContent selmyapp2(@RequestParam("s") String sss){
        List<TPsMyapply> selmyapp = myapplyService.selmyapp2(sss);
        return returnContent.getContent(selmyapp,"成功","失败");
    }


    @GetMapping("/xqmyapp")
    public String xqmyapp(@RequestParam("type")String type,@RequestParam("id") String id){
        return myapplyService.xqmyapp(type, id);
    }

    @GetMapping("/updateapp")
    public RestContent updateapp(@RequestParam("id") String id,@RequestParam("jg") Integer jg){
        Integer updateapp = myapplyService.updateapp(id,jg);
        return returnContent.getContent(updateapp,"成功","失败");
    }


    //催办
    @GetMapping("/cuiban")
    public RestContent cuiban(@RequestParam("id") String id){
        Integer cuiban = myapplyService.cuiban(id);
        return returnContent.getContent(cuiban,"成功","失败");
    }

    @GetMapping("/seluser")
    public List<TPmUser> seluser(){
        List<TPmUser> tPmUser=myapplyService.seluser();
        return tPmUser;
    }
}
