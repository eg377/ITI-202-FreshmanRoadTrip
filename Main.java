import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main{

	static double startGPA = 3.0;
	static int startHealth = 75;

	public static void printEnergyBar(int currentPercentile){
		//	Since the energy bar value can be anything from 0-100, divide the number 
		//	by 2 so bar is not too larger, bc we use barCurrentPercentile to 
		//	determine how many dashes to print for the bar
		int barCurrentPercentile = currentPercentile/2; // 0-50
		
		System.out.print("\nEnergy Bar: \n");

		//	Top part of the bar
		for(int i = 0; i < barCurrentPercentile; i++){
			System.out.print("-");
		}
		System.out.println();

		//	Center of the bar
		System.out.print("|");
		for(int i = 0; i < barCurrentPercentile-1; i++){
			System.out.print(" ");
		}
		System.out.print("|");

		// 	Bottom of the bar
		System.out.println();
		for(int i = 0; i < barCurrentPercentile; i++){
			System.out.print("-");
		}

		// Prints the value below and at the end of the bar 
		System.out.println();
		for(int i = 0; i < barCurrentPercentile-1; i++){
			System.out.print(" ");
		}
		System.out.println(currentPercentile+"%");
	}

	public static void printGPABar(double currentGPA){
		//	Since the GPA value value can be anything from 0-4, multiply the number 
		//	by 12.5 so bar is not too short.
		// 	Reason for 12.5 bc 50/4 = 12.5
		//	And 50 is the max value to we have reasonably sized bar for GPA, just like energy
		// 	where the value is divided by 2 from the max possible of 100
		double barCurrentGPAvalue = currentGPA*12.5; //0-50
		
		System.out.print("\nGPA Bar: \n");

		//	Top part of the bar
		for(int i = 0; i < barCurrentGPAvalue; i++){
			System.out.print("-");
		}
		System.out.println();

		//	Center of the bar
		System.out.print("|");
		for(int i = 0; i < barCurrentGPAvalue-1; i++){
			System.out.print(" ");
		}
		System.out.print("|");

		// 	Bottom of the bar
		System.out.println();
		for(int i = 0; i < barCurrentGPAvalue; i++){
			System.out.print("-");
		}

		// Prints the value below and at the end of the bar 
		System.out.println();
		for(int i = 0; i < barCurrentGPAvalue-1; i++){
			System.out.print(" ");
		}
		System.out.println(currentGPA+" GPA");
	}
	
	public static void waitHere(int seconds){
		try {
            	Thread.sleep(seconds*1000);
        	} catch (InterruptedException e) {
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
			System.out.println("\nWelcome to The Freshmen Bus Roadtrip!\n");
			waitHere(2);
			while(q1Loop){
				System.out.println("Are you ready to start your day at Rutgers University? y or n\n");
				String q1 = in.nextLine(); 
				//	Making sure q1 is lower case, in case user types Y or YES
				q1 = q1.toLowerCase();
				//System.out.println(q1);
				
				if(q1.equals("y") || q1.equals("yes")){
					q1Loop = false; // end the loop once we get the respone we want
				}else{
					System.out.println("Let me ask again.\n");
				}
			}

			// Continue story 
			// Introduction of objective
			waitHere(1);
			System.out.println("\nAs a Rutgers students you need to need to maintain your energy level"+
				" above 25%"+
				" and GPA above a 2.0, otherwise you will have to meet with the DEAN!");

			waitHere(6);
			System.out.println("\nAs you wake up in your dorm room to start the day you'll begin with a "+
				startGPA+" GPA and "+startHealth+"% of your energy.");

			// First display of the bars
			waitHere(4);
			printEnergyBar(startHealth);
			waitHere(2);
			printGPABar(startGPA);
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
		boolean playing = true;

		welcomePlayer();
		//----------- ignore stuff below ----------------
		/*
		//System.out.println("Here");
	
		//Random rand = new Random();


		String[] bookbag = {};
		String[] items = {"Powerbar", "apple", "banana", "textbook", "notebook", "pencil", "pen"};

		

		//GAME:
		//while(playing){}
		*/
	}
}