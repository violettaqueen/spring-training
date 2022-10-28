package com.cydeo.repository;

import com.cydeo.entity.Course;
import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //find all courses by category and order courses by the name
    List<Course> findByCategoryOrderByName(String category);

    //find all courses by category
    List<Course> findByCategory(String category);

    //check if a course with the supplied name exist. Return true if exist otherwise
    boolean existsByName(String name);

    //returns the count of courses for the given category
    int countByCategory(String category);

    //find all the courses that start with the given course name string
    List<Course> findByNameStartingWith(String pattern);

    //find all courses by category and returns a string
    Stream<Course> streamAllByCategory(String category);

    @Query("select c from Course c where c.category >= :category and c.rating >= :rating")
    List<Course> retrieveAllByCategoryAndRatingGreaterThan(@Param("category") String category, @Param("rating") String rating);

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

    //NAMED PARAMETER
    @Query("select c from Course c where c.rating > :rating")
    List<Course> retrieveAllByCategoryAndRatingGreaterThan(@Param("category") String category);

}
