package teste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Java8LambdaRunnable {

	public static void main(String[] args) {
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello Teste");
			}
		});
		
		
		JButton button1 = new JButton();
		button1.addActionListener(e -> System.out.println("Hello Word"));
		
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//			System.out.println("Hello World");
//		}
//		}).run();
//		
//		new Thread(() -> System.out.println("Hello Wordl2")).run();
	}
}
