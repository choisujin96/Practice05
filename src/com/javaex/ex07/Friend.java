package com.javaex.ex07;

public class Friend {

    private String name;
    private String hp;  //010은 숫자로 담지 못하고,
    					//주민번호나 학번 같은 것도 문자열로 관리하는 게 더 좋음.
    private String school;

    
    // getter/setter 작성
    public void setName(String name) {
    	this.name=name;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setHp(String hp) {
    	this.hp=hp;
    }
    
    public String getHp() {
    	return hp;
    }
   
    public void setSchool(String school) {
    	this.school=school;
    }
    
    public String getSchool() {
    	return school;
    }
    
    
    public void showInfo(){
        System.out.println("이름:" + name + "\t" + "핸드폰:" + hp +  
        					"\t" + "학교:" + school);
    }

}
