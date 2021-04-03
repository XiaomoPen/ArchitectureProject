package com.seven.springboot.utils.impl;

import com.seven.springboot.utils.Constant;
import com.seven.springboot.utils.RestContent;
import com.seven.springboot.utils.ReturnContent;
import org.springframework.stereotype.Component;

@Component
public class ReturnContentImpl implements ReturnContent {

    private RestContent restContent=new RestContent();

    public RestContent getContent(Object t, String info,String error) {
        if(null==t){
            restContent.setState(Constant.dataError500);
            restContent.setContent(null);
            restContent.setInfo(error);
        }else{
            restContent.setState(Constant.success200);
            restContent.setContent(t);
            restContent.setInfo(info);
        }
        return restContent;
    }

    public RestContent getContent(int t, String info, String error) {
        if(t>0){
            restContent.setState(Constant.success200);
            restContent.setInfo(info);
        }else{
            restContent.setState(Constant.dataError500);
            restContent.setInfo(error);
        }
        restContent.setContent(null);
        return restContent;
    }
}
