import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;

public class GenericCollections_01 {

	public static void main(String[] args) {
		String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
		List<String> list = new ArrayList<String>();
		
		for(String color : colors) {
			list.add(color);
		}
		
		String[] removeColors = {"RED", "WHITE", "BLUE"};
		List<String> removeList = new ArrayList<String>();
		
		for(String color : removeColors) {
			removeList.add(color);
		}
		
		System.out.println("ArrayList: ");
		
		for(int count = 0; count < list.size(); count++) {
			// .get is not a Collection method that is why we are using List not Collection
			System.out.printf("%s ", list.get(count));  
		}
		
		removeColors(list, removeList);
		
		System.out.printf("%n%nArrayList after calling removeColors:%n");
		
		for(int count = 0; count < list.size(); count++) {
			System.out.printf("%s ", list.get(count));
		}
		
	}
	
	private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
		Iterator<String> iterator = collection1.iterator();
		
		while(iterator.hasNext()) {
			if(collection2.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}

}
