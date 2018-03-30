package edu.handong.csee.java.lab06;

import java.util.Scanner;// import Scanner utility to get input from keyboard

public class BugInfestation {// declare BugInfestation class

	double growth_rate = 0.95, one_bug_volume = 0.002, house_volume = 0;
	int countweeks = 0 ,population = 0;
	
	public void set(double houseVolume, int startPopulation) {
		double house_volume = houseVolume;
		int population = startPopulation;
		bugvol();
	}
	
	public void bugvol(){
		double total_bug_volume = population * one_bug_volume;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startPopulation; // declare left operator
		double houseVolume; // declare right operator
		BugInfestation bug = new BugInfestation(); // to use methods declared in Calculator class
		
		Scanner keyboard = new Scanner(System.in); // to get user input
		
		System.out.print("Enter house volume: "); // tells the user to input house volume
		houseVolume = keyboard.nextDouble(); // get the user input as houseVolume
		
		System.out.print("Enter Starting Roach number: "); // tells the user to input roach number
		startPopulation = keyboard.nextInt(); // get the user input of roaches as startPopulation
		
		bug.set(houseVolume,startPopulation); // set values of house_volume and population from user input
		
	}

}
