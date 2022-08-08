package com.jack.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jack.reggie.entity.Category;

public interface CategoryService extends IService<Category> {

    //根据ID删除分类
    public void remove(Long id);
}