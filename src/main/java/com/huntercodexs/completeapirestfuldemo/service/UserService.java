package com.huntercodexs.completeapirestfuldemo.service;

import com.huntercodexs.completeapirestfuldemo.dto.request.UserRequestDto;
import com.huntercodexs.completeapirestfuldemo.dto.response.UserResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public ResponseEntity<UserResponseDto> findOne(String userid) {
        return null;
    }

    public ResponseEntity<UserResponseDto> findAll() {
        return null;
    }

    public ResponseEntity<UserResponseDto> delete(String userid) {
        return null;
    }

    public ResponseEntity<UserResponseDto> create(UserRequestDto user) {
        return null;
    }

    public ResponseEntity<UserResponseDto> update(String userid, UserRequestDto user) {
        return null;
    }

    public ResponseEntity<UserResponseDto> patch(String userid, UserRequestDto user) {
        return null;
    }
}
