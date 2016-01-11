package com.vending;

public class VendingMachine {
	private int total = 0;
	
		
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		if (total>50){
			this.total = 50;
		}else{
			this.total = total;
		}
	}

	public void insertCoin(int coin){
		switch(coin){
		case 1:
		case 5:
		case 10:
			total += coin;
			break;
		}
	}
	
	public boolean select(String drink){
		boolean result = false;
		switch(drink){
		case "a":
			if (total>=15){
				result = true;
				total-=15;
			}
			break;
		case "b":
			if (total>=20){
				result = true;
				total-=20;
			}
			break;
		case "c":
			if (total>=30){
				result = true;
				total-=30;
			}
			break;
		}
		return result;
	}
}
