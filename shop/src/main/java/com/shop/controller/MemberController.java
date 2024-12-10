package com.shop.controller;

import com.shop.dto.MemberFormDto;
import com.shop.entity.Member;
import com.shop.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/members")
@Controller
@RequiredArgsConstructor //Autowired 자동으로
public class MemberController {
    private final MemberService memberService; //final을 붙여서 Autowired 되도록
    private final PasswordEncoder passwordEncoder;

    @GetMapping(value = "/new")
    public String memberForm(Model model){
        //내려올때는 post방식으로 전송할 수 있도록 / 뷰에 전달.
        ///new에서 회원가입 폼을 GET 방식으로 보여주고, 그 폼을 POST 방식으로 제출하여 회원가입 데이터를 처리합니다.
        model.addAttribute("memberFormDto", new MemberFormDto());
        return "member/memberForm";
    }

    @PostMapping(value = "/new")
    //@Valid 유효성 검사
    // Model은 에러메세지 올리려고 넣음.
    public String memberForm(@Valid MemberFormDto memberFormDto, BindingResult bindingResult, Model model){

        //@Valid 붙은 객체를 검사해서 결과에 에러가 있으면 실행
        if(bindingResult.hasErrors()){
            return "member/memberForm"; //다시 회원가입으로 돌려보냅니다. GET
        }
        try{
            //Member 객체 생성
            Member member = Member.createMember(memberFormDto, passwordEncoder);
            //데이터베이스에 저장
            memberService.saveMember(member);
        }
        catch (IllegalStateException e){
            model.addAttribute("errorMessage", e.getMessage());
            return "member/memberForm"; //다시 회원가입으로 돌려보냅니다. GET
        }
        return "redirect:/";
    }

}
