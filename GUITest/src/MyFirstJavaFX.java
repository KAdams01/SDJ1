
import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.stage.Stage;

public class MyFirstJavaFX extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button btnHello = new Button("DO NOT CLICK");
		btnHello.setStyle("-fx-background-color:red; -fx-font:20px arial; -fx-font-weight:bold");
		Scene scene = new Scene(btnHello, 300, 300);
		btnHello.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Task<Void> task = new Task<Void>() {

					@Override
					protected Void call() throws Exception {
						for (int i = 0; i < 25; i++) {
							Thread.sleep(50);
							int randomNum = ThreadLocalRandom.current().nextInt(0, 1560);
							int randomNum2 = ThreadLocalRandom.current().nextInt(0, 980);
							primaryStage.setX(randomNum);
							primaryStage.setY(randomNum2);
						
					}
						return null;
				}
					

//					Alert alert = new Alert(AlertType.ERROR);
//					alert.setX(randomNum);
//					alert.setY(randomNum2);
//					alert.setTitle("WARNING!");
//					alert.setHeaderText(null);
//					alert.setContentText("Pos: " + randomNum + " " + randomNum2);
//					alert.show();

				};
				new Thread(task).start();
			}
		});
		
		primaryStage.setTitle("My First JavaFX App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
