package com.cydeo.service;

import com.cydeo.dto.CourseDTO;

import java.util.List;

public interface CourseService {

    List<CourseDTO> findAll();

    CourseDTO findById(Long id) throws Exception;

}