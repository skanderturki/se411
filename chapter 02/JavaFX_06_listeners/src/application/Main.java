package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) { // Stage is the same as document/window in HTML
		try {
			window = primaryStage;
			primaryStage.setTitle("Tasks Manager 05 Grid");
			
			Button btnSave = new Button("Save");
			
			Label choiceLabel = new Label("Country:");
			
			ComboBox<String> comboBox = new ComboBox<String>();
			comboBox.getItems().addAll("KSA", "Oman", "Kuwait", "Jordan");
			comboBox.setPromptText("country");
			comboBox.setEditable(true);
			
			comboBox.setOnAction(e -> {
				System.out.println(comboBox.getValue());
			});

			VBox layout = new VBox(10);
			layout.setPadding(new Insets(20, 20, 20, 20));
			layout.getChildren().addAll(choiceLabel, comboBox, btnSave);
			
			Scene scene = new Scene(layout, 400, 400);
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
