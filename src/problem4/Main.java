package problem4;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// Ask the user 10 multiplication questions. Check their answers and
		//give them their score
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Its the end of the world here is a test for you!");
		
		int CJ = 0;
		
	for (int i = 0; i < 10; i++) {
		int yo = rnd.nextInt(10);
		int zoop = rnd.nextInt(10);
		System.out.println(yo+"x"+zoop);
		int Well = in.nextInt();
		
		if (Well!=yo*zoop) {
			System.out.println("Your a dissapointment to your family");
		}else {
			System.out.println("Your not the worst person ever!!!!");
			CJ++;
		}

	}
	if (CJ<5) {
		System.out.println(CJ+" /10");
		System.out.println("You Need To Practice more");
		if (CJ>5) {
			System.out.println(CJ+" /10");
			System.out.println("Keep Working Hard Dummy");
			}
		}
	}

}

