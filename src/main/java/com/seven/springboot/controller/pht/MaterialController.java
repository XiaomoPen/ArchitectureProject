package com.seven.springboot.controller.pht;

import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.service.pht.MaterialService;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private MaterialService materialService;

    @GetMapping("/getData/{page}/{size}")
    public RestContent getPersonal(@PathVariable String page,@PathVariable String size){
        List<TPjMaterialContractDetailed> materialContractDetailed = materialService.getMaterialContractDetailed();
        return returnContent.getContent(materialContractDetailed,"数据获取成功","数据获取失败");
    }
}
