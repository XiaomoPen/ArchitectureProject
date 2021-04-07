package com.seven.springboot.controller.pht;

import com.alibaba.fastjson.JSON;
import com.seven.springboot.pojo.TPjClcrk;
import com.seven.springboot.pojo.TPjClcrkmx;
import com.seven.springboot.service.pht.ClcrlService;
import com.seven.springboot.utils.RandomNumber;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.vo.pht.ClcrlDataVo;
import com.seven.springboot.vo.pht.ClcrlVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/clcrl")
public class ClcrlController {

    @Autowired
    private ClcrlService clcrlService;
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private RandomNumber randomNumber;

    //新增入库信息
    @PostMapping("/addClcrl")
    public RestContent addClcrt(@RequestBody ClcrlVo clcrlVo){
        TPjClcrk clcrk = clcrlVo.getClcrk();
        String number=randomNumber.getOrder();
        clcrk.setClcrkNumber(number);
        clcrk.setClcrkTime(new Timestamp(new Date().getTime()));
        clcrk.setClcrkApproval(0);
        clcrlVo.setClcrk(clcrk);
        List<TPjClcrkmx> clcrkmxes = clcrlVo.getClcrkmxes();
        if(null!=clcrkmxes&&clcrkmxes.size()>0){
            for(int i=0;i<clcrkmxes.size();i++){
                TPjClcrkmx tPjClcrkmx = clcrkmxes.get(i);
                tPjClcrkmx.setClcrkNumber(number);
                clcrkmxes.set(i,tPjClcrkmx);
            }
        }
        Integer integer = clcrlService.addClcrl(clcrlVo);
        return returnContent.getContent(integer,"新增数据成功","新增数据失败");
    }

    //获取入库数量
    @GetMapping("/getClcrtSum")
    public RestContent getClcrtSum(){
        Integer sum = clcrlService.getClcrkSum();
        return returnContent.getContent(sum,"数据获取成功","数据获取失败");
    }

    //通过分页获取入库数据
    @GetMapping("/getClcrt/{page}")
    public RestContent getClcrk(@PathVariable Integer page){
        List<ClcrlDataVo> limit = clcrlService.getClcrltoLimit((page - 1) * 10);
        return returnContent.getContent(JSON.toJSONString(limit),"数据获取成功","数据获取失败");
    }

    //搜索入库信息
    @GetMapping("/getClcrtSearch/{data}")
    public RestContent getClcrtSearch(@PathVariable String data){
        List<ClcrlDataVo> search = clcrlService.getClcrltoSearch(data);
        return returnContent.getContent(JSON.toJSONString(search),"数据获取成功","数据获取失败");
    }

    //更新审批状态
    @PostMapping("/upClcrt/{data}/{number}")
    public RestContent upClcrt(@PathVariable Integer data,@PathVariable String number){
        Integer i = clcrlService.upClcrkApprovalByNumber(data,number);
        return returnContent.getContent(i,"数据获取成功","数据获取失败");
    }
}
