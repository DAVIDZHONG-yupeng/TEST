package org.exmple.ssm.service;

import org.exmple.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll() throws Exception;
}
