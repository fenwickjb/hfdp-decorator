/**
 * Decaf.java
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
 * Decaf class is a concrete Beverage for "StarBuzz".
 *
 * @author Dr. Fenwick
 * @version Summer 2018
 */
public class Decaf extends Beverage {

    /** No-arg constructor. */
    public Decaf() {
	super("Decaf Coffee", 5);
    }

    /** Abstract method implementation.
     * @return cost of drink
     */
    public double cost() {
	return 1.05;
    }
}
