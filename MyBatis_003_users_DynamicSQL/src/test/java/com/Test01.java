package com;

import com.fengming.mappers.UsersMapper;
import com.fengming.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 */
public class Test01 {
    //全局变量
    SqlSession sqlSession;
    UsersMapper usersMapper;//动态代理对象
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//日期的格式化

    @Before
    public void openSqlSession() throws IOException {
        //1.取出核心配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建工厂对象
        SqlSessionFactory factory =
                new SqlSessionFactoryBuilder().build(in);
        //3.取出SqlSession对象
        sqlSession = factory.openSession();

        //4.取出动态代理对象,完成接口中方法的调用(实则是调用xml文件中相应的标签)
        usersMapper = sqlSession.getMapper(UsersMapper.class);
    }

    @After
    public void closeSqlSession(){
        //5.关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void testGetByCondition(){
        //查询全部
//        Users users = new Users();
//        List<Users> list = usersMapper.getByCondition(users);
//        list.forEach(users1 -> System.out.println(users1));

        //查询姓名
        Users users = new Users();
        users.setUserName("陈");
        List<Users> list = usersMapper.getByCondition(users);
        list.forEach(users1 -> System.out.println(users1));
    }

    @Test
    public void testUpdateBySet(){
        Users u = new Users();
        u.setId(28);
        u.setUserName("小陈");
        int num = usersMapper.updateBySet(u);
        System.out.println("有选择地更新："+num);
        sqlSession.commit();
    }
}
