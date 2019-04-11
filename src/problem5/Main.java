package problem5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read the string and output in reverse case.
		Scanner in=new Scanner(System.in);
		
		System.out.println("GIMME WOOORRRDDD!");
		String word = in.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			char letter=word.charAt(i);
			boolean upper=Character.isUpperCase(letter);
			boolean lower=Character.isLowerCase(letter);
			if (upper==true) {
				letter=Character.toLowerCase(letter);
				System.out.print(letter);
		}
			else if (lower==true) {
				letter=Character.toUpperCase(letter);
				System.out.print(letter);
			}
			else System.out.print(letter);
		}
} 
	
}


