package testEventGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import simpleGUI.TempConverterController;

public class VIACenterEventsM extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		//invoke fxml loader
		FXMLLoader load = new FXMLLoader();
		// set controller
		load.setController(new VIACenterEvents());
		//set location of the FXML doc
		load.setLocation(getClass().getResource("event.fxml"));
		Parent root = load.load();
		//Build the scene
		Scene scene = new Scene(root);
		//show the window of the scene graph
		stage.setTitle("VIA Center Events");
		stage.setScene(scene);
		stage.show();
		
	}

}
