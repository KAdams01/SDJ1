package simpleGUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JavaMenuTest extends JFrame {
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem item1, item2, item3, item4;
	private JPanel fullContent = new JPanel();
	Object rowData[][] = {{"row1-col1", "row1-col2"},{"row2-col1","row2-col2"}};
	Object colHead[] = {"colHead1", "colHead2"};
	JTable table = new JTable(rowData,colHead);
	
	public JavaMenuTest() {
		super("JavaMenuTest");
		createComponents();
		initializeComponents();
		addComponentsToFrame();
		registerEventHandlers();
	}

	public void createComponents() {
		menuBar1 = new JMenuBar();
		menu1 = new JMenu("Background Colour");
		item1 = new JMenuItem("red");
		item2 = new JMenuItem("blue");
		item3 = new JMenuItem("green");
		item4 = new JMenuItem("white");
		menuBar1.add(menu1);
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		JScrollPane main = new JScrollPane(table);
		table.setBounds(0, 0, 300, 300);
		fullContent.add(main);

	}

	public void initializeComponents() {
		final int WIDTH = 500, HEIGHT = 500;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setJMenuBar(menuBar1);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
	}

	public void addComponentsToFrame() {
		
		setContentPane(fullContent);
	}

	public void registerEventHandlers() {
		ButtonHandler buttons = new ButtonHandler();
		item1.addActionListener(buttons);
		item2.addActionListener(buttons);
		item3.addActionListener(buttons);
		item4.addActionListener(buttons);
		
	}

	public static void main(String[] args) {
		JavaMenuTest userInterface = new JavaMenuTest();
		userInterface.setVisible(true);
		

	}
	
private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == item1) {
				fullContent.setBackground(Color.red);
				table.setBackground(Color.red);
			}
			if (event.getSource() == item2) {
				fullContent.setBackground(Color.blue);
				table.setBackground(Color.blue);
			}
			if (event.getSource() == item3) {
				fullContent.setBackground(Color.green);
				table.setBackground(Color.green);
			}
			if (event.getSource() == item4) {
				fullContent.setBackground(Color.white);
				table.setBackground(Color.white);
			}
		}
	}

}
