package linear;

import java.util.ArrayList;
import java.util.Collection;

//package com.monotonic.collections._2_defining_iterating;
//mport linear.Product;

//import com.monotonic.collections.Product;

public class CollectionConcept {
	
	public static void main(String[] args) {
		
	Product door = new Product ("Wood",25);
	Product window = new Product ("Mretal",67);
	
	Collection<Product> products = new ArrayList<Product>();
	products.add(door);
	products.add(window);
	System.out.println(products);
	}

}
