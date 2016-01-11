package com.thread;

public class Racing6 {

	public static void main(String[] args) {
		Thread h = new Thread(){

			@Override
			public void run() {
				for (int i=1; i<=500; i++){
					System.out.println(getName()+":"+i);
				}
			}
			
		};
		h.start();
		//
		Runnable hr = new Runnable() {
			
			@Override
			public void run() {
				for (int i=1; i<=500; i++){
					System.out.println("H2:"+i);
				}
				
			}
		};
		Thread thr = new Thread(hr);
		thr.start();
		//
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=1; i<=500; i=i+2){
					System.out.println("H3:"+i);
				}
			}
		}).start();
	}

}
