package com.seven.springboot.controller.tyh;

import com.seven.springboot.pojo.TPmLogin;
import com.seven.springboot.pojo.TPmUser;
import com.seven.springboot.service.tyh.LoginService;
import com.seven.springboot.service.tyh.impl.LoginServiceImpl;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private LoginService loginService;


    @GetMapping("/lg")
    public Object login(@RequestParam("name") String name, @RequestParam("paw") String paw){
        TPmUser tPmLogin = loginService.loginn(name,paw);
        if (tPmLogin==null){
            return "登录失败";
        }else {
            return tPmLogin;
        }
    }

    @GetMapping("/supdatepaw")
    public RestContent suodatepaw(@RequestParam("loginPassword") String loginPassword,@RequestParam("userNumber") String userNumber,@RequestParam("xmima")String xmima){
        Integer soudatepaw = loginService.soudatepaw(loginPassword,userNumber,xmima);
        return returnContent.getContent(soudatepaw,"数据获取成功","数据获取失败");
    }

}
