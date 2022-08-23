package com.fengming.mapper;

import com.fengming.pojo.Teacher;

public interface TeacherMapper {
    //指定班级信息查询教师id
    public Teacher findById(Integer cid);
}
