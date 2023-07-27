package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
//@AllArgsConstructor
@RequiredArgsConstructor //final filed 들에 대한 생성자 만들어줌
public class Member {
    private int id;
    private String username;
    private String password;
    private String email;

}
