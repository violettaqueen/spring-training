package com.cydeo.service.impl;

import com.cydeo.dto.StudentDTO;
import com.cydeo.repository.StudentRepository;
import com.cydeo.service.StudentService;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final MapperUtil mapperUtil;

    public StudentServiceImpl(StudentRepository studentRepository, MapperUtil mapperUtil) {
        this.studentRepository = studentRepository;
        this.mapperUtil = mapperUtil;
    }

    public List<StudentDTO> getStudents() {
        return studentRepository.findAll().stream().map(student -> mapperUtil.convert(student, new StudentDTO())).collect(Collectors.toList());
    }

}
