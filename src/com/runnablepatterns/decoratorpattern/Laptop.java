package com.runnablepatterns.decoratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Laptop abstract class to hold laptop details 
 *
 */
public abstract class Laptop {
	
	/**
	 * Variable to store the description details
	 */
	private String description = "No details available.";

	/**
	 * Get the description details
	 * @return Laptop description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Get the total laptop price with all it's parts
	 * @return Laptop total price 
	 */
	public abstract double getPrice();
}
