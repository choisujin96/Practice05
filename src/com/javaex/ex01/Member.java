package com.javaex.ex01;

public class Member {

	//필드
	private String id;
	private String name;
	private int point;
	
	//생성자
	public Member() {
		
	}
	
	
	public Member(String name, String id, int point) {
		this.name=name;
		this.id=id;
		this.point=point;
	}
	
	
	//메소드-gs
	
	public void setId(String id) {
		this.name=name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setPoint(int Point) {
		this.point=point;
	}
	
	public int getPoint() {
		return point;
	}
	
	
	//메소드-일반
	public void showInfo() {
		System.out.println("회원정보: " + name + 
				           "(" + id + "), " + point + "점");
	}


}

