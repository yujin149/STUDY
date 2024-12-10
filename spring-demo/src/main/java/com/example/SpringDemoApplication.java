package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//어노테이션은 여러개 쓸 수 있다.

@RestController //컨트롤러를 받을수 있음.
@SpringBootApplication // 스프링부트 어플리케이션
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args); //스프링부트 어플리케이션 실행(.run)
	}


	@GetMapping("/")
	public String HelloWorld(){ //GetMapping는 String을 많이 씀.
		return "Hello 메롱";
	}
}
