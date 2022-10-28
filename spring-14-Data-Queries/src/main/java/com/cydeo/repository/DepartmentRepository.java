package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DepartmentRepository extends JpaRepository<Department, String> {

    //display all departments
    List<Department> findByDepartment(String department);

    //display all departments in the health division
    List<Department> findByDivision(String division);
    //find all Departments in the health division
    List<Department> findByDivisionEquals(String division);
    List<Department> findByDivisionIs(String division);

    //display departments where their division ends with 'ics'
    List<Department> findByDivisionEndingWithIgnoreCase(String pattern);

    //display top 3 departments where their division includes 'Hea' without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);

    //display department division - JPQL
    @Query("select d from Department d where d.division in ?1")
    List<Department> retrieveDepartmentDivision(List<String> divisions);

    //named parameter






}
