package com.elliot.service;

import com.elliot.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by Elliot on 2017/9/20.
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
