package com.shop.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class MemberFormDto {
    @NotBlank(message = "이름은 필수 입력 값입니다.")
    private String name;

    @NotEmpty(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String email;

    @NotEmpty(message = "비밀번호는 필수 입력 값입니다.")
    @Length(min=8, max = 16, message = "비밀번호는 8자이상, 16자 이하로 입력해주세요.")
    //특수문자, 대문자, 소문자, 숫자 포함 비밀번호
    //(?=.*[A-Z]): 대문자가 반드시 포함
    //(?=.*[a-z]): 소문자가 반드시 포함
    //(?=.*\\d): 숫자가 반드시 포함
    //(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]): 특수문자가 반드시 포함
    //@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,16}$",
    //            message = "비밀번호는 대문자, 소문자, 숫자, 특수문자를 포함한 8~16자여야 합니다.")
    private String password;

    @NotEmpty(message = "주소는 필수 입력 값입니다.")
    private String address;

    @NotEmpty(message = "전화번호는 필수 입력 값입니다.")
    @Pattern(regexp = "^(01[0-9])-([0-9]{3,4})-([0-9]{4})$", message = "전화번호는 010-XXXX-XXXX 형식으로 입력해주세요.") //하이픈 넣어서 할때,
    //@Pattern(regexp = "^(01[0-9])[-]?[0-9]{3,4}[-]?[0-9]{4}$", message = "전화번호는 010-XXXX-XXXX 또는 010XXXXXXXX 형식으로 입력해주세요.")
    private String phone;


}
