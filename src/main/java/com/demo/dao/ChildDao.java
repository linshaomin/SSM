package com.demo.dao;

import com.demo.domain.Child;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 儿童信息dao接口
 */
@Repository
public interface ChildDao {

    @Select("select * from child")
    List<Child> findAll();

    @Insert("insert into child(name,team,age,sex,phone,parent) values (#{name},#{team},#{age},#{sex},#{phone},#{parent})")
    void save(Child child);

    @Update({"update child set name = #{name},team = #{team},age = #{age},sex = #{sex},phone = #{phone},parent = #{parent} where id = #{id}"})
    int update(Child child);

    @Delete("delete from child where id = #{id}")
    int delete(Integer id);

}
