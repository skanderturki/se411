package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmationBox {
	
	public boolean answer;
	
	public boolean display(String title, String message) {
		Stage window = new Stage();
		window.setTitle(title);
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setMinWidth(250);
		
		Label heading = new Label(message);
		
		Button yesButton = new Button("Yes");
		yesButton.setOnAction(e -> {
			answer = true;
			window.close();
		});
		
		Button noButton = new Button("No");
		noButton.setOnAction(e -> {
			answer = false;
			window.close();
		});
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(heading, yesButton, noButton);
		
		layout.setAlignment(Pos.CENTER); // position centered
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		
		window.showAndWait();
		
		return answer;
	}

}
