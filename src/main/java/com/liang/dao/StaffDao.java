package com.liang.dao;

import com.liang.entity.Staff;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 梁骐镖
 * @date 2020-08-12 9:28
 */
@Repository
public interface StaffDao {
    /*
    保存员工信息
     */
    @Insert("insert into staff (age,name,sex,address) values (#{age},#{name},#{sex},#{address})")
    public void saveStaff(Staff staff);
    //根据id查询员工信息
    public Staff findStaffById(int id);
    //查询所有的员工信息
    @Select("select * from staff")
    public List<Staff> findAllStaff();
    //删除员工
    @Delete("delete from staff where id = #{id}")
    public void deleteStaff(int id);
    //修改员工信息
    @Update("update staff set age=#{age},name=#{name},sex=#{sex},address=#{address} where id = #{id}")
    public void updateStaff(Staff staff);
}
