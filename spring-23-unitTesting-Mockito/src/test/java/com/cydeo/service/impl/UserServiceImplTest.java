package com.cydeo.service.impl;

import com.cydeo.mapper.UserMapper;
import com.cydeo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)  // enable mockito in JUnit
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;  // need to use class name not interface

    @Mock
    UserMapper userMapper;  // this obj should be mock because we need an object from it to test findByUserName

    @InjectMocks  // inject here two mocks above , this annotation can not work with Interfaces
    UserServiceImpl userService; // one object be created and mocks to DI here

    @Test
    void findByUserName_Test() {

        // I'm calling the real method inside the main, which is the method I want to test.
        userService.findByUserName("harold@manager.com");

        // I'm checking if this method ran or not. Did I run it or not?
        verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false);

        // verify if this method is called 1 time in the method we are testing
        verify(userRepository, times(1)).findByUserNameAndIsDeleted("harold@manager.com", false);

        verify(userRepository, atLeastOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atLeast(1)).findByUserNameAndIsDeleted("harold@manager.com", false);

        verify(userRepository, atMostOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atMost(10)).findByUserNameAndIsDeleted("harold@manager.com", false);

        InOrder inOrder = inOrder(userRepository, userMapper);

        inOrder.verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false);
        inOrder.verify(userMapper).convertToDto(null);

    }

}
