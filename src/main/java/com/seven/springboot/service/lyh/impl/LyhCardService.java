package com.seven.springboot.service.lyh.impl;


import com.seven.springboot.mapper.lyh.LyhCardDao;
import com.seven.springboot.pojo.TPmCard;
import com.seven.springboot.service.lyh.CardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhCardService implements CardService {

    @Resource
    private LyhCardDao bs;


    public List<TPmCard> findAll() {
        return bs.findAll();
    }


    public List<TPmCard> findById(String cardSerial) {
        return bs.findById(cardSerial);
    }


    public List<TPmCard> findAll2(TPmCard card) {
        return bs.findAll2(card);
    }


    public Integer addCard(TPmCard card) {
        return bs.addCard(card);
    }
}
