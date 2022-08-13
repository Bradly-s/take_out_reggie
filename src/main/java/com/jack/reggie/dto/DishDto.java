package com.jack.reggie.dto;

import com.jack.reggie.entity.Dish;
import com.jack.reggie.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {
    private List<DishFlavor> flavors = new ArrayList<>();

    //菜品分类名称
    private String categoryName;

    private Integer copies;
}
