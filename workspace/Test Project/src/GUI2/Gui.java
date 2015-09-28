package GUI2;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

import GUI.gui1;

public class Gui {

	public static void main(String[] args) {
		JFrame GUI = new JFrame();
		GUI.setTitle("Test GUI");
		GUI.setSize(500, 500);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cPanel panel = new cPanel(Color.ORANGE);
		Container pane = GUI.getContentPane();
		pane.add(panel);
		GUI.setVisible(true);
	}
}
