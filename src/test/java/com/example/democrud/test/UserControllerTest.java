package com.example.democrud.test;

import com.example.democrud.test.controller.UserController;
import com.example.democrud.test.entity.Student;
import com.example.democrud.test.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserController userController;

    private MockMvc mockMvc;

    @Test
    void testNewUser() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();

        Student user = new Student();
        user.setId(1L);
        user.setUsername("testuser");
        user.setName("Test User");
        user.setEmail("test@example.com");

        when(userRepository.save(any(Student.class))).thenReturn(user);

        mockMvc.perform(post("/student")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"username\":\"testuser\",\"name\":\"Test User\",\"email\":\"test@example.com\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.username").value("testuser"))
                .andExpect(jsonPath("$.name").value("Test User"))
                .andExpect(jsonPath("$.email").value("test@example.com"));

        verify(userRepository, times(1)).save(any(Student.class));
    }

    @Test
    void testGetAllUsers() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();

        when(userRepository.findAll()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/students"))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));

        verify(userRepository, times(1)).findAll();
    }

    @Test
    void testGetUserById() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();

        Student user = new Student();
        user.setId(1L);
        user.setUsername("testuser");
        user.setName("Test User");
        user.setEmail("test@example.com");

        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        mockMvc.perform(get("/student/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.username").value("testuser"))
                .andExpect(jsonPath("$.name").value("Test User"))
                .andExpect(jsonPath("$.email").value("test@example.com"));

        verify(userRepository, times(1)).findById(1L);
    }

    // Add similar test methods for updateUser and deleteUser
    // ...

}
