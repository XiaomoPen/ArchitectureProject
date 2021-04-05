package com.seven.springboot.service.lyh;

import com.seven.springboot.pojo.TPmCard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CardService {

    public List<TPmCard> findAll();

    public List<TPmCard> findById(String cardSerial);
    public List<TPmCard> findAll2(TPmCard card);
    public Integer addCard(TPmCard card);
}
