package com.demo.service.impl;

import com.demo.dao.TeamAttendanceDao;
import com.demo.domain.TeamAttendance;
import com.demo.service.TeamAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 儿童信息service实现类
 */
@Service
public class TeamAttendanceServiceImpl implements TeamAttendanceService {

    @Autowired
    private TeamAttendanceDao teamAttendanceDao;

    @Override
    public List<TeamAttendance> findAll() {
        return teamAttendanceDao.findAll();
    }

    @Override
    public void saveOrUpdate(TeamAttendance teamAttendance) {
        if(teamAttendance.getId() == null) {
            teamAttendanceDao.save(teamAttendance);
        } else {
            teamAttendanceDao.update(teamAttendance);
        }
    }

    @Override
    public void delete(Integer id) {
        teamAttendanceDao.delete(id);
    }
}
