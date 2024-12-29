package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
			primaryStage.setTitle("Tasks Manager 03");
			window.setOnCloseRequest(e -> {
				boolean result = new ConfirmationBox().display("Are you sure you want to close?", "Please confirm!");
				if(result) {
					window.close();
				} else {
					e.consume();   // stops further propagation of event
				}
			});
			
			VBox layoutMain = new VBox(20);  // equivalent to a flex column
			
			sceneMain = new Scene(layoutMain,400,400);  // Scene is the same as body in HTML
			
			// Create a label and a navigation button, then add it to the layout of the Main Scene
			Label headingSceneMain = new Label("Welcome to your Tasks Manager board:");
			Button btnConfirm = new Button("Save");
			btnConfirm.setOnAction(e -> {
				boolean result = new ConfirmationBox().display("Are you sure?", "Please confirm!");
				System.out.println(result);
			});
			layoutMain.getChildren().addAll(headingSceneMain, btnConfirm);
			
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
