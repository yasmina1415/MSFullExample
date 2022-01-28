package com.example.departmentservice.controllers;

import com.example.departmentservice.entities.Department;
import com.example.departmentservice.services.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("from save department controller");
        departmentService.saveDepartment(department);
        return department;
    }


    @GetMapping("/{id}")
    public Department findDepartment(@PathVariable("id") Long departmentId){
        log.info("from find department controller");
       return departmentService.findDepartmentById(departmentId);
    }


}
