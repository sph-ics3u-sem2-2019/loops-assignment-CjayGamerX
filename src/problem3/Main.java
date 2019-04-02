package problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a word and print out one character per String
		Scanner in=new Scanner(System.in);
		System.out.println("Give Me A DAMN Word! ");
		String word = in.nextLine(); 
		for (int y=0; y< word.length(); y++) {
			System.out.println(word.charAt(y));
			
		}
	}

}
