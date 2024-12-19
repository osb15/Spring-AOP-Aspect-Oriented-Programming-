package com.maven.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.maven.config.MyConfiguration;
import com.maven.entity.Account;

public class Main {

	public static void main(String[] args) {
		

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Account ac = context.getBean(Account.class);
		ac.Deposite();
//		ac.Withdraw();
//		ac.Recharge();
		
	}

}
