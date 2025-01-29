package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("How much money are you starting with?");
		int startAmount1 = in.nextInt();
		System.out.println("What is the win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is the win limit?");
		int winLimit = in.nextInt();
		System.out.println("How many total simulations?");
		int totalSimulations = in.nextInt();
		
		
		while (totalSimulations > 0) {
			
		int startAmount = startAmount1;	

		while (startAmount <= winLimit && startAmount > 0) {
			double chance = Math.random();
			System.out.println("Random chance: " + chance);
			if (chance >= winChance) {
				startAmount++;
				System.out.println("WIN");
			} else {
				startAmount--;
				System.out.println("LOSE");
			} totalSimulations--;
			
			System.out.println("Total simulations " + totalSimulations);
	}	
		}
}
}
