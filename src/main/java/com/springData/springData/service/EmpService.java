package com.springData.springData.service;

import com.springData.springData.model.dto.EmployeeDto;
import com.springData.springData.model.entity.Employee;
import com.springData.springData.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    public EmpRepo empRepo;

    public EmployeeDto getEmployee(Integer id){
        return EmployeeDto.toDto(empRepo.findById(id).orElse(null));
    }

    public EmployeeDto saveEmployee(EmployeeDto employee) {
        Employee savedEmployee = empRepo.save(EmployeeDto.toEntity(employee));
        return EmployeeDto.toDto(savedEmployee);
    }

    public void deleteEmployee(Integer id){
         empRepo.deleteById(id);
    }

    public List<EmployeeDto> getAllEmployees(){
        return empRepo.findAll()
                .stream()
                .map(EmployeeDto::toDto)
                .toList();
    }

}

