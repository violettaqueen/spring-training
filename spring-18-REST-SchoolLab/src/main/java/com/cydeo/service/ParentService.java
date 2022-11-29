package com.cydeo.service;

import com.cydeo.dto.ParentDTO;

import java.util.List;

public interface ParentService {

    List<ParentDTO> findAll();

    ParentDTO findById(Long id) throws Exception;

}