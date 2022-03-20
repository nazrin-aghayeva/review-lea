package com.example.azreviewlea.controller;

import com.example.azreviewlea.dto.LoginRequestDto;
import com.example.azreviewlea.dto.LoginResponseDto;
import com.example.azreviewlea.dto.ResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LoginController {

    @PostMapping("/authentication")
    public ResponseEntity<ResponseDto<LoginResponseDto>> signUp(@RequestBody LoginRequestDto loginRequestDto){
        return null;
    }
}
