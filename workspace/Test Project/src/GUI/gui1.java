package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui1 {
	public static void main(String[] args){
		JFrame GUI = new JFrame();
		GUI.setTitle("Test GUI");
		GUI.setSize(1200, 700);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(Color.red);
		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.red);
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.yellow);
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.yellow);
		Container view = GUI.getContentPane();
		view.add(leftPanel, BorderLayout.WEST);
		view.add(northPanel, BorderLayout.NORTH);
		view.add(southPanel, BorderLayout.SOUTH);
		view.add(rightPanel, BorderLayout.EAST);
		GUI.setVisible(true);
		try {
		    Thread.sleep(1000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		GUI.setVisible(false);
		try {
		    Thread.sleep(500);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		view.setLayout(new GridLayout(2,2));
		GUI.setVisible(true);
	}

}
