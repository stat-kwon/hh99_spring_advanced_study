package com.sparta.advanced.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity // 스프링 Security 지원을 가능하게 함
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder encodePassword() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();                     // 해커로 부터 방어
        http.headers().frameOptions().disable();   //

        // 로그인 기능 상세 설정을 해주는 것것 ( 접근 권한을 설정해 주는 것 )
        http.authorizeRequests()
                // image 폴더를 login 없이 허용
                .antMatchers("/images/**").permitAll()
                // css 폴더를 login 없이 허용
                .antMatchers("/css/**").permitAll()
                .antMatchers("/user/**").permitAll()  // user로 시작되는 부분은 인증과정 없이 처리가 되도록 하는 것
                .antMatchers("/h2-console/**").permitAll()  // user로 시작되는 부분은 인증과정 없이 처리가 되도록 하는 것
                // 그 외 모든 요청은 인증과정 필요
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/user/login")                // 로그인 페이지 호출을 설정
                .loginProcessingUrl("/user/login")       // 실제 로그인을 진행
                .defaultSuccessUrl("/")                  // 로그인 생성시 보여줄 페이지
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/user/logout")
                .permitAll();
    }
}

