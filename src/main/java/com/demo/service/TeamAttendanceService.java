package com.demo.service;

import com.demo.domain.TeamAttendance;

import java.util.List;

/**
 * 班级出勤情况service层
 */
public interface TeamAttendanceService {

    List<TeamAttendance> findAll();

    void saveOrUpdate(TeamAttendance teamAttendance);

    void delete(Integer id);
}
