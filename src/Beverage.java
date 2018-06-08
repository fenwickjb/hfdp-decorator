/**
 * Beverage.java
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
 * Beverage class abstracts the common properties and operations of
 * our "StarBuzz" beverages.
 *
 * @author Dr. Fenwick
 * @version Summer 2018
 */
public abstract class Beverage {
    protected String description;
    protected int numCalories;

    /** Constructor.
     * @param d description
     * @param n numCaloriesnp
     */
    public Beverage(String d, int n) {
	description = d;
	numCalories = n;
    }

    /** No-arg constructor. */
    public Beverage() {
	this("Unknown Beverage", 0);
    }

    /** description field getter method.
     * @return description
     */
    public String getDescription() {
	return description;
    }

    /** abstract method to compute cost. 
     * @return cost
     */
    public abstract double cost();

    /** numCalories field getter method.
     * @return calories
     */
    public int getCalories() {
	return numCalories;
    }
}
