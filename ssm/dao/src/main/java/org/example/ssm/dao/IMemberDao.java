package org.example.ssm.dao;


import org.apache.ibatis.annotations.Select;
import org.example.ssm.domain.Member;

public interface IMemberDao {
    //@Select("select * from member where id=#{id}")
    //public Member findById(String id) throws Exception;
    @Select("select * from member where id=#{id}")
    Member findById(String id) throws Exception;
}
