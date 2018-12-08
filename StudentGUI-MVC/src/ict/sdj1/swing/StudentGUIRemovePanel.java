package ict.sdj1.swing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudentGUIRemovePanel extends JPanel
{
   private static final long serialVersionUID = 1L;
   private ButtonPanel removeButtonPanel;
   private TextFieldPanel textFieldPanelForIndex;
   private JLabel errorLabel;

   public StudentGUIRemovePanel()
   {
      createComponents();
      addComponentsToPanel();
   }

   private void createComponents()
   {
      textFieldPanelForIndex = new TextFieldPanel(StudentGUI.INDEX);
      removeButtonPanel = new ButtonPanel(new FlowLayout(),
            StudentGUI.REMOVE_MODE, StudentGUI.SHOW_MODE, StudentGUI.QUIT);
      errorLabel = new JLabel();
      errorLabel.setForeground(Color.RED);
   }

   public void addActionListener(ActionListener listener)
   {
      removeButtonPanel.addActionListenerToAllButtons(listener);
   }

   public String[] getInput()
   {
      String[] input = { textFieldPanelForIndex.getTextField(StudentGUI.INDEX)
            .getText() };
      textFieldPanelForIndex.getTextField(StudentGUI.INDEX).setText("");
      return input;
   }

   public void setErrorMessage(String message)
   {
      errorLabel.setText(message);
   }

   public void clear()
   {
      textFieldPanelForIndex.getTextField(StudentGUI.INDEX).setText("");
      errorLabel.setText("");
      textFieldPanelForIndex.getTextField(0).requestFocus();
   }

   private void addComponentsToPanel()
   {
      setLayout(new BorderLayout());
      add(textFieldPanelForIndex, BorderLayout.NORTH);
      add(removeButtonPanel, BorderLayout.SOUTH);
      add(errorLabel, BorderLayout.CENTER);
   }
}
