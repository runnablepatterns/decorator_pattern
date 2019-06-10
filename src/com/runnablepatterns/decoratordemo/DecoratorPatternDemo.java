package com.runnablepatterns.decoratordemo;

import com.runnablepatterns.decoratorpattern.HardDrive;
import com.runnablepatterns.decoratorpattern.Laptop;
import com.runnablepatterns.decoratorpattern.RAM;
import com.runnablepatterns.decoratorpattern.SmallLaptop;
import com.runnablepatterns.decoratorpattern.VideoCard;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Demo class to demonstrate Decorator Pattern usage
 *
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// create concrete class
		Laptop smallLaptop = new SmallLaptop();
		
		// print first details
		System.out.println("Created Small Laptop");
		System.out.println(String.format("Description: %s, Price: $%s", smallLaptop.getDescription(), 
				smallLaptop.getPrice()));
		
		// decorate small laptop
		smallLaptop = new RAM(smallLaptop);
		smallLaptop = new VideoCard(smallLaptop);
		smallLaptop = new HardDrive(smallLaptop);
		
		System.out.println("Created Small Laptop with more parts:");
		System.out.println(String.format("Description: %s, Price: $%s", smallLaptop.getDescription(), 
				smallLaptop.getPrice()));
	}

}
