package com.seven.springboot.controller.csp;

import com.seven.springboot.service.csp.TCtKhxxService;
import com.seven.springboot.service.csp.impl.TCtKhxxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/khxx")
public class TCtKhxxController {

    @Autowired
    private TCtKhxxServiceImpl tCtKhxxService;

}
