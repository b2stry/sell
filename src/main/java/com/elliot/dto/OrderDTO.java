package com.elliot.dto;

import com.elliot.dataobject.OrderDetail;
import com.elliot.enums.OrderStatusEnum;
import com.elliot.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Elliot on 2017/9/30.
 */
@Data
public class OrderDTO {

    //订单id
    private String orderId;

    //买家名字
    private String buyerName;

    //买家手机号
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家openid
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单总金额
    private Integer orderStatus;

    //订单状态，默认0新下单
    private Integer payStatus;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
