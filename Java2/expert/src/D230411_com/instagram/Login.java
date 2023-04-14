package com.instagram;

public class Login {
	
	//필드
	String id = "human";
	String pw = "1234";
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
//	public boolean loginCheck(String id, String pw) {
//	        for (String id : String id) {
//	            if (savedAccount.equals(account)) {
//	                return true;
//	            }
//	        }
//	        return false;
//	    }
	
	
	
	public void goMain() {
		System.out.println("메인 페이지 입니다");
	}
	
	

}
