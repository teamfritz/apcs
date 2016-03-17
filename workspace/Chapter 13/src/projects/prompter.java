package projects;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class prompter {
	  public static void main(String[] a) {
	    JFrame frame = new JFrame();
	    Object result = JOptionPane.showInputDialog(frame, "Enter printer name:");
	  }
}
