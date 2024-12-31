package menus;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

/**
 * A singleton file menu
 */
public class FileMenu extends Menu {
	
	private static FileMenu INSTANCE = new FileMenu();	
	
	private FileMenu() {
		super("File");
		this.getItems().add(new MenuItem("New Project..."));
		this.getItems().add(new MenuItem("New File..."));
		this.getItems().add(new MenuItem("Import Project..."));
		this.getItems().add(new SeparatorMenuItem());
		this.getItems().add(new MenuItem("Save"));
		this.getItems().add(new SeparatorMenuItem());
		this.getItems().add(new MenuItem("Exit"));
	}
	
	public static FileMenu getInstance() {
		return INSTANCE;
	}

}
