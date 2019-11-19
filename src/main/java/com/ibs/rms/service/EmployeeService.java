package com.ibs.rms.service;

import com.ibs.rms.dao.EmployeeDao;
import com.ibs.rms.model.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public EmployeeInfo getEmployees(String skill){
        return employeeDao.getEmployees(skill);
    }
}
