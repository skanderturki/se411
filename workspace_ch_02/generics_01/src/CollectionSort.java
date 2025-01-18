import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
		List<String> list = new ArrayList<String>();
		
		for(String color : colors) {
			list.add(color);
		}
		
		
		System.out.println("ArrayList: ");
		
		for(int count = 0; count < list.size(); count++) {
			// .get is not a Collection method that is why we are using List not Collection
			System.out.printf("%s ", list.get(count));  
		}
		
		Collections.sort(list);
		
		System.out.printf("%n%nArrayList after calling sorting:%n");
		
		for(int count = 0; count < list.size(); count++) {
			System.out.printf("%s ", list.get(count));
		}
		
	}
	

}
