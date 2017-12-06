package lecturerTest;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LecturerController {
	@FXML
	private TextField name;
	@FXML
	private TextField email;
	@FXML
	private TextField subject;
	@FXML
	private TextField salary;
	@FXML
	private TextField searchBySubject;
	@FXML
	private Button addButton;
	@FXML
	private Button searchButton;
	
	LecturerModel lecMod = new LecturerModel("","","",0);
	
	public void initialize() {
		//performs any necessary initialisations
		
	}
	
	public void addLect() {
		double sal = Double.parseDouble(salary.getText());
		LecturerModel lect1 = new LecturerModel(name.getText(), email.getText(), subject.getText(), sal);
		lecMod.addLecturer(lect1);
		
	}
	public void searchLect() {
		String search = searchBySubject.getText();
		JOptionPane.showMessageDialog(null, lecMod.findBySubject(search));
	}
}
