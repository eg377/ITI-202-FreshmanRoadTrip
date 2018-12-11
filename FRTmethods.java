import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FRTmethods{

	static double startGPA = 3.0;
	static int startHealth = 75;

	public static void nextMenu(){
		boolean loopNextMenu = true;
		Scanner in = new Scanner(System.in);
		
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

//	public static void backpackManger(){
//		String[] userBackpack = new String[7];
//		
//		String selectedItem = "";
//		
//		userBackpack[0] = "powerbar";
//		userBackpack[1] = "apple";
//		userBackpack[2] = "textbook";
//		userBackpack[3] = "pencil";	
//		userBackpack[4] = "???";	
//		userBackpack[5] = "???";	
//		userBackpack[6] = "???";
//
//		switch(selectedItem){
//		
//		//IF THE USER HAS AND SELECTS TO USE A POWERBAR
//		case 1: selectedItem = 0
//		System.out.println("\nYou ate the " + userBackpack[0] + ". Your energy increased a little!");
//		userBackpack[0] = "???";
//		// Add to energy
//		printEnergyBar(currentHealth += 5);
//		//Bars should be printed
//		printGPABar(startGPA);
//		break;
//		
//		//IF THE USER HAS AND SELECTS TO USE AN APPLE
//		case 2: selectedItem = 1
//		System.out.println("\nYou ate the " + userBackpack[1] + ". Your energy increased a little!");
//		backpackArr[1] = "???";
//		// Add to energy
//		printEnergyBar(currentHealth += 10);
//		// GPA is printed to keep the use updated
//		printGPABar(startGPA);
//		break;
//		
//		//IF THE USER HAS AND SELECTS TO USE A TEXTBOOK
//		case 3: selectedItem = 2
//		System.out.println("\nYou read the " + userBackpack[2] + ". Your GPA increased a little!");
//		backpackArr[2] = "???";
//		// Energy is printed to keep the use updated
//		printEnergyBar(currentHealth);
//		// Add to GPA
//		printGPABar(currentGPA += 0.2);
//		break;
//		
//		//IF THE USER HAS AND SELECTS TO USE A PENCIL
//		case 4: selectedItem = 3
//		System.out.println("\nYou used the " + userBackpack[3] + ". Your GPA increased a little!");
//		backpackArr[3] = "???";
//		// Energy is printed to keep the use updated
//		printEnergyBar(currentHealth);
//		// Add to GPA
//		printGPABar(currentGPA += 0.1);
//		break;
//			
//		case 5: selectedItem = 4
//		System.out.println("\nYou don't have anything here... keep on questing!");
//		break;
//		
//		}
//		
//	}
	
	
	
	public static void main(String[] args){
		printEnergyBar(startHealth);
		printGPABar(startGPA);
	}
}