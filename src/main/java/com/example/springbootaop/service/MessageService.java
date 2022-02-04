package com.example.springbootaop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String messageVer(String param){
        System.out.println("message ver metodu " + param);
        return param;
    }
}
