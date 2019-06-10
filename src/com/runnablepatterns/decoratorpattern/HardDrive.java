package com.runnablepatterns.decoratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Hard Drive class to be added to a laptop using decorator pattern
 *
 */
public class HardDrive extends PartDecorator {

	/**
	 * Composition variable to be able to decorate laptop parts
	 */
	private Laptop laptop;
	
	/**
	 * Force constructor to receive a Laptop to decorate multiple parts
	 * @param _laptop
	 */
	public HardDrive(Laptop _laptop) {
		this.laptop = _laptop;
	}
	
	@Override
	public String getDescription() {
		// get the inner description plus current one
		System.out.println("[Log] getting inner description and Hard Drive description");
		return laptop.getDescription() + ", Hard Drive added";		
	}

	@Override
	public double getPrice() {
		// get the inner prices plus the current price
		System.out.println("[Log] getting inner price and Hard Drive price $100");
		return 100.0 + laptop.getPrice();
	}

}