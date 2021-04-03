package com.seven.springboot.service.pht;

import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MaterialService {

    public List<TPjMaterialContractDetailed> getMaterialContractDetailed();
}
