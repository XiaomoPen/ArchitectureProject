package com.seven.springboot.service.wtw.impl;

import com.seven.springboot.mapper.wtw.XmkcDao;
import com.seven.springboot.pojo.TPjXmkc;
import com.seven.springboot.service.wtw.XmkcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XmckServiceImpl implements XmkcService {
    @Autowired
    private XmkcDao xmkcDao;

    public List<TPjXmkc> queryAll() {
        return xmkcDao.queryAll();
    }

    public void add(TPjXmkc tPjTbxx) {
        xmkcDao.add(tPjTbxx);
    }

    public TPjXmkc finallys(String serial) {
        return xmkcDao.finallys(serial);
    }

    public void deletes(String serial) {
        xmkcDao.delete(serial);
    }

    public void updates(String serial) {
        xmkcDao.update(serial);
    }

    public void updates1(String serial) {
        xmkcDao.update1(serial);
    }

    public void updates2(String serial) {
        xmkcDao.update2(serial);
    }

    public List<TPjXmkc> selects(String name) {
        return xmkcDao.selects(name);
    }
}
