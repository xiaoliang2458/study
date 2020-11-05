package com.liang.service.impl;

import com.liang.dao.StaffDao;
import com.liang.domain.BusinessException;
import com.liang.domain.CommonErrorCode;
import com.liang.entity.Staff;
import com.liang.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 梁骐镖
 * @date 2020-08-12 9:20
 */
@Service("staffService")
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDao staffDao;

    @Override
    public void test() {
        System.out.println("执行Service");
    }

    @Override
    public void saveStaff(Staff staff) throws BusinessException{
        if (staff==null){
            System.out.println("-------传入参数为空-----------------");
            throw new BusinessException(CommonErrorCode.E_110003);
        }
        staffDao.saveStaff(staff);
    }

    @Override
    public Staff findStaffById(int id) {
        return staffDao.findStaffById(id);
    }
    @Override
    public List<Staff> findAllStaff() throws BusinessException {
//        throw new BusinessException(CommonErrorCode.E_110007);
        return staffDao.findAllStaff();
    }

    /**
     * 删除员工表
     * @param id
     */
    @Override
    public void deleteStaff(int id) {
        staffDao.deleteStaff(id);
    }

    @Override
    public void updateStaff(Staff staff) {
        staffDao.updateStaff(staff);
    }
}
