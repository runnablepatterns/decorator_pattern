package com.runnablepatterns.decoratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Medium Laptop class to hold specific laptop details
 *
 */
public class MediumLaptop extends Laptop {

	/**
	 * Get specific details
	 */
	public String getDescription() {
		System.out.println("[Log] getting medium laptop description");
		return "Base Medium Laptop";
	}
	
	@Override
	public double getPrice() {
		// return medium laptop base price without any specific part
		System.out.println("[Log] getting medium laptop base price of $800");
		return 800.0;
	}

}
