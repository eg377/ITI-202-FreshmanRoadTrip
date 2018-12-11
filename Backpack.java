	import java.util.Scanner;
	import java.util.Random;
	import java.util.concurrent.TimeUnit;
	
	public class Backpack extends Main {
		
		static Scanner in2 = new Scanner(System.in);
		static String actionInput = "";
		static int backpackInput;
		static String useItem = "";
		static int itemIndex = backpackInput;
		static int currentHealth = startHealth;  
		static double currentGPA = startGPA;  
		static boolean playingGame = true; 
		static String[] backpackArr = new String[] {"powerbar", "apple", "textbook", "pencil", "", "", ""};
		static boolean bpPressed = true;
			
		
		// printBackpack()
		public static void printBackpack() {
			
					System.out.println("\nTo use one of the items in your backpack, just press any number between 0 and 6.\nSlots with ??? are empty.");
					
						System.out.println("");
						
						//For loop prints backpack
						for (int i = 0; i <= backpackArr.length-1; i++) {
							if (backpackArr[i] != "") {
								System.out.print("[" + i + "] " + backpackArr[i] + " ");
							} else {
								System.out.print("[" + i + "] " + "??? ");
							}
			
						}
					// Automatically allows player to use item after looking in backpack
					backpackInput = in2.nextInt();
					useItem(backpackInput);
			} // end of printBackpack method

		// addItem
		public static void addItem(String itemName) {
			
			for (int i = 0; i <= backpackArr.length-1; i++) { //iterate through backpackArr
				
				if (backpackArr[i] == "") {
					System.out.println("You added the " + itemName + " to your backpack.");
					backpackArr[i] = itemName; // puts new item into next empty String index in backpackArr
					break;  // breaks out of for loop (to prevent filling up all slots with the same item
				}
			}
		} // end of addItem method
		
		// useItem
		public static void useItem(int itemIndex) { // public static void useItem(int itemIndex)
			
				if (backpackInput >= 0 && backpackInput <= 6 && backpackArr[backpackInput].length() > 0) { // Checks to see if player inputs a valid backpack slot and the slot actually has an item inside
						System.out.println("You used the " + backpackArr[backpackInput] + ".");
				}
				
				if (backpackArr[backpackInput].isEmpty()) { // if there is no item in this backpack slot, print this message
					System.out.println("You don't have anything to use...");
				}
				
				// ---- Status effects for items ----
				// ADD MORE ITEMS AS NEEDED. THIS ALLOWS US TO MAKE SPECIFIC ITEMS HAVE THEIR OWN UNIQUE EFFECTS.
				else if (backpackArr[backpackInput] == "powerbar") {
					System.out.println("Your energy increased a little...");
					currentHealth += 5;
					if (currentHealth > 100) { // Keeps health from being higher than 100%
						currentHealth = 100;
					}
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "apple") {
					System.out.println("Your energy increased a lot!");
					currentHealth += 15;
					if (currentHealth > 100) { // Keeps health from being higher than 100%
						currentHealth = 100;
					}
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "textbook") {
					System.out.println("Your GPA increased a little...");
					currentGPA += 0.3;
					if (currentGPA > 4.0) { // Keeps GPA from being higher than 4.0
						currentGPA = 4.0;
					}
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "pencil") {
					System.out.println("Your GPA increased a little...");
					currentGPA += 0.1;
					if (currentGPA > 4.0) { // Keeps GPA from being higher than 4.0
						currentGPA = 4.0;
					}
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "banana") {
					System.out.println("Your health increased a lot!");
					currentHealth += 15;
					if (currentHealth > 100) { // Keeps health from being higher than 100%
						currentHealth = 100;
					}
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "energy drink") {
					System.out.println("You got a huge energy boost! ...But your GPA has decreased...");
					currentGPA -= 0.8;
					currentHealth += 10;
					if (currentHealth > 100) { // Keeps health from being higher than 100%
						currentHealth = 100;
					}
					else if (currentGPA > 4.0) { // Keeps GPA from being higher than 4.0
						currentGPA = 4.0;
					}
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "laptop") {
					System.out.println("You got a huge GPA boost!");
					currentGPA += 0.9;
					if (currentGPA > 4.0) { // Keeps GPA from being higher than 4.0
						currentGPA = 4.0;
					}
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}

			} // end of Backpack useItem method
	} // end of Backpack class
