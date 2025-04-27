package com.example.pagination.service.impl;

import com.example.pagination.dto.UserDto;
import com.example.pagination.dto.mapper.UserMapper;
import com.example.pagination.repository.UserRepository;
import com.example.pagination.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Page<UserDto> getUsers(String name, int page, int size) {
        log.info("Fetching users for page {} of size {}", page, size);
        return userRepository.findByFirstNameContaining(name, PageRequest.of(page, size)).map(u -> UserMapper.fromUser(u));

    }
}
