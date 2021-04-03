package com.seven.springboot.mapper.pht;

import com.seven.springboot.pojo.TPjMaterialContract;
import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Mapper
public interface MaterialDao {

    @Select("select * from t_pj_materialContractDetailed")
    public List<TPjMaterialContractDetailed> getMaterialContractDetailed();
}
