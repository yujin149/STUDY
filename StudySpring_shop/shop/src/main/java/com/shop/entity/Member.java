package com.shop.entity;

import com.shop.constant.Role;
import com.shop.dto.MemberFormDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity //엔티티
@Table(name="member") //테이블명
@Getter
@Setter
@ToString

public class Member {
    //기본키 컬럼명 = member_id AI -> 데이터 저장시 1씩 증가
    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //알아서 설정
    private String name;

    //중복 허용X
    @Column(unique = true)
    private String email;

    //알아서
    private String password;

    //알아서
    private String address;

    //중복 허용X
    @Column(unique = true)
    private String phone;

    //Enum -> 컴 : 숫자 // 우리 : 문자
    //데이터베이스 문자 그대로 -> USER, ADMIN
    @Enumerated(EnumType.STRING)
    private Role role;

    //PasswordEncoder passwordEncoder는 SecurityConfig에서 @Bean 패스워드 암호화 해주는 객체와 연결
    //자바랑 동일하게 넣어야함!!!!
    //사용자랑 관리자로 나뉘어진게 아니라 로그인 / 로그인안했을때로 구조를 생각해야함.
    //로그인 한 후 사용자 관리자로 나눔.
    //static이라 바로 메모리에 올라감.
    public static Member createMember(MemberFormDto memberFormDto, PasswordEncoder passwordEncoder){
        Member member = new Member();
        member.setName(memberFormDto.getName());
        member.setEmail(memberFormDto.getEmail());
        member.setAddress(memberFormDto.getAddress());
        member.setPhone(memberFormDto.getPhone());

        //보안상 안전한 형식으로 바꿔줌 -> 암호화 시킴
        String password = passwordEncoder.encode(memberFormDto.getPassword());
        member.setPassword(password);
        member.setRole(Role.ADMIN); //관리자로 세팅
        return member;
    }
}
