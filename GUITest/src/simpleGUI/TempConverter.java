package simpleGUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class TempConverter extends Application{



	@Override
	public void start(Stage stage) throws Exception {
		//invoke fxml loader
		FXMLLoader load = new FXMLLoader();
		// set controller
		load.setController(new TempConverterController());
		//set location of the FXML doc
		load.setLocation(getClass().getResource("TempConverterView.fxml"));
		Parent root = load.load();
		//Build the scene
		Scene scene = new Scene(root);
		//show the window of the scene graph
		stage.setTitle("JavaFX Temperature Converter");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
