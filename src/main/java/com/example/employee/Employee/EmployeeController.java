package com.example.employee.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    static Map<Integer, Employee> employees = Collections.synchronizedMap(new HashMap<Integer, Employee>());
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> getEmployees () {
        return employeeService.getEmployeeList();
    }

}
