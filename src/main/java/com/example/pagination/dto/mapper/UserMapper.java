package com.example.pagination.dto.mapper;

import com.example.pagination.domain.User;
import com.example.pagination.dto.UserDto;
import org.springframework.beans.BeanUtils;

public class UserMapper {
    public static UserDto fromUser(User user) {
        UserDto userDTO = new UserDto();
        BeanUtils.copyProperties(user, userDTO);

        return userDTO;
    }

    public static User fromUserDto(UserDto userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);

        return user;
    }
}
