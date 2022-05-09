package com.demo.service;

import com.demo.domain.Child;

import java.util.List;

/**
 * 儿童信息service层
 */
public interface ChildService {

    List<Child> findAll();

    void saveOrUpdate(Child child);

    void delete(Integer id);
}
