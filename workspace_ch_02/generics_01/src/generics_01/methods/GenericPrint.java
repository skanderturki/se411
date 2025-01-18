package generics_01.methods;

public class GenericPrint {

	public static void main(String[] args) {
		Integer[] integerArray = {1, 2, 3, 4};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] characterArray = {'H', 'Y', 'K', 'U'};
		
		System.out.printf("Array integerArray contains: ");
		printArray(integerArray);
		
		System.out.printf("Array doubleArray contains: ");
		printArray(doubleArray);
		
		System.out.printf("Array characterArray contains: ");
		printArray(characterArray);
	}
	
	public static <T> void printArray(T[] inputArray) {
		for(T element: inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

}
