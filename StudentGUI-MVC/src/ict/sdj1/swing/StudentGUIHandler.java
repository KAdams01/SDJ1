package ict.sdj1.swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StudentGUIHandler implements ActionListener
{
   @SuppressWarnings("unused")
   private StudentGUI gui;
   private StudentController controller;

   public StudentGUIHandler(StudentGUI gui, StudentController controller)
   {
      this.gui = gui;
      this.controller = controller;
   }

   public void actionPerformed(ActionEvent event)
   {
      String mode = event.getActionCommand();
      controller.execute(mode);      
   }

}
