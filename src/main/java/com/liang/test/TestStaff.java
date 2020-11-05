package com.liang.test;

import com.liang.service.StaffService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 梁骐镖
 * @date 2020-08-12 9:23
 */
public class TestStaff {
    @Test
    public  void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        StaffService staffService = (StaffService) ac.getBean("staffService");
        staffService.test();
    }
}
