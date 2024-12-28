import java.util.ArrayList;
import java.util.List;

public class WildCards {

	public static void main(String[] args) {
		List<CancelButton> cancelList = new ArrayList();
		styleItems(cancelList);

		List<Dialog> dialogList = new ArrayList();
		styleItems(dialogList);
	}

	class Button{};
	class CancelButton extends Button{};
	
	class Dialog{};
	
	private static void styleItems(List<? extends Button> myList) {
		System.out.println("styling all elements of the list....");
	}
	
}
