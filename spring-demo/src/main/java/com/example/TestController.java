package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Restful Web API를 좀 더 쉽게 사용하기 위해 만든 컨트롤러(Controller + ResponseBody)
@RestController

public class TestController {
    @GetMapping(value ="/test") // /test 경로로 들어오는 GET 요청을 처리할 메서드
    public UserDto test(){
        UserDto userDto = new UserDto();
        userDto.setAge(20);
        userDto.setName("hoon");
        return userDto;
    }
}
