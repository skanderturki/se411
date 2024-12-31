package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class App extends Application {
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) { // Stage is the same as document/window in HTML
		try {
			window = primaryStage;
			primaryStage.setTitle("Tasks Manager 03");
			
			HBox topMenu = new HBox();
			Button buttonA = new Button("File");
			Button buttonB = new Button("Edit");
			Button buttonC = new Button("Help");
			topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
			
			VBox leftMenu = new VBox();
			Button buttonX = new Button("Create");
			Button buttonY = new Button("Update");
			Button buttonZ = new Button("Delete");
			leftMenu.getChildren().addAll(buttonX, buttonY, buttonZ);
			
			BorderPane borderPane = new BorderPane();
			borderPane.setTop(topMenu);
			borderPane.setLeft(leftMenu);
			
			Scene scene = new Scene(borderPane, 400, 400);
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
