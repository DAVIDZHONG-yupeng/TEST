package org.exmple.ssm.service.impl;

import org.exmple.ssm.dao.IProductDao;
import org.exmple.ssm.domain.Product;
import org.exmple.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
