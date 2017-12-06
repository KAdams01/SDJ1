package simpleGUI;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TempConverterController {
	@FXML
	private Label lblTemp;
	@FXML
	private TextField textField1;
	@FXML
	private Button btnToCelsius;
	@FXML
	private Button btnToFahrenheit;
	
	public void initialize() {
		//performs any necessary initialisations
		
	}
	//Event Listeners to the buttons
	private Temperature temperature = new Temperature();
	
	public void convertToCelsius(){

		//With Controller seperate from Model
		JOptionPane.showMessageDialog(null, temperature.fahrenheitToCelsius(Double.parseDouble(textField1.getText())));
		
		//With Controller coding included in Model
//		String tmpString = textField1.getText();
//		double celVal = 5.0/12.0 * (Double.parseDouble(tmpString)-32);
//		tmpString = String.format("%s Fahrenheit = %.2f Celcius", tmpString, celVal);
//		JOptionPane.showMessageDialog(null, tmpString);
		
	}
	public void convertToFahrenheit(){
		//With Controller seperate from Model
		JOptionPane.showMessageDialog(null, temperature.celsiusToFahrenheit(Double.parseDouble(textField1.getText())));
		
		//With Controller coding included in Model
//		String tmpString = textField1.getText();
//		double fahVal = Double.parseDouble(tmpString) * 9.0/5.0 + 32;
//		tmpString = String.format("%s Celcius = %.2f Fahrenheit", tmpString, fahVal);
//		JOptionPane.showMessageDialog(null, tmpString);
	}
}
