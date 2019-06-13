package com.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class test {
    public static void main(String[] args){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String b = bCryptPasswordEncoder.encode("789");
        System.out.println(b);
    }
}
