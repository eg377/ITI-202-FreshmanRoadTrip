import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main extends bar{

	static double startGPA = getStartGPA();
	static int startHealth = getStartHealth();

	public static void main(String[] args){
		//GAME STARTS HERE...
		welcomePlayer();
		storyArc1();
		storyArc2();
	}
}