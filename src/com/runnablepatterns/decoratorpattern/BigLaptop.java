package com.runnablepatterns.decoratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Big Laptop class to hold specific laptop details
 *
 */
public class BigLaptop extends Laptop {

	/**
	 * Get specific details
	 */
	public String getDescription() {
		System.out.println("[Log] getting big laptop description");
		return "Base Big Laptop";
	}
	
	@Override
	public double getPrice() {
		// return big laptop base price without any specific part
		System.out.println("[Log] getting big laptop base price of $1000");
		return 1000.0;
	}

}
