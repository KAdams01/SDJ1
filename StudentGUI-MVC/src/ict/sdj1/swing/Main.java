package ict.sdj1.swing;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	public static void main(String[] args) {
		StudentModelManager model = new StudentModelManager();
		StudentGUI gui = new StudentGUI();
		StudentController controller = new StudentController(model, gui);
		gui.startGui(controller);
	}
}
