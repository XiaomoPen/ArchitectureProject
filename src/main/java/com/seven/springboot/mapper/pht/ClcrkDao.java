package com.seven.springboot.mapper.pht;

import com.seven.springboot.pojo.TPjClcrk;
import com.seven.springboot.pojo.TPjClcrkmx;
import com.seven.springboot.vo.pht.ClcrlDataVo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClcrkDao {

    //新增出入库表数据
    @Insert("insert into t_pj_clcrk values (#{clcrkNumber},#{clcrkTime},#{clcrkName},#{clcrkType},#{contractNumber},#{lxxxdjBh},#{gysBh},#{clcrkPurchase},#{clcrkDelivery},#{clcrkAcceptance},#{clcrkWarehousing},#{clcrkInput},#{clcrkApproval})")
    public Integer addClcrk(TPjClcrk clcrk);

    //批量新增出入库明细表数据
    public Integer beathAddClcrkms(List<TPjClcrkmx> clcrkmxes);

    //获取出库数量
    @Select("select count(*) from t_pj_clcrk")
    public Integer getClcrkSum();

    //通过分页查询入库表信息
    @Select("select * from t_pj_clcrk pc left join t_pj_lxxxdj pl on pc.lxxxdj_bh=pl.lxxxdj_bh left join t_pj_gys pg on pc.gys_bh=pg.gys_bh limit #{page},10")
    public List<ClcrlDataVo> getClcrltoLimit(@Param("page") Integer page);

    //通过模糊查询入库表信息
    @Select("select * from t_pj_clcrk pc left join t_pj_lxxxdj pl on pc.lxxxdj_bh=pl.lxxxdj_bh left join t_pj_gys pg on pc.gys_bh=pg.gys_bh where pc.clcrk_name like '%${data}%' or pl.lxxxdj_xmmc like '%${data}%'")
    public List<ClcrlDataVo> getClcrltoSearch(@Param("data") String data);

    //修改入库表状态
    @Update("update t_pj_clcrk set clcrk_approval=#{data} where clcrk_number=#{number} ")
    public Integer upClcrkApprovalByNumber(@Param("data") Integer data,@Param("number") String number);
}
