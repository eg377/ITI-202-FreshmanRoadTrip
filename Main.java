import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main extends bar{

	static double startGPA = 3.0;
	static int startHealth = 75;

	public static void waitHere(int seconds){
		try{
			Thread.sleep(seconds*1000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public static void welcomePlayer(){
		// ignore code that is commented out for now
		
		// Start of the game

		//boolean returnBol = false;

		boolean welcome = true;
		boolean q1Loop = true;
		Scanner in = new Scanner(System.in);

		while(welcome){
			waitHere(1);
			System.out.println("\nWelcome to The Freshmen Bus Trip!\n");
			waitHere(2);
			while(q1Loop){
				System.out.println("Are you ready to start your day at Rutgers University? y or n\n");
				String q1 = in.nextLine(); 
				//	Making sure q1 is lower case, in case user types Y or YES
				q1 = q1.toLowerCase();
				//System.out.println(q1);
				
				if(q1.equals("y") || q1.equals("yes")){
					q1Loop = false; // end the loop once we get the response we want
				}else{
					System.out.println("Let me ask again.\n");
				}
			}

			// Continue story 
			// Introduction of objective
			waitHere(1);
			
			System.out.println("===========================================================================================================================================");
			
			System.out.println("\nAs a Rutgers students you need to need to maintain your energy level"+
				" above 25%"+
				" and GPA above a 2.0, otherwise you will have to meet with the DEAN!");

			waitHere(6);
			System.out.println("\nAs you wake up in your dorm room to start the day you'll begin with a "+
				startGPA+" GPA and "+startHealth+"% of your energy.");

			// First display of the bars
			waitHere(2);
			printEnergyBar(startHealth);
			waitHere(2);
			printGPABar(startGPA);
			
			System.out.println();
			Main.waitHere(1);
			System.out.println("Don't forget to check your backpack with the 'b' key before you leave for class!");
			
			welcome = false;
			
		}

		//returnBol = true;
		//return returnBol;
	}

	// Next phase in the story can be coded here
	/*
	public static void storyArc1(){
		
	}
	*/

	public static void main(String[] args){
		//GAME STARTS HERE...
		welcomePlayer();
		Backpack.printBackpack();
		Backpack.useItem();
	}
}