package chapterThreeProjects;

import java.awt.Color;
import java.awt.Container;
import java.awt.image.ColorModel;

import javax.swing.JFrame;

public class Six {

	public static void main(String[] args) {
		JFrame GUI =  new JFrame();
		GUI.setTitle("Program");
		GUI.setSize(1000, 800);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorpanel panel = new colorpanel(Color.WHITE);
		Container pane = GUI.getContentPane();
		pane.add(panel);
		GUI.setVisible(true);
	}

}
