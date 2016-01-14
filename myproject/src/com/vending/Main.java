package com.vending;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		VendingMachine vend = new VendingMachine();
		Scanner scanner = new Scanner(System.in);
		boolean go = true;
		while(go){
			System.out.println("目前販賣機餘額:"+vend.getTotal()+"元");
			System.out.print("請投幣或選擇a,b或c,或按0結束:");
			String line = scanner.nextLine();
			switch(line){
			case "1":
			case "5":
			case "10":
				vend.insertCoin(Integer.parseInt(line));
				break;
			default:
				boolean success = vend.select(line);
				if (success){
					System.out.println("DON!");
				}else{
					System.out.println("BEEP!");
				}
				break;
			case "0":
				go = false;
				break;
			}
		}
	}

}
