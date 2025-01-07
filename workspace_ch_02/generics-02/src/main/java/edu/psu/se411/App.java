package edu.psu.se411;

public class App {

	public static void main(String[] args) {
		System.out.println("App started...");
		
		String[] arr = {"Riyadh", "Jeddah", "Dammam", "Jizan"};
		PrintList<String> list = new PrintList(arr);
		
		list.printList();  // Test with String
	}

}
