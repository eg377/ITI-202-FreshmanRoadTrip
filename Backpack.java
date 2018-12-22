	import java.util.Scanner;
	import java.util.Random;
	import java.util.concurrent.TimeUnit; 
	
	public class Backpack extends bar {
		
		static Scanner in2 = new Scanner(System.in);
		static String actionInput = "";
		static int backpackInput;
		static String useItem = "";
		static int itemIndex = backpackInput;
		static boolean playingGame = true; 
		static boolean bpPressed = true;
		
		/* -----------  ALL AVAILABLE ITEMS HERE ----------- */ 
		// Polymorphism is demonstrated below. All of these items are BackpackItem objects, but each is either an EnergyItem or a GpaItem. An array of BackpackItems is printed in the printBackpack() method.
		static EnergyItem powerbar = new EnergyItem("powerbar", 10, "Your energy increased a little...");
		static EnergyItem apple = new EnergyItem("apple", 15, "Your energy increased a lot!");
		static EnergyItem banana = new EnergyItem("banana", 15, "Your energy increased a lot!");
		static EnergyItem coffee = new EnergyItem("coffee", 20, "You got a huge energy boost!");
		static GpaItem textbook = new GpaItem("textbook", 0.4, "Your GPA increased a lot!");
		static GpaItem pencil = new GpaItem("pencil", 0.1, "Your GPA increased a little...");
		static GpaItem notebook = new GpaItem("notebook", 0.2, "Your GPA increased a little...");
		static GpaItem calculator = new GpaItem("calculator", 0.3, "Your GPA increased a little...");
			
		// Starter backpack. We will allow player to add items throughout game.
		static BackpackItem[] backpackArr = new BackpackItem[] {powerbar, apple, textbook, null, null, null, null};
		
		// printBackpack()
		public static void printBackpack() {
			
					System.out.println("\nTo use one of the items in your backpack, just press any number between 0 and 6.\nSlots with ??? are empty.");
					
						System.out.println("");
						
						//For loop prints backpack
						for (int i = 0; i <= backpackArr.length-1; i++) {
							if (backpackArr[i] != null) {
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
		public static void addItem(BackpackItem itemName) {
			
			for (int i = 0; i <= backpackArr.length-1; i++) { //iterate through backpackArr
				
				if (backpackArr[i] == null) { // If there is no item in slot
					System.out.println("You added the " + itemName + " to your backpack.");
					backpackArr[i] = itemName; // puts new item into next empty BackpackItem index in backpackArr
					break;  // breaks out of for loop (to prevent filling up all slots with the same item
				}
			}
		} // end of addItem method
		
		// useItem
		public static void useItem(int itemIndex) { // public static void useItem(int itemIndex)
			
			BackpackItem selectedItem = backpackArr[backpackInput];
			
				if (selectedItem == null) { // if there is no item in this backpack slot, print this message
					System.out.println("\nYou don't have anything to use...");
				}
				
				else if (backpackInput >= 0 && backpackInput <= 6 && selectedItem.getItemName().length() > 0) { // Checks to see if player inputs a valid backpack slot and the slot actually has an item inside
					System.out.println("\nYou used the " + selectedItem + ".");
					
					System.out.println(selectedItem.getEffectDescription());
					setStartHealth(getStartHealth() + selectedItem.getEnergyEffect()); // increases health if HealthItem
					setStartGPA(getStartGPA() + selectedItem.getGpaEffect()); // increases GPA if GpaItem
					
					if (getStartHealth() >= 100) {
						setStartHealth(100);
					}
					
					if (getStartGPA() >= 4.0) {
						setStartGPA(4.0);
					}
					
					backpackArr[backpackInput] = null; // item is removed from inventory
				}
			} // end of Backpack useItem method

	} // end of Backpack class
