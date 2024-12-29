package application;


import data.Product;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	Stage window;
	TableView<Product> productsTable;
	TextField nameInput, priceInput, quantityInput;
	
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
			
			productsTable = new TableView<Product>(); 
			productsTable.setItems(getProducts());
			productsTable.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
			
			nameInput = new TextField();
			nameInput.setPromptText("name");
			nameInput.minWidth(100);
			
			priceInput = new TextField();
			priceInput.setPromptText("price");
			
			quantityInput = new TextField();
			quantityInput.setPromptText("quantity");
			
			Button addButton = new Button("Add");
			addButton.setOnAction(e -> {
				addButtonAction();
			});
			
			
			Button deleteButton = new Button("Delete");
			deleteButton.setOnAction(e -> {
				deleteButtonAction();
			});
			
			HBox btnLayout = new HBox();
			btnLayout.setPadding(new Insets(10, 20, 10, 20));
			btnLayout.setSpacing(10);
			btnLayout.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);
			
			VBox layout = new VBox(10);
			layout.setPadding(new Insets(10, 10, 10, 10));
			layout.getChildren().addAll(productsTable, btnLayout);
			
			Scene scene = new Scene(layout, 640, 400);
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void deleteButtonAction() {
		ObservableList<Product> productSelected, allProducts;
		allProducts = productsTable.getItems();
		productSelected = productsTable.getSelectionModel().getSelectedItems();
		
		for(Product p : productSelected ) {
			allProducts.remove(p);
		}
		
	}

	private void addButtonAction() {
		Product product = new Product();
		product.setName(nameInput.getText());
		product.setPrice(Double.parseDouble(priceInput.getText()));
		product.setQuantity(Integer.parseInt(quantityInput.getText()));
		productsTable.getItems().add(product);
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
