package ict.sdj1.swing;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class StudentGUIOutputPanel extends JPanel
{
   private static final long serialVersionUID = 1L;
   private ButtonPanel showButtonPanel;
   private JTextArea textArea;

   public StudentGUIOutputPanel()
   {
      createComponents();
      addComponentsToPanel();
   }

   private void createComponents()
   {
      textArea = new JTextArea(3, 5);
      showButtonPanel = new ButtonPanel(new FlowLayout(), StudentGUI.ADD_MODE,
            StudentGUI.REMOVE_MODE, StudentGUI.SELECT_MODE,
            StudentGUI.SHOW_MODE, StudentGUI.QUIT);
      textArea.setEditable(false);
   }

   private void addComponentsToPanel()
   {
      setLayout(new BorderLayout());
      add(new JScrollPane(textArea), BorderLayout.CENTER);
      add(showButtonPanel, BorderLayout.SOUTH);
   }

   public void setText(String text)
   {
      textArea.setText(text);
   }

   public void addActionListener(ActionListener listener)
   {
      showButtonPanel.addActionListenerToAllButtons(listener);
   }
}
