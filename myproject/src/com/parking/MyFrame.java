package com.parking;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
//	MyListener listener = new MyListener();
	public MyFrame(){
		setSize(300, 200);
		setLayout(new FlowLayout());
		JButton b = new JButton("OK");
		add(b);
//		b.addActionListener(listener);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("wawa");
				
			}
		});
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

	/*class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ha");
			
		}
		
	}*/
}
