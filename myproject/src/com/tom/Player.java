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
	public abstract void attack();
}
