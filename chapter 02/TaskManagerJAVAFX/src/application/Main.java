package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	Stage window;
	Scene sceneMain, sceneDetails;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) { // Stage is the same as document/window in HTML
		try {
			window = primaryStage;
			primaryStage.setTitle("Tasks Manager");
			
			VBox layoutMain = new VBox(20);  // equivalent to a flex column
			VBox layoutDetails = new VBox(20);
			
			sceneMain = new Scene(layoutMain,400,400);  // Scene is the same as body in HTML
			sceneDetails = new Scene(layoutDetails,400,400);  // Scene is the same as body in HTML
			
			// Create a label and a navigation button, then add it to the layout of the Main Scene
			Label headingSceneMain = new Label("Welcome to your Tasks Manager board:");
			Button btnGoSceneDetails = new Button("Get more details");
			btnGoSceneDetails.setOnAction(e -> window.setScene(sceneDetails));
			layoutMain.getChildren().addAll(headingSceneMain, btnGoSceneDetails);
			
			// Create a label and a navigation button, then add it to the layout of the Details Scene
			Label headingSceneDetails = new Label("More details:");
			Button btnGoSceneMain = new Button("Go back to the Tasks Manager board");
			btnGoSceneMain.setOnAction(e -> window.setScene(sceneMain));
			layoutDetails.getChildren().addAll(headingSceneDetails, btnGoSceneMain);
			
			primaryStage.setScene(sceneMain);
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
