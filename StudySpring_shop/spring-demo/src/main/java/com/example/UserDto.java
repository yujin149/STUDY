package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class UserDto {
    private String name;
    private Integer age; //integer가 클래스라서 int보다 편함.
}
