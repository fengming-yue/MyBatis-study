package com.fengming.mapper;

import com.fengming.pojo.Book;

import java.util.List;

public interface BookMapper {
    //查询全部图书(使用别名)
    List<Book> getAll();

    //查询全部图书
    List<Book> getAll1();
}
