package com.elliot.controller;

import com.elliot.VO.ProductVO;
import com.elliot.VO.ProductinfoVO;
import com.elliot.VO.ResultVO;
import com.elliot.dataobject.ProductCategory;
import com.elliot.dataobject.ProductInfo;
import com.elliot.service.CategoryService;
import com.elliot.service.ProductService;
import com.elliot.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list() {

        //1.查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();


        //2.查询类目（一次性查询）
//        List<Integer> categoryIntegerList = new ArrayList<>();
//        //传统方法
//        for (ProductInfo productInfo : productInfoList) {
//            categoryIntegerList.add(productInfo.getCategoryType());
//        }

        //精简方法
        List<Integer> categoryIntegerList = productInfoList.stream()
                .map(e -> e.getCategoryType()).collect(Collectors.toList());

        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryIntegerList);

        //3.数据拼装

        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {

            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());


            List<ProductinfoVO> productinfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {

                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductinfoVO productinfoVO = new ProductinfoVO();
                    BeanUtils.copyProperties(productInfo, productinfoVO);
                    productinfoVOList.add(productinfoVO);
                }
            }
            productVO.setProductinfoVOList(productinfoVOList);
            productVOList.add(productVO);
        }


        return ResultVOUtil.success(productVOList);
    }
}
