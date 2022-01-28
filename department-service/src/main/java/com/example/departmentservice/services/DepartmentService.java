package com.example.departmentservice.services;

import com.example.departmentservice.entities.Department;
import com.example.departmentservice.repositories.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public void saveDepartment(Department department) {
        log.info("from save department service");
        departmentRepository.save(department);  }

    public Department findDepartmentById(Long departmentId) {
        log.info("from find department service");
         return departmentRepository.findByDepartmentId(departmentId);
    }
}
