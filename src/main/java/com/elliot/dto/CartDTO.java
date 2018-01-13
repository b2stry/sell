package com.elliot.dto;

import lombok.Data;

/**
 * Created by Elliot on 2017/9/30.
 *
 * @author Shallowan
 */
@Data
public class CartDTO {
    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }


}
