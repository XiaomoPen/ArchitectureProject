package com.seven.springboot.controller.tyh;

import com.seven.springboot.pojo.TPsApply;
import com.seven.springboot.pojo.TPsMyapply;
import com.seven.springboot.service.tyh.ApplyService;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/shenqing")
public class ApplyController {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private ApplyService applyService;

    @GetMapping("/apply")
    public RestContent getapply(){
        List<TPsApply> getapply = applyService.getapply();
        return returnContent.getContent(getapply,"1","2");
    }

    //请假申请
    @PostMapping("/addapplyqj")
    public void addapplyqj(@RequestBody TPsApply tPsApply){
        System.out.println(tPsApply);
        SimpleDateFormat df = new SimpleDateFormat("HHmmss");//设置日期格式
        String a = df.format(new Date());// new Date()为获取当前系统时间
        Random r = new Random(1);
        int ran1 = r.nextInt(100);
        tPsApply.setApplyNum("请假"+a+ran1);
        applyService.addapply(tPsApply.getApplyNum(),tPsApply.getApplyType(),tPsApply.gettPmUser().getUserNumber(),tPsApply.getApplyDate(),tPsApply.getApplyTime(),tPsApply.getApplyNumber(),tPsApply.getApplyReason());

        TPsMyapply tPsMyapply = new TPsMyapply();
        SimpleDateFormat k = new SimpleDateFormat("HHmmss");//设置日期格式
        String u = k.format(new Date());// new Date()为获取当前系统时间
        Random x = new Random(1);
        int xx = x.nextInt(100);
        tPsMyapply.setMyapplyNum(u+xx);
        tPsMyapply.setMyapplyNumber("请假"+a+ran1);
        tPsMyapply.setMyapplyName(tPsApply.getApplyReason());
        tPsMyapply.setMyapplyType("请假");
        tPsMyapply.setUserNumber(tPsApply.gettPmUser().getUserNumber());
        applyService.addmyapply(tPsMyapply);
    }

    //加班申请
    @PostMapping("/addapplyjb")
    public void addapplyjb(@RequestBody TPsApply tPsApply){
        SimpleDateFormat df = new SimpleDateFormat("HHmmss");//设置日期格式
        String a = df.format(new Date());// new Date()为获取当前系统时间
        Random r = new Random(1);
        int ran1 = r.nextInt(100);
        tPsApply.setApplyNum("加班"+a+ran1);
        applyService.addapplyjb(tPsApply.getApplyNum(),tPsApply.gettPmUser().getUserNumber(),tPsApply.getApplyDate(),tPsApply.getApplyTime(),tPsApply.getApplyNumber());

        TPsMyapply tPsMyapply = new TPsMyapply();
        SimpleDateFormat k = new SimpleDateFormat("HHmmss");//设置日期格式
        String u = k.format(new Date());// new Date()为获取当前系统时间
        Random x = new Random(1);
        int xx = x.nextInt(100);
        tPsMyapply.setMyapplyNum(u+xx);
        tPsMyapply.setMyapplyNumber("加班"+a+ran1);
        tPsMyapply.setMyapplyNumber(tPsApply.getApplyNum());
        tPsMyapply.setMyapplyName(tPsApply.getApplyReason());
        tPsMyapply.setMyapplyType("加班");
        tPsMyapply.setUserNumber(tPsApply.gettPmUser().getUserNumber());
        applyService.addmyapply(tPsMyapply);
    }

    //出差申请
    @PostMapping("/addapplycc")
    public void addapplycc(@RequestBody TPsApply tPsApply){
        SimpleDateFormat df = new SimpleDateFormat("HHmmss");//设置日期格式
        String a = df.format(new Date());// new Date()为获取当前系统时间
        Random r = new Random(1);
        int ran1 = r.nextInt(100);
        tPsApply.setApplyNum("出差"+a+ran1);
        applyService.addapplycc(tPsApply.getApplyNum(),tPsApply.gettPmUser().getUserNumber(),tPsApply.getApplyDate(),tPsApply.getApplyTime(),tPsApply.getApplyNumber(),tPsApply.getApplyTheme(), tPsApply.getApplyDatetime(),tPsApply.getApplyReason());

        TPsMyapply tPsMyapply = new TPsMyapply();
        SimpleDateFormat k = new SimpleDateFormat("HHmmss");//设置日期格式
        String u = k.format(new Date());// new Date()为获取当前系统时间
        Random x = new Random(1);
        int xx = x.nextInt(100);
        tPsMyapply.setMyapplyNum(u+xx);
        tPsMyapply.setMyapplyNumber("出差"+a+ran1);
        tPsMyapply.setMyapplyNumber(tPsApply.getApplyNum());
        tPsMyapply.setMyapplyName(tPsApply.getApplyReason());
        tPsMyapply.setMyapplyType("出差");
        tPsMyapply.setUserNumber(tPsApply.gettPmUser().getUserNumber());
        applyService.addmyapply(tPsMyapply);
    }
}
