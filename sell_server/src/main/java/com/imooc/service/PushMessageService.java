package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 推送消息
 * Created by shallowan
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
