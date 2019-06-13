package com.ssm.service;

import com.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {

    Orders findById(int ordersId) throws Exception;

    List<Orders> findAll(int page, int size) throws Exception;
}
