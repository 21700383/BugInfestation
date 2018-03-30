package edu.handong.csee.java.lab06;

import java.util.Scanner;// import Scanner utility to get input from keyboard

public class BugInfestation {// declare BugInfestation class

	double growth_rate = 0.95, one_bug_volume = 0.002, house_volume = 0, total_bug_volume = 0; // declaring and initializing values
	int countweeks = 0 ,population = 0; // declaring and initializing values
	
	public void set(double houseVolume, int startPopulation) {
		house_volume = houseVolume; // put data of houseVolume into house_volume
		population = startPopulation; // put data of startPopulation into population
		bugvol(); // initialize bug volume
	}
	
	public void bugvol(){ // declare bug volume method
		total_bug_volume = population * one_bug_volume; // total bug volume = number of roaches x volume of a roach
	}
	
	public void roachfill() {
		double newBugs = 0; // declare newBugs as double
		double newBugVolume = 0; // declare newBugVolume as double
		System.out.println("Starting with a roach population of "+ population + 
				" and a house with a volume of " + house_volume + 
				".\n"); // give message about the starting values for roach number and house volume
		while (total_bug_volume < house_volume) { // while the house's volume is bigger than the total bug volume. volume of roaches can't go beyond volume of the house
			newBugs = population * growth_rate; // increase in number of bugs
			newBugVolume = newBugs * one_bug_volume; // increase in bug volume
			population = (int) (population + newBugs); // total number of bugs after the increase
			total_bug_volume = total_bug_volume + newBugVolume; // total volume of bugs after the increase
			countweeks++; // the number of weeks the roaches multiply increase by 1
		}
		System.out.println("After " + countweeks + " weeks, \nthe house will be filled with " 
				+ population + " roacheses.\nThey will a volume of " + total_bug_volume + " cubic feet.\n"
						+ "Better call the Bug Busters"); // give message about what will happen to the number and volume of roaches when they are done duplicating
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startPopulation; // declare startpopulation
		double houseVolume; // declare housevolume
		BugInfestation bug = new BugInfestation(); // to use methods declared in BugInfestation class
		
		Scanner keyboard = new Scanner(System.in); // to get user input
		
		System.out.print("Enter house volume: "); // tells the user to input house volume
		houseVolume = keyboard.nextDouble(); // get the user input as houseVolume
		
		System.out.print("Enter Starting Roach number: "); // tells the user to input roach number
		startPopulation = keyboard.nextInt(); // get the user input of roaches as startPopulation
		
		bug.set(houseVolume,startPopulation); // set values of house_volume and population from user input
		bug.roachfill(); // do a run for the number of weeks the roaches increase, number and volume of rooaches in the end
	}

}
