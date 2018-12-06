import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class bar{

	static double startGPA = 3.0;
	static int startHealth = 75;

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