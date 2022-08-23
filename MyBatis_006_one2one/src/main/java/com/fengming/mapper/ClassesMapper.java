package com.fengming.mapper;

import com.fengming.pojo.Classes;

public interface ClassesMapper {
    //查询指定教师ID的班级信息
    public Classes findById(Integer cid);
}
