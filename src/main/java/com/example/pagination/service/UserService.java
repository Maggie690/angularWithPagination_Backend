package com.example.pagination.service;

import com.example.pagination.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Page<UserDto> getUsers(String name, int page, int size);
}
