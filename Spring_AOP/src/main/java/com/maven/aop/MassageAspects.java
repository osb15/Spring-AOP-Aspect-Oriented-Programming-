package com.maven.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MassageAspects {
	
	@Before("execution(public void Deposit())")
	public void SendMassage() {
		
		System.out.println("Enter Your PIN.....");
	}
	
	
	@After("execution(public void Deposite())")
	public void SendReply() {
		
		System.out.println("Your Current Ammount is 40000");
		
	}
	
	@Around("execution( * com.maven.entity.Account.*(..))")
	public void SendSMS(ProceedingJoinPoint p) {
		System.out.println("Your Plain Exepiring Soon......Please Recharge");
		try {
			p.proceed();
			
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("Recharge Sucessfully........");
	}
	
}
