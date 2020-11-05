package com.liang.controller;

import com.alibaba.fastjson.JSONObject;
import com.liang.domain.BusinessException;
import com.liang.entity.Staff;
import com.liang.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 梁骐镖
 * @date 2020-08-12 9:28
 */

@RestController
@RequestMapping("/")
public class StaffController {
    @Autowired
    private StaffService staffService;

    /**
     * 查询所有员工信息
     * @return
     */
//    @RequestMapping(value = "/findAll", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Object findAll(){
        Map<String,Object> result = new HashMap<String,Object>();
        System.out.println("查询所有");
        List<Staff> list = staffService.findAllStaff();
        result.put("list",list);
        JSONObject json = new JSONObject(result);
        return json;
    }

    /**
     * 保存员工信息
     * @return
     */
    @RequestMapping(value = "/saveStaff", method = RequestMethod.POST, consumes="application/json")
    public Object saveStaff(@RequestBody Staff staff){
        Map<String,Object> result = new HashMap<String,Object>();
        try {
            staffService.saveStaff(staff);
            result.put("success","success");
        }catch (Exception e){
            result.put("error","9999");
        }

        return new JSONObject(result);
    }
    /**
     * 删除员工信息
     * @return
     */
    @RequestMapping(value = "/deleteStaff", method = RequestMethod.POST, consumes="application/json")
    public Object deleteStaff(@RequestBody Staff staff){
        int id = staff.getId();
        Map<String,Object> result = new HashMap<String,Object>();
        try {
            staffService.deleteStaff(id);
            result.put("code","200");
            result.put("success","success");
        }catch (Exception e){
            result.put("error",e);
        }
        return new JSONObject(result);
    }

    /**
     * 修改员工信息
     * @return
     */
    @RequestMapping(value = "/updateStaff", method = RequestMethod.POST, consumes="application/json")
    public Object updateStaff(@RequestBody Staff staff){
        Map<String,Object> result = new HashMap<String,Object>();
        System.out.println("update方法------------------");
            try {
                staffService.updateStaff(staff);
                result.put("code","200");
                result.put("success","success");
            }catch (Exception e){
                result.put("error",e);
            }

        return new JSONObject(result);
    }

}

