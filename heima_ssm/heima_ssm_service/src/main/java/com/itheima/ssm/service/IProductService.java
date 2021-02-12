package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    public List<com.itheima.ssm.domain.Product> findAll() throws Exception;

}
