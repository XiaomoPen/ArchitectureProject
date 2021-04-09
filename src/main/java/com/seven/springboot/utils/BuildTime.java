package com.seven.springboot.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BuildTime {
    public static String getTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return simpleDateFormat.format(new Date());
    }
}
