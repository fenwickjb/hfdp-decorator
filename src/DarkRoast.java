/**
 * DarkRoast.java
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
 * DarkRoast class is a concrete Beverage for "StarBuzz".
 *
 * @author Dr. Fenwick
 * @version Summer 2018
 */
public class DarkRoast extends Beverage {

    /** No-arg constructor. */
    public DarkRoast() {
	super("Dark Roast Coffee", 5);
    }
 
    /** Implementing abstract method.
     * @return cost of drink
     */
    public double cost() {
	return .99;
    }
}

