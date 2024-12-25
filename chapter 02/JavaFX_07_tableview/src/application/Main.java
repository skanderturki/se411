package application;


import data.Product;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
			primaryStage.setTitle("Tasks Manager 07 TableView");
			
			TableColumn<Product, String> nameColumn = new TableColumn<Product, String>("Name");
			nameColumn.setMinWidth(140);
			nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
			
			TableColumn<Product, Double> priceColumn = new TableColumn<Product, Double>("Price");
			priceColumn.setMinWidth(100);
			priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
			
			TableColumn<Product, Integer> quantityColumn = new TableColumn<Product, Integer>("Quantity");
			quantityColumn.setMinWidth(100);
			quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
			
			TableView<Product> productsTable = new TableView<Product>(); 
			productsTable.setItems(getProducts());
			productsTable.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
			
			VBox layout = new VBox(10);
			layout.setPadding(new Insets(20, 20, 20, 20));
			layout.getChildren().addAll(productsTable);
			
			Scene scene = new Scene(layout, 400, 400);
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// get all products
	public ObservableList<Product> getProducts() {
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Laptop", 750, 100));
		products.add(new Product("Chair", 50, 30));
		products.add(new Product("Table", 150, 20));
		products.add(new Product("Screen", 250, 80));
		products.add(new Product("Charger", 15, 1000));
		products.add(new Product("Lamp", 10, 1200));
		return products;
	}

}
