package org.example.ssm.dao;

import org.apache.ibatis.annotations.Select;
import org.example.ssm.domain.Traveller;

import java.util.List;

public interface ITravellerDao {
    //@Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    //public List<Traveller> findByOrdersId(String ordersId) throws Exception;
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
