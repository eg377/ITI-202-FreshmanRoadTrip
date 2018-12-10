	import java.util.Scanner;
	import java.util.Random;
	import java.util.concurrent.TimeUnit;
	
	public class Backpack {
		
		static Scanner in2 = new Scanner(System.in);
		static String actionInput = "";
		static int backpackInput;
		static String useItem = "";
		static int itemIndex = backpackInput;
		static int currentHealth = Main.startHealth;  
		static double currentGPA = Main.startGPA;  
		static boolean playingGame = true; 
		static String[] backpackArr = new String[] {"powerbar", "apple", "textbook", "pencil", "", "", ""};
			
		
		// printBackpack()
		public static void printBackpack() {
			
			while(playingGame == true) {
			
				//actionInput = in2.nextLine();
				
				//if (actionInput.equals("b")) {
					
					//System.out.println("\nTo use one of the items in your backpack, just press any number between 0 and 6.\nSlots with ??? are empty.");
					
						System.out.println("");
						
						for (int i = 0; i <= backpackArr.length-1; i++) {
							if (backpackArr[i] != "") {
								System.out.print("[" + i + "] " + backpackArr[i] + " ");
							} else {
								System.out.print("[" + i + "] " + "??? ");
							}
			
						}
						playingGame = false;
				//}
				
				//else {
				//	backpackInput = Integer.parseInt(actionInput); // Assumes that the player is trying to use an item instead of looking in backpack.
				//	useItem();
				//} 
			}
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
		public static void useItem() { // public static void useItem(int itemIndex)
			
				if (backpackInput >= 0 && backpackInput <= 6 && backpackArr[backpackInput].length() > 0) { // Checks to see if player inputs a valid backpack slot and the slot actually has an item inside
						System.out.println("You used the " + backpackArr[backpackInput] + ".");
				}
				
				if (backpackArr[backpackInput].isEmpty()) { // if there is no item in this backpack slot, print this message
					System.out.println("You don't have anything to use...");
				}
				
				// ---- Status effects for items ----
				else if (backpackArr[backpackInput] == "powerbar") {
					System.out.println("Your energy increased a little...");
					currentHealth += 5;
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "apple") {
					System.out.println("Your health increased a little...");
					currentHealth += 10;
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "textbook") {
					System.out.println("Your GPA increased a little...");
					currentGPA += 0.5;
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "pencil") {
					System.out.println("Your GPA increased a little...");
					currentGPA += 2;
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "banana") {
					System.out.println("Your health increased a little...");
					currentHealth += 10;
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "energy drink") {
					System.out.println("You got a huge GPA boost! ...But your health has decreased...");
					currentGPA += 0.8;
					currentHealth -= 10;
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}
					
				else if (backpackArr[backpackInput] == "laptop") {
					System.out.println("You got a huge GPA boost!");
					currentGPA += 0.9;
					backpackArr[backpackInput] = ""; // item is removed from inventory
				}

			} // end of Backpack useItem method
	} // end of Backpack class
