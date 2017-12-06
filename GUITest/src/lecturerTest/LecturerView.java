package lecturerTest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LecturerView extends Application {

	public void start(Stage stage) throws Exception {
		//invoke fxml loader
		FXMLLoader load = new FXMLLoader();
		// set controller
		load.setController(new LecturerController());
		//set location of the FXML doc
		load.setLocation(getClass().getResource("LecturerView.fxml"));
		Parent root = load.load();
		//Build the scene
		Scene scene = new Scene(root);
		//show the window of the scene graph
		stage.setTitle("Lecturer");
		stage.setScene(scene);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
