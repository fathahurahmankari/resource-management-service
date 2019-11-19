package com.ibs.rms.controller;

import com.ibs.rms.model.Employee;
import com.ibs.rms.model.EmployeeInfo;
import com.ibs.rms.model.Experience;
import com.ibs.rms.model.Proficiency;
import com.ibs.rms.model.Skill;
import com.ibs.rms.model.SkillName;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET, value = "/employee")
    public ResponseEntity getEmployees(){
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setEmpId("123");
        employee.setFirstName("Jackson");
        employee.setMiddleName("Baby");
        employee.setLastName("Mathew");
        employee.setEmailId("jacksonuchl@gmail.com");
        employee.setMobileNo("+919964515481");
        employee.setAccountName("Expedia");
        employee.setTeamName("Gladiators");
        employee.setManager("321");
        List<Skill> skills = new ArrayList<>();
        Skill skil1 = new Skill();
        skil1.setSkillId("1");
        skil1.setSkillName(SkillName.JAVA);
        skil1.setVersion("8");
        skil1.setProficiency(Proficiency.PROFICIENT);
        skil1.setLastUsed(new Date());
        Experience experience1 = new Experience();
        experience1.setYear(2);
        experience1.setMonth(6);
        skil1.setExperience(experience1);
        Skill skil2 = new Skill();
        skil2.setSkillId("2");
        skil2.setSkillName(SkillName.ANGULAR_JS);
        skil2.setVersion("8");
        skil2.setProficiency(Proficiency.BEGINNER);
        skil2.setLastUsed(new Date());
        Experience experience2 = new Experience();
        experience2.setYear(2);
        experience2.setMonth(6);
        skil2.setExperience(experience2);
        skills.add(skil1);
        skills.add(skil2);
        employee.setSkills(skills);
        employees.add(employee);
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setEmployees(employees);
        return new ResponseEntity<>(
                employeeInfo, HttpStatus.OK);
    }

}
