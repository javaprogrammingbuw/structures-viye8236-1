import java.util.Scanner;



public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		System.out.println("Enter the values");
		int a = scan.nextInt();
		//loops
		for (int i=0; i<a; i++) {
			if (i%2 != 0) {
				System.out.println(i+" The odd numbers are");
			}
		}
		
	}
	
}

