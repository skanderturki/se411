package menus;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class EditMenu extends Menu {
	
	private static EditMenu INSTANCE = new EditMenu();	
	
	private EditMenu() {
		super("_Edit");
		getItems().add(new MenuItem("Find..."));
		getItems().add(new MenuItem("Delete"));
		getItems().add(new MenuItem("_Copy"));
		getItems().add(new MenuItem("_Cut"));
		getItems().add(new MenuItem("_Paste"));
		INSTANCE = this;
	}
	
	public static EditMenu getInstance() {
		return INSTANCE;
	}

}
