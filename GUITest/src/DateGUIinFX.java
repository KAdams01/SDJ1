
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DateGUIinFX extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label label1 = new Label("Date: ");
		Label labelDay = new Label("Day: ");
		Label labelMonth = new Label("Month: ");
		Label labelYear = new Label("Year: ");
		TextField tfDay = new TextField("");
		TextField tfMonth = new TextField("");
		TextField tfYear = new TextField("");
		Button button1 = new Button("Show");
		button1.setMinHeight(95);
		
		
		VBox labels = new VBox(labelDay, labelMonth, labelYear);
		labels.setAlignment(Pos.CENTER_LEFT);
		labelMonth.setPadding(new Insets(10,0,0,0));
		labelYear.setPadding(new Insets(10,0,0,0));
		VBox textfields = new VBox(tfDay, tfMonth, tfYear);
		textfields.setMaxWidth(300);
		textfields.setAlignment(Pos.CENTER);
		VBox button = new VBox(button1);
		button.setAlignment(Pos.CENTER_RIGHT);
		VBox date = new VBox(label1);
		HBox mainContent = new HBox(labels, textfields, button);
		mainContent.setAlignment(Pos.CENTER);
		
		VBox fullPage = new VBox(date, mainContent);	
		fullPage.setSpacing(10);
		Scene scene = new Scene(fullPage, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
