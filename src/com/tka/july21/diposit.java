package com.tka.july21;

public class diposit extends withdraw {
//	
//	void add() {
//		System.out.println("addition");
//	}
//	void withdraw(double amount) {
//		System.out.println("withdraw method");
//	}
//}

 void withdraw( double amount) {
	 balance-=amount;
	 System.out.println("afteer withdraw remaining amount"+balance);
	 
 }
 void diposit(double amount) {
	 balance+=amount;
	 System.out.println("totaldipostiediposit="+balance);
 }

}