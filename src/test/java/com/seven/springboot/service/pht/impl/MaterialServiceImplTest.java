package com.seven.springboot.service.pht.impl;

import com.seven.springboot.pojo.TPjMaterialContractDetailed;
import com.seven.springboot.service.pht.MaterialService;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MaterialServiceImplTest extends TestCase {

    @Autowired
    private MaterialService materialService;

    @Test
    public void testGetMaterialContractDetailed() {
        List<TPjMaterialContractDetailed> materialContractDetailed = materialService.getMaterialContractDetailed();
        Assert.assertNotNull(materialContractDetailed);
    }
}