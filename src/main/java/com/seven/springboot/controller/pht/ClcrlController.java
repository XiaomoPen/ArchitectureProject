package com.seven.springboot.controller.pht;

import com.seven.springboot.pojo.TPjClcrk;
import com.seven.springboot.pojo.TPjClcrkmx;
import com.seven.springboot.service.pht.ClcrlService;
import com.seven.springboot.utils.RandomNumber;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import com.seven.springboot.vo.pht.ClcrlVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
