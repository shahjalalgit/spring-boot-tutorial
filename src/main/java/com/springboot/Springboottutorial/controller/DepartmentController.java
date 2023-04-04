package com.springboot.Springboottutorial.controller;

import com.springboot.Springboottutorial.entity.Department;
import com.springboot.Springboottutorial.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService; // it is used instance of, DepartmentService departmentService = new DepartmentServiceImpl(), but we won't because Spring_boot has this object, to apply we can use @Autowired annotation

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){

        // passes the data to the business logic
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentbyId(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentbyId(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
         departmentService.deleteDepartmentById(departmentId);
         return "Department delete Successfully!!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
