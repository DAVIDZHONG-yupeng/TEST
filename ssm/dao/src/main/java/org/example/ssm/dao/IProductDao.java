package org.example.ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.example.ssm.domain.Product;

import java.util.List;

public interface IProductDao {

    //根据id查询
    @Select("select * from product where id=#{id}")
    public Product findById(String id) throws Exception;

    //查询所有信息
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    @Insert("insert into product(id,productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(MD5(RAND()),#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}
