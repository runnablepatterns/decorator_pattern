package com.runnablepatterns.decoratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Part Decorator class to hold all additional laptop parts
 *
 */
public abstract class PartDecorator extends Laptop {

	/**
	 * Get specific details. This is abstract to force all parts to add the description
	 */
	public abstract String getDescription();

}