package edu.psu.se411;

import java.util.Arrays;
import java.util.List;

public class PrintList<T> {

    private List<T> myitems;
    
    public PrintList(T[] items) {
    	myitems = Arrays.asList(items);
    }

	public List<T> getMyitems() {
		return myitems;
	}
	
    public void printList() {
        for (T e : myitems) {
            System.out.println(e);
        }
    }

}
