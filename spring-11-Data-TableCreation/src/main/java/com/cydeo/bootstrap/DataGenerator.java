package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.enums.Gender;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public DataGenerator(CarRepository carRepository, EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.carRepository = carRepository;
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car("BMW", "M3");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Toyota", "Corolla");

        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        Employee e1 = new Employee("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,4,20), Gender.F, 2500);
        Employee e2 = new Employee("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,1,26), Gender.F, 2500);
        Employee e3 = new Employee("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,5,17), Gender.F, 2500);
        Employee e4 = new Employee("Avrom", "Rowantree", null, LocalDate.of(2014,3,2), Gender.M, 2500);
        Employee e5 = new Employee("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,1,14), Gender.M, 2500);

        Department d1 = new Department("Sports","Outdoors");
        Department d2 = new Department("Tools","Hardware");
        Department d3 = new Department("Clothing","Home");
        Department d4 = new Department("Phones & Tablets","Electronics");
        Department d5 = new Department("Computers","Electronics");

        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));


    }
}
