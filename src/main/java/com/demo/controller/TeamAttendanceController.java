package com.demo.controller;

import com.demo.base.R;
import com.demo.domain.TeamAttendance;
import com.demo.service.TeamAttendanceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 班级出勤情况controller
 */
@RestController
@RequestMapping("/teamAttendance")
public class TeamAttendanceController {

    @Autowired
    private TeamAttendanceService attendanceService;

    @GetMapping("/page")
    public R<PageInfo<TeamAttendance>> page(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeamAttendance> all = attendanceService.findAll();
        PageInfo page = new PageInfo(all);
        return R.data(page);
    }

    @PostMapping("/saveOrUpdate")
    public R<Boolean> saveOrUpdate(@RequestBody TeamAttendance teamAttendance){
        attendanceService.saveOrUpdate(teamAttendance);
        return R.data(true);
    }

    @GetMapping("/delete")
    public R<Boolean> delete(Integer id) {
        attendanceService.delete(id);
        return R.data(true);
    }
}
