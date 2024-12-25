package application;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	Stage window;
	BorderPane layout;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) { // Stage is the same as document/window in HTML
		try {
			window = primaryStage;
			primaryStage.setTitle("Tasks Manager 09 Menus");
			
			// File menu
			Menu fileMenu = new Menu("File");
			fileMenu.getItems().add(new MenuItem("New Project..."));
			fileMenu.getItems().add(new MenuItem("New File..."));
			fileMenu.getItems().add(new MenuItem("Import Project..."));
			fileMenu.getItems().add(new SeparatorMenuItem());
			fileMenu.getItems().add(new MenuItem("Save"));
			fileMenu.getItems().add(new SeparatorMenuItem());
			fileMenu.getItems().add(new MenuItem("Exit"));

			// Edit menu
			Menu editMenu = new Menu("Edit");
			editMenu.getItems().add(new MenuItem("Find..."));
			editMenu.getItems().add(new MenuItem("Delete"));
			editMenu.getItems().add(new MenuItem("Copy"));
			
			MenuBar menuBar = new MenuBar();
			menuBar.getMenus().addAll(fileMenu, editMenu);
			
			layout = new BorderPane();
			layout.setTop(menuBar);
			Scene scene = new Scene(layout, 640, 400);
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
