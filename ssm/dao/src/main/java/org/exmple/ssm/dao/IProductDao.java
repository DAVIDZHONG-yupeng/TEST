package org.exmple.ssm.dao;

import org.exmple.ssm.domain.Product;

import java.util.List;

public interface IProductDao {

    //查询所有信息
    public List<Product> findAll() throws Exception;
}
