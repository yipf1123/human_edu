package bank;

import java.text.DecimalFormat;

public class Account {

	// 필드
	private static int balance = 1000;
	private static String owner;

	// 생성자
	Account(String owner) {
		this.owner = owner;
		System.out.println();
		System.out.println("안녕하세요:) " + owner + " 고갱님");
		System.out.println("환영합니다!");
	}

	// 메소드
	// 직접 잔액 수정
	
	public static String printComma(int a) {
		DecimalFormat formatter = new DecimalFormat("###,###");
		String formattedBalance = formatter.format(a);
		return formattedBalance;
	}
	
	public static String getBalance() {
		return printComma(balance);
	}


	public void setBalance(int balance) {
		if (balance >= 0)
			this.balance = balance;
	}

	public static String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	

	// 입금
	public void deposit(int money) {
		if (money > 0) {
			balance += money;
			System.out.println(printComma(money) + "원이 입금되었습니다.");
		    System.out.println("잔액: " + printComma(balance) + "원");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}// 입금 끝

	
	// 출금
	public void withdraw(int money) {
		if (balance > money) {
			balance -= money;;
			System.out.println(printComma(money) + "원이 출금되었습니다.");
		    System.out.println("잔액: " + printComma(balance) + "원");
		} else {
			System.out.println("잔고가 부족합니다.");
		}
	}// 출금 끝

	
} // class 끝
