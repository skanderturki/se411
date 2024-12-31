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
		getItems().add(new MenuItem("New Project..."));
		getItems().add(new MenuItem("New File..."));
		getItems().add(new MenuItem("Import Project..."));
		getItems().add(new SeparatorMenuItem());
		getItems().add(new MenuItem("Save"));
		getItems().add(new SeparatorMenuItem());

		getItems().add(createExitMenuITem());
	}
	
	private MenuItem createExitMenuITem() {
		MenuItem exitMenuItem = new MenuItem("Exit");
		exitMenuItem.setOnAction(e -> System.out.println("Exit action called...."));
		return exitMenuItem;
	}

	public static FileMenu getInstance() {
		return INSTANCE;
	}

}
