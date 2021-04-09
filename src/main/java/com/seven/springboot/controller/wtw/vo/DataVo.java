package com.seven.springboot.controller.wtw.vo;

import com.seven.springboot.pojo.TPjJzdsmx;
import com.seven.springboot.pojo.TPjKbdj;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataVo {
    private TPjKbdj tPjKbdj;
    private List<TPjJzdsmx> tPjJzdsmx;

    public TPjKbdj gettPjKbdj() {
        return tPjKbdj;
    }

    public void settPjKbdj(TPjKbdj tPjKbdj) {
        this.tPjKbdj = tPjKbdj;
    }

    public List<TPjJzdsmx> gettPjJzdsmx() {
        return tPjJzdsmx;
    }

    public void settPjJzdsmx(List<TPjJzdsmx> tPjJzdsmx) {
        this.tPjJzdsmx = tPjJzdsmx;
    }

    @Override
    public String toString() {
        return "DataVo{" +
                "tPjKbdj=" + tPjKbdj +
                ", tPjJzdsmx=" + tPjJzdsmx +
                '}';
    }
}
