package com.sparta.advanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 시간 자동 변경이 가능하도록 합니다.
@ServletComponentScan // 3계층을 사용하지 않은 Servlet으로 구현
public class AdvancedApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdvancedApplication.class, args);
    }
}