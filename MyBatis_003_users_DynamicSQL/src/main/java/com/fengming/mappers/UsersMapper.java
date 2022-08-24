package com.fengming.mappers;

import com.fengming.pojo.Users;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 数据访问层的接口,规定了数据库中可进行的各种操作
 */
public interface UsersMapper {

    //查询全部用户信息
    List<Users> getAll();

    //按指定的条件进行多条件查询  ---->if和where联合使用
    List<Users> getByCondition(Users users);

    //有选择的更新用户字段(传统的更新会更新所有字段的数据,不会更新单个数据的字段)
    int updateBySet(Users users);

    //查询多个指定id的用户信息
    List<Users> getByIds(Integer[] arr);

    //批量删除
    int deleteBatch(Integer[] arr);

    //批量增加
    int insertBatch(List<Users> users);

    //批量更新
    int updateSet(List<Users> users);



    //查询指定日期范围内的用户信息
    List<Users> getByBirthday(Date begin, Date end);

    //入参是map
    List<Users> getByMap(Map map);


    //返回值是map(一行)
    Map getReturnOne(Integer id);

    //返回值是map(多行)
    List<Map> getMulMap();
}
