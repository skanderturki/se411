package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
	
	public void display(String title, String message) {
		Stage window = new Stage();
		window.setTitle(title);
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setMinWidth(250);
		
		Label heading = new Label(message);
		Button closeButton = new Button("Close");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(heading, closeButton);
		
		layout.setAlignment(Pos.CENTER); // position centered
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		
		window.showAndWait();
	}

}
