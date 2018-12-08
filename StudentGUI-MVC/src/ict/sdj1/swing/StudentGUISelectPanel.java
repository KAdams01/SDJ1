package ict.sdj1.swing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudentGUISelectPanel extends JPanel
{
   private static final long serialVersionUID = 1L;
   private ButtonPanel selctButtonPanel;
   private TextFieldPanel textFieldPanelForInput;
   private JLabel errorLabel;
   private JComboBox<String> comboBox;

   public StudentGUISelectPanel()
   {
      createComponents();
      addComponentsToPanel();
   }

   private void createComponents()
   {
      textFieldPanelForInput = new TextFieldPanel(StudentGUI.INPUT);
      selctButtonPanel = new ButtonPanel(new FlowLayout(), StudentGUI.SELECT_MODE,
            StudentGUI.SHOW_MODE, StudentGUI.QUIT);
      errorLabel = new JLabel();
      errorLabel.setForeground(Color.RED);
      comboBox = new JComboBox<>(new String[] { StudentGUI.GROUP, StudentGUI.STAR_SIGN,
            StudentGUI.NATIONALITY });
   }

   private void addComponentsToPanel()
   {
      setLayout(new BorderLayout());
      JPanel inputPanel = new JPanel();
      inputPanel.add(comboBox);
      inputPanel.add(textFieldPanelForInput);
      add(inputPanel, BorderLayout.NORTH);
      add(selctButtonPanel, BorderLayout.SOUTH);
      add(errorLabel, BorderLayout.CENTER);
   }

   public void addActionListener(ActionListener listener)
   {
      selctButtonPanel.addActionListenerToAllButtons(listener);
   }

   public String[] getInput()
   {
      String[] input = { comboBox.getSelectedItem().toString(),
            textFieldPanelForInput.getTextField(StudentGUI.INPUT).getText() };
      textFieldPanelForInput.getTextField(StudentGUI.INPUT).setText("");
      return input;
   }

   public void clear()
   {
      textFieldPanelForInput.getTextField(StudentGUI.INPUT).setText("");
      errorLabel.setText("");
      textFieldPanelForInput.getTextField(0).requestFocus();
   }

   public void setErrorMessage(String message)
   {
      errorLabel.setText(message);
   }

}