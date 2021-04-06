package com.seven.springboot.controller.csp;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TCtKhxx;
import com.seven.springboot.service.csp.TCtKhxxService;
import com.seven.springboot.service.csp.impl.TCtKhxxServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.utils.impl.RandomNumberImpl;
import org.omg.CORBA.DATA_CONVERSION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/khxx")
public class TCtKhxxController {

    @Autowired
    private TCtKhxxServiceImpl tCtKhxxService;
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;

    //查询全部客户信息列表

    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TCtKhxx> tCtKhxxes = tCtKhxxService.queryAll();
        return returnContent.getContent(tCtKhxxes,"查询成功","error");
    }
    //查询所有客户信息列表并以录入时间降序排列并且无负责人编号查询

    @GetMapping("/queryNullAll")
    public RestContent queryNullAll(){
        List<TCtKhxx> tCtKhxxes = tCtKhxxService.queryNullAll();
        return returnContent.getContent(tCtKhxxes,"查询成功","error");
    }

    //根据登录的员工ID来查询负责的客户，返回给客户信息列表

    @GetMapping("/queryIdAll")
    public RestContent queryIdAll(String userNumber){
        /*userNumber="20210405";*/
        List<TCtKhxx> tCtKhxxes = tCtKhxxService.queryIdAll(userNumber);
        return returnContent.getContent(tCtKhxxes,"查询成功","error");
    }

    //模糊查询客户名称或负责人名称,时间降序排列

    @GetMapping("/querymhcx")
    public RestContent querymhcx(String khxxXm){
        /*khxxXm="科";*/
        List<TCtKhxx> tCtKhxxes = tCtKhxxService.querymhcx(khxxXm);
        return returnContent.getContent(tCtKhxxes,"查询成功","error");
    }
    //新增信息

    @RequestMapping ("/addKhxx/{khxx}")
    public RestContent addKhxx(@PathVariable String khxx){
        //录入当天添加的系统时间
        /*SimpleDateFormat sj=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();*/
        /*System.out.println(khxx);*/
        TCtKhxx tCtKhxx= JSON.parseObject(khxx, TCtKhxx.class);
        String random = randomNumber.getRandom();//随机编号
        tCtKhxx.setKhxxBh(random);
        if (tCtKhxx.getUserNumber().equals("")){
            tCtKhxx.setUserNumber(null);}//前台员工id为空白时，设置为null添加
        tCtKhxx.setKhxxLrsj(new Timestamp(new Date().getTime()));//当前系统时间
        System.out.println(tCtKhxx.toString());
        tCtKhxxService.addKhxx(tCtKhxx);
        System.out.println(random);
        return returnContent.getContent(tCtKhxx,"新增成功","error");
    }

    @RequestMapping("/delKhxx")
    public RestContent delKhxx(String khxxBh){
        /*khxxBh="111111";*/
        Integer integer=tCtKhxxService.delKhxx(khxxBh);
        return returnContent.getContent(integer,"删除成功","error");
    }

}
