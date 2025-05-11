package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;

    //생성자 작성

	public Account() {
		
	}
	
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		this.balance = 0;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
	}
	
	
	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
    

    //필요한 메소드 작성
	//입금 메소드
	public void deposit(int money) {
		if(money > 0) {
			balance = balance + money;
		}else {
			System.out.println("입금 금액이 잘못되었습니다.");
		}
		
			
	public void withdraw(int money) {
		if(money>0 && money<=balance) {
			balance = balance - money;
		}else {
			System.out.println("출금 금액이 잘못되었거나 잔고가 부족합니다.");
		}
	}
		
		
		
		
		
		
		
		
	}
	
	
	
}
	