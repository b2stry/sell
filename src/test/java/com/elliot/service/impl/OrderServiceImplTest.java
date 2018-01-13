package com.elliot.service.impl;

import com.elliot.dto.OrderDTO;
import com.elliot.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Elliot on 2017/9/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    private final String BUYER_OPENID = "";

    @Test
    public void create() throws Exception {

    }

    @Test
    public void findOne() throws Exception {
    }

    @Test
    public void findList() throws Exception {
        PageRequest request = new PageRequest(0, 2);
        orderService.findList(BUYER_OPENID, request);
    }

    @Test
    public void cancel() throws Exception {
    }

    @Test
    public void finish() throws Exception {
    }

    @Test
    public void paid() throws Exception {
    }

}