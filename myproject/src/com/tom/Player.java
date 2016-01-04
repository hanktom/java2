package com.tom;

public abstract class Player {
	String nickname;
	int hp;
	public String getNickname(){
		return nickname;
	}
	public int getHp(){
		return hp;
	}
	public void bleed(int hp){
		hp = hp - 10;
	}
	
	public abstract void attack();
}
