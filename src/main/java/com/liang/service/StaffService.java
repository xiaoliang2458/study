package com.liang.service;

import com.liang.domain.BusinessException;
import com.liang.entity.Staff;

import java.util.List;

/**
 * @author 梁骐镖
 * @date 2020-08-12 9:20
 */
public interface StaffService {
    public void test();

    /**
     * 保存员工信息
     * @param staff
     */
    public void saveStaff(Staff staff) throws BusinessException;
    //根据id查询员工信息
    public Staff findStaffById(int id) ;
    //查询所有的员工信息
    public List<Staff> findAllStaff() throws BusinessException;
    //删除员工表
    public void deleteStaff(int id);
    //修改员工信息表
    public  void updateStaff(Staff staff);
}
