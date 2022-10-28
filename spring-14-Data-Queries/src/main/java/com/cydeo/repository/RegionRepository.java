package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer> {

    //display all regions in Canada
    List<Region> findByCountry(String country);
    List<Region> getByCountry(String country);

    //display all regions with country name includes United
    List<Region> findByCountryContaining(String country);

    //display all Regions with country name include United in order region
    List<Region> findByCountryContainingOrderByRegion(String country);

    //display top 2 regions in United States
    List<Region> findTopByCountry(String country);
    List<Region> findTop2ByCountry(String country);

    //display all regions where Country contains "" order by Region
    List<Region> findTopByCountryContainingOrderByRegion(String country);





}
