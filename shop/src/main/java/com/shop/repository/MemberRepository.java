package com.shop.repository;

import com.shop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    
    //이메일 찾기
    Member findByEmail(String email);

    //전화번호 찾기
    Member findByPhone(String phone);

    //이미 존재하는 전화번호인지 확인하는 메서드
    boolean existsByPhone(String phone);
}
