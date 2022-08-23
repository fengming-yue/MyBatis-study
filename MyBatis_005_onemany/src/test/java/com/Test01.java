package com;


import com.fengming.mapper.CustomerMapper;
import com.fengming.mapper.OrdersMapper;
import com.fengming.pojo.Customer;
import com.fengming.pojo.Orders;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    //设置全局变量
    SqlSession sqlSession;
    CustomerMapper customerMapper;//代理对象
    OrdersMapper ordersMapper;//代理对象

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
        customerMapper = sqlSession.getMapper(CustomerMapper.class);
        ordersMapper = sqlSession.getMapper(OrdersMapper.class);
    }

    @After//在所有的@Test方法执行后再执行的代码
    public void closeSqlSession(){
        //5.关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testGetCustomerById(){
        Customer customer = customerMapper.getById(3);
        System.out.println(customer);
    }

    @Test
    public void testGetById(){
        Orders orders = ordersMapper.getById(13);
        System.out.println(orders);
    }
}
