package org.example.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import org.example.ssm.dao.IOrdersDao;
import org.example.ssm.domain.Orders;
import org.example.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int page,int size) throws Exception{
        //参数pageNum是页码值，参数pageSize是每页条数
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }
    @Override
    public Orders findById(String ordersId) throws Exception {
        return ordersDao.findById(ordersId);
    }
}
