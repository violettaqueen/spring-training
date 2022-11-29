package com.cydeo.service;

import com.cydeo.dto.ClassDTO;

import java.util.List;

public interface ClassService {

    List<ClassDTO> findAll();

    ClassDTO findById(Long id) throws Exception;

}