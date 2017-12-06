package testEventGUI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VIACenterEvents {
	@FXML
	private TextField nameTF;
	@FXML
	private TextField dateTF;
	@FXML
	private TextField timeTF;
	@FXML
	private TextField placeTF;
	@FXML
	private Button submit;

	public void fullString() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String newDate = null;
		try {
			Date date = df.parse(dateTF.getText());
			newDate = df.format(date);
			String fullInfo = (nameTF.getText() + "\n" +  newDate + "\n" +  timeTF.getText() + "\n" + placeTF.getText());
//			String[] tfArray = {nameTF.getText(), newDate, timeTF.getText(), placeTF.getText()};
			JOptionPane.showMessageDialog(null, fullInfo);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Invalid Date Entered");
		}

	}

}
