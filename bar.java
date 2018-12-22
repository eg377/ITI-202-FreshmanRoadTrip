import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class bar { 

	static double startGPA = 3.0;
	static int startHealth = 75;
	static String currentLocation = "Livingston";
	static String currentStop = "Quads";

	public static void map(){
		System.out.println(
			"=================== Freshman RoadTrip Map ==================="+
			"\n       _________            ______________"+
			"\n       | Busch |------------| Livingston |\tCurrent Location:"+
			"\n       ---------            --------------\t   ---> "+currentLocation+
			"\n             \\               /        \\\t\tCurrent Stop:"+
			"\n              \\             /          \\\t   ---> "+currentStop+
			"\n               \\           /            \\"+
			"\n                \\         /              \\"+
			"\n            _______________        _________________"+
			"\n            | College Ave |--------| Cook/Douglass |" +
			"\n            ---------------        -----------------"+
			"\n      "+
			"\nKey:\t --- \t\t= bus route"+
			"\n\t rectangle \t= bus stop"+
			"\n"+
			"\nStops:\tBusch:\t\tWerblin Gym\tHill Center\t\tBusch Student Center"+
			"\n\tCollege Ave:\tStudent Center\tAlexander Library\tBrower Dining Hall"+
			"\n\tLivingston:\tPlaza\t\tBusiness Building\tQuads "+
			"\n\tCook/Douglas:\tPassion Puddle\tDouglass Student Center"+
			"\n\t"+
			"\n============================================================"
			);
	}

	public static void storyArc1(){
		System.out.println("\nYou are located in your dormroom which is on Livingston campus.");
		waitHere(2);
		nextMenu();
		map();
		nextMenu();
		System.out.println("\nCongrats! You now have a map.");
		//nextMenu();
	}
	
	public static void randomItem() {
		
		/* -----------  ALL AVAILABLE ITEMS HERE ----------- */ 
		EnergyItem powerbar = new EnergyItem("powerbar", 10, "Your energy increased a little...");
		EnergyItem apple = new EnergyItem("apple", 15, "Your energy increased a lot!");
		EnergyItem banana = new EnergyItem("banana", 15, "Your energy increased a lot!");
		EnergyItem coffee = new EnergyItem("coffee", 20, "You got a huge energy boost!");
		GpaItem textbook = new GpaItem("textbook", 0.4, "Your GPA increased a lot!");
		GpaItem pencil = new GpaItem("pencil", 0.1, "Your GPA increased a little...");
		GpaItem notebook = new GpaItem("notebook", 0.2, "Your GPA increased a little...");
		GpaItem calculator = new GpaItem("calculator", 0.3, "Your GPA increased a little...");
	
		
		BackpackItem[] availableItems = new BackpackItem[]{powerbar, apple, banana, coffee, textbook, pencil, notebook, calculator, null, null}; // 2/10 chance of not finding an item

		Random random = new Random();
		int randomInt = random.nextInt((9 - 0) + 1); // Generates a random integer between 0 and 9 inclusive
		
		if (availableItems[randomInt] != null) {
		
			System.out.println("\nYou found an item: " + availableItems[randomInt]); // picks a random item from the list of available items
			Backpack.addItem(availableItems[randomInt]); // automatically adds a random item to the backpack
		} 
	}
	
	public static void storyArc2() {
		// Add story elements here...
		// Start off in the dorm on livingston (quad 1 bus stop)
		System.out.println("\nYou decide to head outside to the Quad 1 bus stop. You want to get to Livingston Dining Hall.");
		
		// Walks to Livingston Dining hall
		randomItem();
	
		// Goes to Plaza bus stop 
		randomItem();
		
		// Gets of at college ave students center
		randomItem();
		
		// Goes to alex library to study 
		randomItem();
		
		// Then grabs a quick dinner at brower because he is running late to class on Busch
		randomItem();
		
		// Gets of at the Hill center stop and goes to class
		randomItem();
		
		// Then decides to go to the Werblin gym
		randomItem();
		
		// Then catches the bus at the Busch student center
		randomItem();
		
		// On his way to douglass student center to meet with a professor 
		randomItem();
		
		// Eats from snack from his backpack, while he's hanging out with a friend at passion puddle 
		randomItem();
		
		// Then he head back to Plaza Bus Stop, to go home
		randomItem();

	}

	public static void nextMenu(){
		boolean loopNextMenu = true;
		Scanner in = new Scanner(System.in);
		System.out.println("[c] to continue");
		while(loopNextMenu){
			String q1 = in.nextLine();
			if(q1.equals("c")){
				loopNextMenu = false;
			}
		} 
	}

	public static void waitHere(int seconds){
		try{
			Thread.sleep(seconds*1000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public static void printMenu(){
		System.out.println("\n==================== MENU =====================");

		System.out.print("1. Type 'b' or 'bar' to see your energy and GPA bar.\n"+
			"2. Type 'bp' or 'backpack' to open your bag.\n"+
			"3. Type 'e' or 'exit' to close menu.\n");


		System.out.println(" ");
	}

	public static void printMenu2(){
		//Added map
		System.out.println("\n==================== MENU =====================");

		System.out.print("1. Type 'b' or 'bar' to see your energy and GPA bar.\n"+
			"2. Type 'bp' or 'backpack' to open your bag.\n"+
			"3. Type 'm' or 'map' to open your map.\n"+
			"4. Type 'e' or 'exit' to close menu.\n");


		System.out.println(" ");
	}

	public static void continuePlayer(){
		Scanner in = new Scanner(System.in);
		boolean loopContinuePlayer = true;
		boolean loopContinuePlayer2 = true;
		printMenu();
		while(loopContinuePlayer){
			String q1 = in.nextLine(); 
			if(q1.equals("b") || q1.equals("bar") || q1.equals("Bar")){
				printEnergyBar(Backpack.currentHealth);
				printGPABar(Backpack.currentGPA);
				waitHere(1);
				if(loopContinuePlayer2 == false){
					loopContinuePlayer = false; // end the loop once we get the response we want
				}else{
					printMenu();
				}
			}else if(q1.equals("bp") || q1.equals("backpack") || q1.equals("Backpack")){
				Backpack.printBackpack();
				waitHere(1);
				if(loopContinuePlayer2 == false){
					loopContinuePlayer = false; // end the loop once we get the response we want
				}else{
					printMenu();
				}
			}else if(q1.equals("e") || q1.equals("exit") || q1.equals("E")){
				loopContinuePlayer2 = false;
				loopContinuePlayer = false;
			}else{
				printMenu();
			}
		}
	}

	public static void continuePlayer2(){
		//Only difference here is that we add the map to the menu
		Scanner in = new Scanner(System.in);
		boolean loopContinuePlayer = true;
		boolean loopContinuePlayer2 = true;
		printMenu2();
		while(loopContinuePlayer){
			String q1 = in.nextLine(); 
			if(q1.equals("b") || q1.equals("bar") || q1.equals("Bar")){
				printEnergyBar(Backpack.currentHealth);
				printGPABar(Backpack.currentGPA);
				waitHere(1);
				if(loopContinuePlayer2 == false){
					loopContinuePlayer = false; // end the loop once we get the response we want
				}else{
					printMenu();
				}
			}else if(q1.equals("bp") || q1.equals("backpack") || q1.equals("Backpack")){
				Backpack.printBackpack();
				waitHere(1);
				if(loopContinuePlayer2 == false){
					loopContinuePlayer = false; // end the loop once we get the response we want
				}else{
					printMenu();
				}
			}else if(q1.equals("m") || q1.equals("map") || q1.equals("Map")){
				map();
				waitHere(1);
				if(loopContinuePlayer2 == false){
					loopContinuePlayer = false; // end the loop once we get the response we want
				}else{
					printMenu();
				}
			}else if(q1.equals("e") || q1.equals("exit") || q1.equals("E")){
				loopContinuePlayer2 = false;
				loopContinuePlayer = false;
			}else{
				printMenu();
			}
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
			waitHere(1);
			nextMenu();

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
			System.out.println("===================================================="+
				"=======================================================================================");
			System.out.println("\nAs a Rutgers students you need to need to maintain your energy level"+
				" above 25%"+
				" and GPA above a 2.0, otherwise you will have to meet with the DEAN!");
			waitHere(2);
			nextMenu();

			System.out.println("\nYour goal is to make it to 3 classes with the largest amount of energy and maximum GPA.");
			waitHere(2);
			nextMenu();

			System.out.println("\nAs you wake up in your dorm room to start the day you'll begin with a "+
				startGPA+" GPA and "+startHealth+"% of your energy.");
			waitHere(2);
			nextMenu();
			// First display of the bars
			waitHere(2);
			printEnergyBar(startHealth);
			waitHere(1);
			printGPABar(startGPA);
			nextMenu();

			//System.out.println();
			//Main.waitHere(1);
			//System.out.println("Don't forget to check your backpack with the 'b' key before you leave for class!");
			
			System.out.println("\nAfter every decision you make you will be prompt with a menu "+
				"to help you navigate your way through The Freshmen Roadtrip!");
			waitHere(2);
			nextMenu();
			welcome = false;
		}
	}

	public static void printEnergyBar(int currentPercentile){
		//	Since the energy bar value can be anything from 0-100, divide the number 
		//	by 2 so bar is not too larger, bc we use barCurrentPercentile to 
		//	determine how many dashes to print for the bar
		int barCurrentPercentile = currentPercentile/2; // 0-50
		
		System.out.print("\nEnergy Bar: \n");

		//	Top part of the bar
		for(int i = 0; i < 50; i++){
			System.out.print("-");
		}
		System.out.println();

		//	Center of the bar
		System.out.print("|");
		for(int i = 0; i < barCurrentPercentile-1; i++){
			System.out.print("*");
		}
		System.out.print("|");

		for(int i = 0; i < 50-barCurrentPercentile-1; i++){
			System.out.print(" ");
		}
		System.out.print("|");
		// 	Bottom of the bar
		System.out.println();
		for(int i = 0; i < 50; i++){
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
		for(int i = 0; i < 50; i++){
			System.out.print("-");
		}
		System.out.println();

		//	Center of the bar
		System.out.print("|");
		for(int i = 0; i < barCurrentGPAvalue-1; i++){
			System.out.print("*");
		}
		System.out.print("|");

		for(int i = 0; i < 50-barCurrentGPAvalue-2; i++){
			System.out.print(" ");
		}
		System.out.print("|");
		// 	Bottom of the bar
		System.out.println();
		for(int i = 0; i < 50; i++){
			System.out.print("-");
		}

		// Prints the value below and at the end of the bar 
		System.out.println();
		for(int i = 0; i < barCurrentGPAvalue-1; i++){
			System.out.print(" ");
		}
		System.out.println(currentGPA+" GPA");
	}

	public static void main(String[] args){
		printEnergyBar(startHealth);
		printGPABar(startGPA);
	}
}