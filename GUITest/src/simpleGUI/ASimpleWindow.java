package simpleGUI;

import javax.swing.JFrame;

public class ASimpleWindow extends JFrame{
	
	public ASimpleWindow() {
		super("A Simple Window 2");
		setSize(1000, 1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
