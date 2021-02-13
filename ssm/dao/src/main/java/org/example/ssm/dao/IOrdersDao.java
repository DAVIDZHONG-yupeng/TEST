package org.example.ssm.dao;

import org.apache.ibatis.annotations.*;
import org.example.ssm.domain.Orders;
import org.example.ssm.domain.Product;

import java.lang.reflect.Member;
import java.util.List;

public interface IOrdersDao {

    @Select("select * from orders")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "org.example.ssm.dao.IProductDao.findById"))

    })
    public List<Orders> findAll() throws Exception;

    //多表操作
    //@Select("select * from orders where id=#{ordersId}")
    //@Results({
    //        @Result(id = true, property = "id", column = "id"),
    //        @Result(property = "orderNum",column = "orderNum"),
    //        @Result(property = "orderTime",column = "orderTime"),
    //        @Result(property = "orderStatus",column = "orderStatus"),
    //        @Result(property = "peopleCount",column = "peopleCount"),
    //        @Result(property = "payType",column = "payType"),
    //        @Result(property = "orderDesc",column = "orderDesc"),
    //        @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "org.example.ssm.dao.IProductDao.findById")),
    //        @Result(property = "member",column = "memberId",javaType = Member.class,one = @One(select = "org.example.ssm.dao.IMemberDao.findById")),
    //        @Result(property = "travellers",column = "id",javaType = java.util.List.class,many = @Many(select = "org.example.ssm.dao.ITravellerDao.findByOrdersId"))
    //})
    //public Orders findById(String ordersId) throws Exception;
    @Select("select * from orders where id=#{id}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "orderNum",property = "orderNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "orderStatus",property = "orderStatus"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "productId",property = "product",one = @One(select = "org.example.ssm.dao.IProductDao.findById")),
            @Result(column = "id",property = "travellers",many = @Many(select = "org.example.ssm.dao.ITravellerDao.findByOrdersId")),
            @Result(column = "memberId",property = "member",one = @One(select = "org.example.ssm.dao.IMemberDao.findById")),
    })
    Orders findById(String id) throws Exception;

}
