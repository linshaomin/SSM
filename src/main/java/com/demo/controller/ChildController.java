package com.demo.controller;

import com.demo.base.R;
import com.demo.domain.Child;
import com.demo.service.ChildService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 儿童信息管理controller
 */
@RestController
@RequestMapping("/child")
public class ChildController {

    @Autowired
    private ChildService childService;

    @GetMapping("/page")
    public R<PageInfo<Child>> page(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Child> all = childService.findAll();
        PageInfo page = new PageInfo(all);
        return R.data(page);
    }

    @PostMapping("/saveOrUpdate")
    public R<Boolean> saveOrUpdate(@RequestBody Child child){
        childService.saveOrUpdate(child);
        return R.data(true);
    }

    @GetMapping("/delete")
    public R<Boolean> delete(Integer id) {
        childService.delete(id);
        return R.data(true);
    }
}
