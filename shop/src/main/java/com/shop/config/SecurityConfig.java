package com.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//config 설정
@Configuration
@EnableWebSecurity // 웹 보안을 가능하게 한다.

public class SecurityConfig {
    //책이랑 다른 버전 (3버전일때는 아래처럼 넣어줘야함.)
    //@Bean은 객체 / 자바 클래스에서 빈을 수동으로 정의할 때 사용
    //자바 코드에서 직접 빈을 등록
    //스프링이 객체를 잘 관리해서 우리 코드에서 필요할 때 쉽게 자동으로 가져다 쓸 수 있게 도와준다!
    @Bean // 스프링 컨테이너에 올라가는 객체(Bean)
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        return http.build();
    }
    //

    @Bean //패스워드 암호화 해주는 객체
    public static PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
