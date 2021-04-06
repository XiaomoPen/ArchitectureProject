package com.seven.springboot.service.wtw.impl;
import com.seven.springboot.mapper.wtw.ZbwjgmDao;
import com.seven.springboot.pojo.TPjZbwj;
import com.seven.springboot.service.wtw.ZbwjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZbwjServiceImpl implements ZbwjService {
    @Autowired
    private ZbwjgmDao zbwjgmDao;
    public List<TPjZbwj> queryAll() {
        return zbwjgmDao.queryAll();
    }

    public void zbwjAdd(TPjZbwj tPjZbwj) {
        zbwjgmDao.zbwjAdd(tPjZbwj);
    }

    public TPjZbwj zbwjFinally(String serial) {
        return zbwjgmDao.zbwjFinally(serial);
    }

    public void zbwjDelete(String serial) {
        zbwjgmDao.zbwjDelete(serial);
    }

    public void zbwjUpdate(String serial) {
        zbwjgmDao.zbwjUpdate(serial);
    }

    public void zbwjUpdate1(String serial) {
        zbwjgmDao.zbwjUpdate1(serial);
    }

    public void zbwjUpdate2(String serial) {
        zbwjgmDao.zbwjUpdate2(serial);
    }

    public List<TPjZbwj> zbwjSelect(String name) {
        return zbwjgmDao.zbwjSelect(name);
    }
}
