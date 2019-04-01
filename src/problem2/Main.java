package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);
		int input=0;
		int total=0;
		System.out.println("What is the starting Number?");
		int input1 = in.nextInt();
        System.out.println("What is the ending Number?");
		int input2 = in.nextInt();
		/* if (input1 >= input2) {
			for (int input4 = input2; input4<=input1;input4--) {
				total=total+input4; 
			}
			System.out.println(total); 
		} else */
			for (int input3 = input1;input3<=input2;input3++ ) {
				input=input+input3;}
			System.out.println(input);
	}

}
