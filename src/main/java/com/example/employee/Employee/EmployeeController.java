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

    /*@ResponseBody
    @PostMapping(value = "/employees")
    public String addEmployee ( @RequestParam("id") Integer id,
                                @RequestParam("name") String name,
                                @RequestParam("age") Integer age,
                                @RequestParam("gender") String gender) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setAge(age);
        employee.setGender(gender);
        employees.put(id,employee);
        return "success";
    }

    @RequestMapping("/")
    public ModelAndView index(){
        List<Employee> userList =new ArrayList<Employee>(employees.values());

        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }*/
}
