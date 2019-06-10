package com.runnablepatterns.decoratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Small Laptop class to hold specific laptop details
 *
 */
public class SmallLaptop extends Laptop {

	/**
	 * Get specific details
	 */
	public String getDescription() {
		System.out.println("[Log] getting small laptop description");
		return "Base Small Laptop";
	}
	
	@Override
	public double getPrice() {
		// return small laptop base price without any specific part
		System.out.println("[Log] getting small laptop base price of $500");
		return 500.0;
	}

}
