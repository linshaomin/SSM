package com.demo.dao;

import com.demo.domain.TeamAttendance;
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
public interface TeamAttendanceDao {

    @Select("select * from team_attendance")
    List<TeamAttendance> findAll();

    @Insert("insert into team_attendance(team,teacher,actual_attendance,need_attendance,date) values (#{team},#{teacher},#{actualAttendance},#{needAttendance},#{date})")
    void save(TeamAttendance teamAttendance);

    @Update({"update team_attendance set team = #{team},teacher = #{teacher},actual_attendance = #{actualAttendance},need_attendance = #{needAttendance},date = #{date} where id = #{id}"})
    int update(TeamAttendance teamAttendance);

    @Delete("delete from team_attendance where id = #{id}")
    int delete(Integer id);

}
