package com.seven.springboot.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TPjEquipment {
    private String equipmentCategoryNumber;
    private String equipmentNumber;
    private String equipmentCategoryName;
    private String equipmentName;
    private String equipmentBrand;
    private String equipmentModel;
    private String equipmentUnit;
}
