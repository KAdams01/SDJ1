package ict.sdj1.swing;
import java.awt.*;
import javax.swing.*;

public class StudentGUI extends JFrame
{
   private static final long serialVersionUID = 1L;
   private StudentGUIOutputPanel outputPanel;
   private StudentGUIAddPanel addPanel;
   private StudentGUIRemovePanel removePanel;
   private StudentGUISelectPanel selectPanel;
   private JPanel cardPanel;
   private CardLayout cardLayout;
   private String mode;
   @SuppressWarnings("unused")
   private Container c;

   public static final String ADD_MODE = "Add";
   public static final String REMOVE_MODE = "Remove";
   public static final String SHOW_MODE = "Show all";
   public static final String SELECT_MODE = "Select";
   public static final String QUIT = "Quit";

   public static final String NAME = "Name";
   public static final String STUDY_NUMBER = "Study number";
   public static final String NATIONALITY = "Nationality";
   public static final String GROUP = "Group number";
   public static final String DAY = "Birthday: day";
   public static final String MONTH = "Birthday: month";
   public static final String YEAR = "Birthday: year";
   public static final String STAR_SIGN = "Star sign";
   public static final String INDEX = "Index";
   public static final String INPUT = "Enter value";

   public StudentGUI()
   {
     super("Student GUI");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      outputPanel = new StudentGUIOutputPanel();
      addPanel = new StudentGUIAddPanel();
      removePanel = new StudentGUIRemovePanel();
      selectPanel = new StudentGUISelectPanel();

      cardLayout = new CardLayout();
      cardPanel = new JPanel(cardLayout);

      mode = SHOW_MODE;
   }

   private void initializeComponents()
   {
      setSize(400, 500); // set frame size
      setLocationRelativeTo(null); // center of the screen
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   private void addComponentsToFrame()
   {
      cardPanel.add(outputPanel, SHOW_MODE);
      cardPanel.add(removePanel, REMOVE_MODE);
      cardPanel.add(selectPanel, SELECT_MODE);
      cardPanel.add(addPanel, ADD_MODE);

      setContentPane(cardPanel);
   }

   public void startGui(StudentController controller)
   {
      StudentGUIHandler handler = new StudentGUIHandler(this, controller);
      outputPanel.addActionListener(handler);
      addPanel.addActionListener(handler);
      removePanel.addActionListener(handler);
      selectPanel.addActionListener(handler);
      setVisible(true);
   }

   public String[] getInput()
   {
      if (mode.equals(ADD_MODE))
         return addPanel.getInput();
      else if (mode.equals(REMOVE_MODE))
         return removePanel.getInput();
      else if (mode.equals(SELECT_MODE))
         return selectPanel.getInput();
      return null;
   }

   public void setText(String text)
   {
      outputPanel.setText(text);
   }

   public void setMode(String mode)
   {
      this.mode = mode;
      cardLayout.show(cardPanel, mode);

      switch (mode)
      {
         case ADD_MODE:
            addPanel.clear();
            break;
         case REMOVE_MODE:
            removePanel.clear();
            break;
         case SELECT_MODE:
            selectPanel.clear();
            break;
      }
   }

   public String getMode()
   {
      return mode;
   }

   public void setErrorText(String message)
   {
      switch (mode)
      {
         case ADD_MODE:
            addPanel.setErrorMessage(message);
            break;
         case REMOVE_MODE:
            removePanel.setErrorMessage(message);
            break;
         case SELECT_MODE:
            selectPanel.setErrorMessage(message);
            break;
      }
   }

}
