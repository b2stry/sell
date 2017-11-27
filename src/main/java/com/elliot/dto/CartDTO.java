package com.elliot.dto;

import lombok.Data;

/**
 * Created by Elliot on 2017/9/30.
 */
@Data
public class CartDTO {
    //商品id
    private String productId;

    //商品数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public CartDTO() {
    }
}
