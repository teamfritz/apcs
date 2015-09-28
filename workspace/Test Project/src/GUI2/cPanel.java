package GUI2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class cPanel extends JPanel{

	public cPanel(Color background) {
		setBackground(background);
	}
	
	public void paintComp(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawRect(50, 50, 100, 50);
	}

}
