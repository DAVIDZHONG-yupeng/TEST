package org.example.ssm.service;

import org.example.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll() throws Exception;
}
