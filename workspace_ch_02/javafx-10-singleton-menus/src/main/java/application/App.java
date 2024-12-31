package application;


import javafx.application.Application;
import javafx.stage.Stage;
import menus.EditMenu;
import menus.FileMenu;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;


public class App extends Application {
	
	Stage window;
	BorderPane layout;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) { // Stage is the same as document/window in HTML
		try {
			window = primaryStage;
			primaryStage.setTitle("Tasks Manager 10 Singleton Menus");
			
			MenuBar menuBar = new MenuBar();
			menuBar.getMenus().addAll(FileMenu.getInstance(), EditMenu.getInstance());
			
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
