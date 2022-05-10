package com.demo.domain;

/**
 * 儿童信息实体
 */
public class TeamAttendance {
    private Integer id;
    /**
     * 老师
     */
    private String teacher;
    /**
     * 班级
     */
    private String team;

    /**
     * 应出勤
     */
    private Integer needAttendance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getNeedAttendance() {
        return needAttendance;
    }

    public void setNeedAttendance(Integer needAttendance) {
        this.needAttendance = needAttendance;
    }

    public Integer getActualAttendance() {
        return actualAttendance;
    }

    public void setActualAttendance(Integer actualAttendance) {
        this.actualAttendance = actualAttendance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 实际出勤
     */
    private Integer actualAttendance;
    /**
     * 日期
     */
    private String date;

}
