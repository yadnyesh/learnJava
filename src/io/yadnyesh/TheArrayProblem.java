package io.yadnyesh;

import java.util.Arrays;

public class TheArrayProblem {

	public static void main(String[] args) {
		Product door = new Product("Wooden Door", 35);
		Product floorPanel = new Product("Floor Panel", 25);
		
		//Create
		Product[] products = {door, floorPanel};
		
		//Print
		System.out.println(Arrays.toString(products));

		
	
	}	
	
	
}
