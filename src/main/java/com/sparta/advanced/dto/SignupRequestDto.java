package com.sparta.advanced.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto {
    private String username;
    private String password;
    private String email;
    private boolean admin = false;    // 둘 중 하나 이므로 True False로 처리
    private String adminToken = "";
}