import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main extends bar{

	static double startGPA = 3.0;
	static int startHealth = 75;

	public static void main(String[] args){
		//GAME STARTS HERE...
		welcomePlayer();
		continuePlayer();
		storyArc1();
		continuePlayer2();
		storyArc2();
	}
}