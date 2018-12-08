package ict.sdj1.swing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudentGUIAddPanel extends JPanel
{
   private static final long serialVersionUID = 1L;
   private ButtonPanel addButtonPanel;
   private TextFieldPanel textFieldPanelForStudent;
   private JLabel errorLabel;
   
   public StudentGUIAddPanel()
   {
      createComponents();
      addComponentsToPanel();
   }

   private void createComponents()
   {
      textFieldPanelForStudent = new TextFieldPanel(StudentGUI.STUDY_NUMBER,
            StudentGUI.NAME, StudentGUI.NATIONALITY, StudentGUI.GROUP,
            StudentGUI.DAY, StudentGUI.MONTH, StudentGUI.YEAR);
      addButtonPanel = new ButtonPanel(new FlowLayout(), StudentGUI.ADD_MODE,
            StudentGUI.SHOW_MODE, StudentGUI.QUIT);
      errorLabel = new JLabel();
      errorLabel.setForeground(Color.RED);
   }

   private void addComponentsToPanel()
   {
      setLayout(new BorderLayout());
      add(textFieldPanelForStudent, BorderLayout.NORTH);
      add(addButtonPanel, BorderLayout.SOUTH);
      add(errorLabel, BorderLayout.CENTER);
   }

   public void addActionListener(ActionListener listener)
   {
      addButtonPanel.addActionListenerToAllButtons(listener);
   }

   public void setErrorMessage(String message)
   {
      errorLabel.setText(message);
   }

   public String[] getInput()
   {
      String[] input = new String[7];
      input[0] = textFieldPanelForStudent.getTextField(StudentGUI.STUDY_NUMBER)
            .getText();
      input[1] = textFieldPanelForStudent.getTextField(StudentGUI.NAME)
            .getText();
      input[2] = textFieldPanelForStudent.getTextField(StudentGUI.NATIONALITY)
            .getText();
      input[3] = textFieldPanelForStudent.getTextField(StudentGUI.GROUP)
            .getText();
      input[4] = textFieldPanelForStudent.getTextField(StudentGUI.DAY)
            .getText();
      input[5] = textFieldPanelForStudent.getTextField(StudentGUI.MONTH)
            .getText();
      input[6] = textFieldPanelForStudent.getTextField(StudentGUI.YEAR)
            .getText();

      return input;
   }

   public void clear()
   {
      textFieldPanelForStudent.getTextField(StudentGUI.STUDY_NUMBER)
            .setText("");
      textFieldPanelForStudent.getTextField(StudentGUI.NAME).setText("");
      textFieldPanelForStudent.getTextField(StudentGUI.NATIONALITY).setText("");
      textFieldPanelForStudent.getTextField(StudentGUI.GROUP).setText("");
      textFieldPanelForStudent.getTextField(StudentGUI.DAY).setText("");
      textFieldPanelForStudent.getTextField(StudentGUI.MONTH).setText("");
      textFieldPanelForStudent.getTextField(StudentGUI.YEAR).setText("");
      errorLabel.setText("");
      textFieldPanelForStudent.getTextField(0).requestFocus();
   }

}
