package com.runnablepatterns.decoratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Video Card class to be added to a laptop using decorator pattern
 *
 */
public class VideoCard extends PartDecorator {

	/**
	 * Composition variable to be able to decorate laptop parts
	 */
	private Laptop laptop;
	
	/**
	 * Force constructor to receive a Laptop to decorate multiple parts
	 * @param _laptop
	 */
	public VideoCard(Laptop _laptop) {
		this.laptop = _laptop;
	}
	
	@Override
	public String getDescription() {
		// get the inner description plus current one
		System.out.println("[Log] getting inner description and Video Card description");
		return laptop.getDescription() + ", Video Card added";		
	}

	@Override
	public double getPrice() {
		// get the inner prices plus the current price
		System.out.println("[Log] getting inner price and Video Card price $75");
		return 75.0 + laptop.getPrice();
	}

}