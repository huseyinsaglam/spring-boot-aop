package com.example.springbootaop.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageServiceAspect {

    @Before("execution(* com.example.springbootaop.service.MessageService.messageVer(..))")
    public void mesajVerMetodundanOnce(JoinPoint joinPoint) {
        System.out.println("Mesaj ver metodundan önce parametre yakalandi param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.example.springbootaop.service.*.*(..))")
    public void mesajVerMetodundanSonra(JoinPoint joinPoint) {
        System.out.println("Mesaj ver metodundan sonra parametre yakalandi param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
