package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //display all employees with email address
    List<Employee> findByEmail(String email);

    //display all employees with first name and last name and email
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //display all employees their first name is not "ozzy"
    List<Employee> findByFirstNameIsNot(String firstName);

    //display all employees where last name starts with ""
    List<Employee> findByLastNameStartingWith(String lastName);

    //display all employees with salary less than
    List<Employee> findBySalaryLessThan(Integer salary);

    //salaries higher than
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //employees hired between
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //display employees where salaries grater and equal to "" in order salary
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);
    // is null
    List<Employee> findByEmailIsNull();

    @Query("select e from Employee e where e.email = 'amcnee1@google.es'")
    Employee retrieveEmployeeDetail();

    @Query("select e.salary from Employee e where e.email = 'amcnee1@google.es'")
    Employee retrieveEmployeeSalary();

    List<Employee>findByFirstNameContainingOrderByFirstName(String firstName);
    List<Employee> findByFirstNameContaining(String firstName);

    //named parameter
    @Query("select e from Employee e where e.salary = :salary")
    List<Employee> retrieveEmployeeSalary(@Param("salary")int salary);

    //not Equal
    @Query("select e from Employee e where e.salary <> ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

    //like /contains/ startsWith / endsWith
    @Query("select e from Employee e where e.firstName like ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    //less than
    @Query("select e from Employee e where e.salary < ?1")
    List<Employee> retrieveEmployeeLessThan(int salary);

    @Query("select e.firstName from Employee e where e.salary > ?1")
    List<String> retrieveEmployeeSalaryGreaterThan(int salary);

    //between
    @Query("select e from Employee e where e.salary between ?1 and ?2")
    List<Employee> retrieveEmployeeSalaryGreaterThan(int salary1, int salary2);

    //before
    @Query("select e from Employee e where e.hireDate > ?1")
    List<Employee> retrieveEmployeeHireDateBefore(LocalDate hireDate);

    //null
    @Query("select e from Employee e where e.email is null")
    List<Employee> retrieveEmployeeEmailIsNUll();

    //is not null
    @Query("select e from Employee e where e.email is not null")
    List<Employee> retrieveEmployeeEmailIsNotNull();

    //sorting in acs order
    @Query("select e from Employee e order by e.salary")
    List<Employee> retrieveEmployeeSalaryOrderAsc();

    //sorting in desc
    @Query("select e from Employee e order by e.salary desc")
    List<Employee> retrieveEmployeeSalaryOrderDesc();

    //native query
     @Query(value = "select * from employees where salary = ?1", nativeQuery = true)
    List<Employee> retrieveEmployeeDetailBySalary(int salary);





}
