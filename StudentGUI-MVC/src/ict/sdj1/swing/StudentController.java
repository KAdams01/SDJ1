package ict.sdj1.swing;
class StudentController
{
   private StudentGUI gui;
   private StudentModelManager model;

   public StudentController(StudentModelManager model, StudentGUI gui)
   {
      this.gui = gui;
      this.model = model;
   }

   public void execute(String mode)
   {
      if (mode.equals(StudentGUI.QUIT))
      {
         System.exit(0);
      }
      else if (!mode.equals(gui.getMode()))
      {
         gui.setMode(mode);
         return;
      }
 
      switch (mode)
      {
        case StudentGUI.SHOW_MODE:
            executeShow();
            break;
         case StudentGUI.ADD_MODE:
            executeAdd();
            break;
         case StudentGUI.REMOVE_MODE:
            executeRemove();
            break;
         case StudentGUI.SELECT_MODE:
            executeSelect();
            break;
      }


   }

   private void executeShow()
   {
      gui.setMode(StudentGUI.SHOW_MODE);
      String text = model.toString();
      gui.setText(text);
   }

   private void executeRemove()
   {
      int index = -1;
      Student student = null;

      String[] input = gui.getInput();

      try
      {
         index = Integer.parseInt(input[0]);
      }
      catch (Exception e)
      {
         index = -1;
      }

      // validate
      if (index < 0 || index >= model.getSize())
      {
         gui.setErrorText("Wrong input format");
      }
      else
      {
         student = model.removeStudent(index);
         if (student != null)
         {
            gui.setText("Removed: " + student);
         }
         else
         {
            gui.setText("No students has been removed");
         }
         gui.setMode(StudentGUI.SHOW_MODE);
      }
   }

   private void executeSelect()
   {
      StudentList students = null;
      String txt = "";

      String[] input = gui.getInput();
      try
      {
         String what = input[0];
         String value = input[1];

         gui.setText(what + " - " + value);

         int group = -1;
         switch (what)
         {
            case StudentGUI.GROUP:
               group = Integer.parseInt(value);
               students = model.getStudentsByGroup(group);
               txt += "Group " + group + ": \n";
               break;
            case StudentGUI.STAR_SIGN:
               students = model.getStudentsByStarSign(value);
               txt += value + ": \n";
               break;
            case StudentGUI.NATIONALITY:
               students = model.getStudentsByNationality(value);
               txt += "Nationality: " + value + ": \n";
               break;
         }
      }
      catch (Exception e)
      {
         txt = "";
      }

      // validate
      if (txt.equals(""))
      {
         gui.setErrorText("Wrong input format");
      }
      else
      {
         if (students != null && students.size() > 0)
         {
            gui.setText(txt + students.toString());
         }
         else
         {
            gui.setText("No students: " + txt);
         }
         gui.setMode(StudentGUI.SHOW_MODE);
      }
   }

   private void executeAdd()
   {
       String[] input = gui.getInput();
      try
      {
         int studyNumber = Integer.parseInt(input[0].trim());
         String name = input[1].trim();
         String nationality = input[2].trim();
         int group = Integer.parseInt(input[3].trim());
         int day = Integer.parseInt(input[4].trim());
         int month = Integer.parseInt(input[5].trim());
         int year = Integer.parseInt(input[6].trim());

         MyDate birthday = new MyDate(day, month, year);
         Student student = new Student(name, studyNumber, nationality, group,
               birthday);
         model.addStudent(student);
         gui.setText("Added: " + student);
         gui.setMode(StudentGUI.SHOW_MODE);
      }
      catch (Exception e)
      {
         gui.setErrorText("Wrong input format: " + e.getMessage());
      }
   }

}
