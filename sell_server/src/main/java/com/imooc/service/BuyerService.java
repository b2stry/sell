package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家
 * Created by shallowan
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
