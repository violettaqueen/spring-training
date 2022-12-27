package com.cydeo.service.impl;

import com.cydeo.dto.TaskDTO;
import com.cydeo.entity.Task;
import com.cydeo.mapper.TaskMapper;
import com.cydeo.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class TaskServiceImplTest {

    @Mock
    TaskRepository taskRepository;

    @Mock
    TaskMapper taskMapper;

    @InjectMocks
    TaskServiceImpl taskServiceImpl;

    @ParameterizedTest
    @ValueSource(longs = {1L, 2L, 3L})  // provides value into parameter
    void findById_Test(long id) {

        // Given (Preparation)
        Task task = new Task();

        when(taskRepository.findById(id)).thenReturn(Optional.of(task));   // Optional<Task>
        when(taskMapper.convertToDto(task)).thenReturn(new TaskDTO());

        // When (Action is happening)
        taskServiceImpl.findById(id);// We are not defining this will be the method I want to test.

        // Then (Assertion and verification checks)
        verify(taskRepository).findById(id);
        verify(taskMapper).convertToDto(task);

    }

    @Test
    void findById_BDD_Test() {

        // Given
        Task task = new Task();
        given(taskRepository.findById(anyLong())).willReturn(Optional.of(task));
        given(taskMapper.convertToDto(task)).willReturn(new TaskDTO());

        // When
        taskServiceImpl.findById(anyLong()); // when I run this method

        // Then
        then(taskRepository).should().findById(anyLong());  //should run the findById method
        then(taskMapper).should(atLeastOnce()).convertToDto(task);

    }

}