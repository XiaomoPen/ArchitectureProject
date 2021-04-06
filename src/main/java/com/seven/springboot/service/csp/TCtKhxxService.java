package com.seven.springboot.service.csp;

import com.seven.springboot.pojo.TCtKhxx;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TCtKhxxService {

    public List<TCtKhxx> queryAll();

    public List<TCtKhxx> queryNullAll();

    public List<TCtKhxx> queryIdAll(String userNumber);

    public List<TCtKhxx> querymhcx(String khxxXm);

    public void addKhxx(TCtKhxx tCtKhxx);

    public Integer delKhxx(String khxxBh);

}
