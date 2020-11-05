package com.liang.test;

import com.liang.dao.StaffDao;
import com.liang.entity.Staff;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 梁骐镖
 * @date 2020-08-12 10:44
 */
public class MybatisTest {
    public MybatisTest() throws IOException {
    }

    @Test
    public  void test2() throws IOException {
    //加载配置文件
    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
    SqlSession session= factory.openSession();
    StaffDao staffDao = session.getMapper(StaffDao.class);
    List<Staff> list = staffDao.findAllStaff();
    for (Staff staff:list){
        System.out.println(staff);
    }
    session.close();
    in.close();
    }
    @Test
    public  void test3() throws IOException {
            Staff staff = new Staff();
            staff.setName("xiaoyu");
            staff.setAge(19);
            staff.setAddress("beijing");
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session= factory.openSession();
        StaffDao staffDao = session.getMapper(StaffDao.class);
        staffDao.saveStaff(staff);
        session.commit();
        session.close();
        in.close();
    }
}
