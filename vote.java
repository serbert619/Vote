import java.util.Arrays;
import java.util.Scanner;
public class vote {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//How many people are voting
		System.out.println("How many people are voting?");
		int n = input.nextInt();
		
		//Addressing the contestants
		System.out.println("1st contestant");
		String first = input.next();
		System.out.println(first);
		
		System.out.println("2nd contestant");
		String second = input.next();
		System.out.println(second);
		
		//vote method
		System.out.println("Press 1 for " + first);
		System.out.println("Press 2 for " + second);
		
		//loop to add input to an array
		int votes[] = new int [n];
		int i=0;
		int a=0;
		int b=0;
		//loop
		for (i=0; i<votes.length; i++) {
			System.out.println("Who do you vote for?");
			votes[i]=input.nextInt();
		// if statements to add up votes	
			if (votes[i] == 1)
				a++;
			if (votes[i] == 2)
				b++;
			//un-comment to see votes being tallied in real time
			//System.out.println("a = " + a);
			//System.out.println("b = " +b);
		}
		System.out.println("There are " + n + " votes accounted for:");
		System.out.println(Arrays.toString((votes)));
		if (a > b)
			System.out.println(first + " won with " + a + " votes!");
		if (a < b)
			System.out.println(second + " won with " + b +" votes!");
		if (a == b)
			System.out.println("Its a tie!");
		
	}
	}