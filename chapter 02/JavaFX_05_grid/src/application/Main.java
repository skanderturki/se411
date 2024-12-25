package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
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
			
			GridPane grid = new GridPane();  // a grid of cells
			grid.setPadding(new Insets(10, 15, 10, 15)); // Insets are measures in the 4 directions
			grid.setVgap(8); // vertical spacing of cells
			grid.setHgap(10); // horizontal spacing of cells
			
			Label nameLabel = new Label("Username:");
			grid.setConstraints(nameLabel, 0, 0);
			
			TextField inputName = new TextField();
			inputName.setPromptText("username");
			grid.setConstraints(inputName, 1, 0);
			
			Label pwdLabel = new Label("Password:");
			grid.setConstraints(pwdLabel, 0, 1);
			
			TextField inputPwd = new TextField();
			inputPwd.setPromptText("password");
			grid.setConstraints(inputPwd, 1, 1);
			
			Button loginButton = new Button("Login");
			grid.setConstraints(loginButton, 1, 2);
			
			grid.getChildren().addAll(nameLabel, inputName, pwdLabel, inputPwd, loginButton);
			
			Scene scene = new Scene(grid, 400, 400);
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
