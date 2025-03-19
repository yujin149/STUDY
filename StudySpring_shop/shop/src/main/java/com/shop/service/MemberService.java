package com.shop.service;

import com.shop.dto.MemberFormDto;
import com.shop.entity.Member;
import com.shop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

@Service
@Transactional //두 성공하거나 모두 실패할 수 있게 위해 넣어줌.

// final 필드나 @NonNull 필드에 대해 자동으로 생성자를 생성
@RequiredArgsConstructor //final, @NonNull 변수에 붙으면 자동 주입(Autowired)을 해줍니다.
public class MemberService {
    private final MemberRepository memberRepository; //자동 주입됨

    //saveMember는 controller에서 부름.
    public Member saveMember(Member member){
        validateDuplicateMember(member);
        return memberRepository.save(member); //데이터베이스에 저장을 하라는 명령
    }
    
    public void validateDuplicateMember(Member member){
        Member findMember = memberRepository.findByEmail(member.getEmail());
        if(findMember != null){
            // 예외가 발생하면 throw해서 controller에서 화면 적용.
            throw new IllegalStateException("이미 가입된 회원입니다."); //예외 발생
        }

        //전화번호
        Member findMemberPhone = memberRepository.findByPhone(member.getPhone());
        if(findMemberPhone != null){
            // 예외가 발생하면 throw해서 controller에서 화면 적용.
            throw new IllegalStateException("중복된 전화번호입니다."); //예외 발생
        }
    }
}

