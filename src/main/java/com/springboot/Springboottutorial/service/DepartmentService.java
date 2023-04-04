package com.springboot.Springboottutorial.service;

import com.springboot.Springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentbyId(Long departmentId);


    void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
