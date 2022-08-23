package com;

import com.fengming.mapper.BookMapper;
import com.fengming.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test01 {
    //设置全局变量
    SqlSession sqlSession;
    BookMapper bookMapper;

    @Before//在所有的@Test方法执行前先执行的代码
    public void openSqlSession() throws IOException {
        //1.使用文件流读取核心配置文件SqlMapConfig.xml
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory factory =
                new SqlSessionFactoryBuilder().build(in);
        //3.取出sqlSession的对象
        sqlSession = factory.openSession();

        //使用动态代理
        bookMapper = sqlSession.getMapper(BookMapper.class);
    }

    @After//在所有的@Test方法执行后再执行的代码
    public void closeSqlSession(){
        //5.关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testGetAll(){
        List<Book> list = bookMapper.getAll();
        list.forEach(book -> System.out.println(book));
    }
}
