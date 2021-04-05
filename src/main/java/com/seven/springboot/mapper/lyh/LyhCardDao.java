package com.seven.springboot.mapper.lyh;


import com.seven.springboot.pojo.TPmCard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhCardDao {


        public List<TPmCard>  findAll();

        public List<TPmCard> findById(String cardSerial);
        public List<TPmCard> findAll2(TPmCard card);
        public Integer addCard(TPmCard card);

}
