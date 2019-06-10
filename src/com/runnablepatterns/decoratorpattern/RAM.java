package com.runnablepatterns.decoratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * RAM class to be added to a laptop using decorator pattern
 *
 */
public class RAM extends PartDecorator {

	/**
	 * Composition variable to be able to decorate laptop parts
	 */
	private Laptop laptop;
	
	/**
	 * Force constructor to receive a Laptop to decorate multiple parts
	 * @param _laptop
	 */
	public RAM(Laptop _laptop) {
		this.laptop = _laptop;
	}
	
	@Override
	public String getDescription() {
		// get the inner description plus current one
		System.out.println("[Log] getting inner description and RAM description");
		return laptop.getDescription() + ", RAM memory added";		
	}

	@Override
	public double getPrice() {
		// get the inner prices plus the current price
		System.out.println("[Log] getting inner price and RAM price $50");
		return 50.0 + laptop.getPrice();
	}

}