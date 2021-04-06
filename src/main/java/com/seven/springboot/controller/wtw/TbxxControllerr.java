package com.seven.springboot.controller.wtw;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.pojo.TPjTbxx;
import com.seven.springboot.service.wtw.impl.TbxxServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.utils.impl.RandomNumberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tbxx")
public class TbxxControllerr {
    @Autowired
    private TbxxServiceImpl tbxxService;
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumberImpl randomNumber;
    //投标信息登记查询所有
    @GetMapping("/queryAll")
    public RestContent queryAll(){
        List<TPjTbxx> tPjTbxxes = tbxxService.queryAll();
        return returnContent.getContent(tPjTbxxes,"数据传输成功！","数据传输错误！");
    }
    //投标信息添加
    @PostMapping("/tbxxAdd/{date}")
    public RestContent tbxxAdd(@PathVariable String date){
        TPjTbxx tPjTbxx = JSON.parseObject(date, TPjTbxx.class);
        //获取随机生成的编号
        String random = randomNumber.getRandom();
        tPjTbxx.setTbxxBh(random);
        tbxxService.tbxxAdd(tPjTbxx);
        TPjTbxx tbxx = null;
        tbxx = tbxxService.tbxxFinally(random);
        return returnContent.getContent(tbxx,"数据传输成功！","数据添加失败！");
    }

    //删除数据
    @PostMapping("/tbxxDelete/{tbxxBh}")
    public void tbxxDelete(@PathVariable String tbxxBh){
        tbxxService.tbxxDelete(JSON.parseObject(tbxxBh, String.class));
    }

    //修改审批状态为待审批
    @GetMapping("/tbxxUpdate/{tbxxBh}")
    public void tbxxUpdate(@PathVariable String tbxxBh){
        tbxxService.tbxxUpdate(JSON.parseObject(tbxxBh,String.class));
    }
    //修改审批状态为通过
    @GetMapping("/tbxxUpdate1/{tbxxBh}")
    public void tbxxUpdate1(@PathVariable String tbxxBh){
        tbxxService.tbxxUpdate1(JSON.parseObject(tbxxBh,String.class));
    }
    //修改审批状态为不通过
    @GetMapping("/tbxxUpdate2/{tbxxBh}")
    public void tbxxUpdate2(@PathVariable String tbxxBh){
        tbxxService.tbxxUpdate2(JSON.parseObject(tbxxBh,String.class));
    }

    //模糊查询
    @GetMapping("/tbxxSelect/{tbxxName}")
    public RestContent tbxxSelect(@PathVariable String tbxxName){
        List<TPjTbxx> tbxx =  tbxxService.tbxxSelect(JSON.parseObject(tbxxName,String.class));
        return returnContent.getContent(tbxx,"数据传输成功！","数据传输错误!");
    }
}
