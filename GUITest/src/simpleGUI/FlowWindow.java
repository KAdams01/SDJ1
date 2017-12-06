package simpleGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FlowWindow extends JFrame {
	private JLabel labelDay,labelMonth,labelYear, labelEdit;
	private JTextField textFieldDay, textFieldMonth, textFieldYear;
	private JButton button1;
	private MyDate today = new MyDate();

	public FlowWindow() {
		super("Flow Window");
		createComponents();
		initializeComponents();
		addComponentsToFrame();
		registerEventHandlers();
	}

	private void createComponents() {
		button1 = new JButton("Show");
		labelDay = new JLabel("Day: ");
		labelMonth = new JLabel("Month: ");
		labelYear = new JLabel("Year: ");
		labelEdit = new JLabel("Date: " + today.toString());
		labelEdit.setForeground(Color.RED);
		textFieldDay = new JTextField(6);
		textFieldMonth = new JTextField(6);
		textFieldYear = new JTextField(6);
	}
	private void initializeComponents() {
		final int WIDTH = 300, HEIGHT = 150;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		textFieldDay.setText(Integer.toString(today.getDay()));
		textFieldMonth.setText(Integer.toString(today.getMonth()));
		textFieldYear.setText(Integer.toString(today.getYear()));

	}
	private void registerEventHandlers() {
		ButtonHandler handler = new ButtonHandler();
		button1.addActionListener(handler);
	}

	private void addComponentsToFrame() {
		JPanel topBar = new JPanel(new BorderLayout());
		topBar.add(labelEdit, BorderLayout.NORTH);
		
		JPanel panelLabel = new JPanel(new BorderLayout());
		panelLabel.add(labelDay, BorderLayout.NORTH);
		panelLabel.add(labelMonth, BorderLayout.CENTER);
		panelLabel.add(labelYear, BorderLayout.SOUTH);
		
		JPanel panelText = new JPanel(new BorderLayout());
		panelText.add(textFieldDay, BorderLayout.NORTH);
		panelText.add(textFieldMonth, BorderLayout.CENTER);
		panelText.add(textFieldYear, BorderLayout.SOUTH);
		
		JPanel panelButtons = new JPanel(new BorderLayout(0,5));
		panelButtons.add(button1, BorderLayout.NORTH);
		
		JPanel contentPane = new JPanel(new BorderLayout());
		JPanel mainContent = new JPanel(new FlowLayout());
		JPanel fullContent = new JPanel(new BorderLayout());
		fullContent.add(contentPane, BorderLayout.NORTH);
		fullContent.add(mainContent, BorderLayout.CENTER);
		contentPane.add(topBar);
		mainContent.add(panelLabel);
		mainContent.add(panelText);
		mainContent.add(panelButtons);
		setContentPane(fullContent);
	}

	public static void main(String args[]) {
		FlowWindow uI = new FlowWindow();
		uI.setVisible(true);
	}
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String msg = textFieldDay.getText() + "/" + textFieldMonth.getText() + "/" + textFieldYear.getText();
			if (event.getSource() == button1) {
				JOptionPane.showMessageDialog(null, msg);
			}
			
		}
		
	}
}
