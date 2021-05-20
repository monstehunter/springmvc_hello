package com.example.controller;

import com.example.dao.DepartmentDao;
import com.example.dao.EmployeeDao;
import com.example.entities.Department;
import com.example.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * @author lo
 * @version 1.0
 * @ClassName EmployeeController
 * @Description TODO
 * @date 2021/5/19 16:38
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String getEmps(Model model){
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps",all);
        return "list";
    }

    @RequestMapping("/toAddPage")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depetments",departments);
        return "add";
    }
}
