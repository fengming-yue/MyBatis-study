package com.fengming.mapper;

import com.fengming.pojo.Orders;

public interface OrdersMapper {
    //根据订单的主键id查询订单并同时查询该下此订单的客户信息
    Orders getById(Integer id);
}
