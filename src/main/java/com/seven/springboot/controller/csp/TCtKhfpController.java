package com.seven.springboot.controller.csp;


import com.seven.springboot.service.csp.impl.TCtKhfpServiceImpl;
import com.seven.springboot.service.csp.impl.TCtKhxxServiceImpl;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/khfp")
public class TCtKhfpController {


    @Autowired
    private TCtKhfpServiceImpl tCtKhfpService;
    @Autowired
    private ReturnContent returnContent;
}
