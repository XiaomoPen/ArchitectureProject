package com.seven.springboot.mapper.pht;

import com.seven.springboot.pojo.TPjClcrk;
import com.seven.springboot.pojo.TPjClcrkmx;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClcrkDao {

    //新增出入库表数据
    @Insert("insert into t_pj_clcrk values (#{clcrkNumber},#{clcrkTime},#{clcrkName},#{clcrkType},#{contractNumber},#{lxxxdjBh},#{gysBh},#{clcrkPurchase},#{clcrkDelivery},#{clcrkAcceptance},#{clcrkWarehousing},#{clcrkInput},#{clcrkApproval})")
    public Integer addClcrk(TPjClcrk clcrk);

    //批量新增出入库明细表数据
    public Integer beathAddClcrkms(List<TPjClcrkmx> clcrkmxes);
}
