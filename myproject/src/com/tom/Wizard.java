package com.tom;

public class Wizard extends Player {

	@Override
	public void attack() {
		System.out.println(
		"使出定身術,週圍無法動彈三回合");
	}

}
