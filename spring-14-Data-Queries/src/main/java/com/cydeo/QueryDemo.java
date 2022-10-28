package com.cydeo;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final EmployeeRepository employeeRepository;

    public QueryDemo(RegionRepository regionRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println(employeeRepository.findByEmail("gmariner18@noaa.gov"));
        System.out.println(employeeRepository.findByFirstNameAndLastNameOrEmail("Giacopo","Mariner", "'gmariner18@noaa.gov'"));
        System.out.println(regionRepository.findTopByCountryContainingOrderByRegion("Canada"));
        System.out.println(employeeRepository.findByFirstNameContainingOrderByFirstName("Anetta"));
        System.out.println(employeeRepository.findByFirstNameContaining("Anetta"));
    }
}
