package com.demo.service.impl;

import com.demo.dao.ChildDao;
import com.demo.domain.Child;
import com.demo.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 儿童信息service实现类
 */
@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    private ChildDao childDao;

    @Override
    public List<Child> findAll() {
        return childDao.findAll();
    }

    @Override
    public void saveOrUpdate(Child child) {
        if(child.getId() == null) {
            childDao.save(child);
        } else {
            childDao.update(child);
        }
    }

    @Override
    public void delete(Integer id) {
        childDao.delete(id);
    }
}
