package com.springData.springData.controller;

import com.springData.springData.model.dto.EmployeeDto;
import com.springData.springData.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmpController {

    @Autowired
    public EmpService empService;

    @GetMapping("/get-emp")
    public EmployeeDto getEmployee(@RequestParam Integer id){
        return empService.getEmployee(id);
    }

    @PostMapping("/save-emp")
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto employee){
        return empService.saveEmployee(employee);
    }

    @DeleteMapping("/delete-emp")
    public void deleteEmployee(@RequestParam Integer id){
         empService.deleteEmployee(id);
    }

    @PostMapping("/update-emp")
    public EmployeeDto updateEmployee(@RequestBody EmployeeDto employee){
        return empService.saveEmployee(employee);
    }

    @GetMapping
    public List<EmployeeDto> getAllEmployees(){
        return empService.getAllEmployees();
    }


}
