package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	private int count = 0;
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	
	public GUI() {
		
		frame = new JFrame();
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setText("Number of clicks: 0");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle ("Simple GUI");
		frame.setSize(300,100);
		frame.setResizable(false);
		//frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
	}

}
