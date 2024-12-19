package com.maven.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
		public void Deposite()
		{
			System.out.println("Your Ammount is Deposite..........\n");
			
		}
		
		public void Withdraw()
		{
			System.out.println("Your Ammount is Withdraw..........");
		}
		
		public void Recharge() {
			
			System.out.println("Your Plan Expired Today");
		}

}
