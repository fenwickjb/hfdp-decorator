/**
 * Demo.java
 *
 * This demo is for Summer 2018 offering of CS 3667 for the
 * decorator pattern project.
 *
 * @author Dr. Fenwick
 * @version Summer 2018
 *
 * Textbook and Original Code
 * Copyright © 2009 O’Reilly Media, Inc., Bert Bates and Kathy Sierra
 * Eric Freeman, Elisabeth Robson, Kathy Sierra, and Bert Bates
 * MIT License
 * Derived Work for Academic Purposes
 * Copyright (C) 2018 Jay Fenwick
 */

/**
 * Demo class exercises the various aspects of our application.
 *
 * @author Dr. Fenwick
 * @version Summer 2018
 */
public class Demo {
 
    /**
     * The main method is the program entry point.
     *
     * @param args are the command line arguments
     */
    public static void main(String args[]) {
	Beverage beverage;

	beverage = new Espresso();
	System.out.println(beverage.getDescription() 
			   + " has " + beverage.getCalories() + " calories "
			   + "and costs $" + beverage.cost());
 
	beverage = new DarkRoast();
	System.out.println(beverage.getDescription() 
			   + " has " + beverage.getCalories() + " calories "
			   + "and costs $" + beverage.cost());
 
	beverage = new HouseBlend();
	System.out.println(beverage.getDescription() 
			   + " has " + beverage.getCalories() + " calories "
			   + "and costs $" + beverage.cost());
 
	beverage = new Decaf();
	System.out.println(beverage.getDescription() 
			   + " has " + beverage.getCalories() + " calories "
			   + "and costs $" + beverage.cost());
    }
}
