package com.springboot.Springboottutorial.repository;

import com.springboot.Springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {     //here, JpaRepository<Entity, Primary_key_type>, N.B: JpaRepository has own implemented methods

    public Department findByDepartmentName(String departmentName); //no need to implement, by the naming convention [findByParameter_Name_of_Entity(parameter)]

    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
