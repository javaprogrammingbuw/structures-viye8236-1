import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("a: " + a + " b: " + b + " c: " + c);

		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

		
		
		
		double s = a+b+c;
		System.out.println("Sum of the values" +s);
		
		// mean
		
		double average = s/3;
				System.out.println(" mean of the values " +average);
				
				
				if (a>b && a>c) {
					
					System.out.println("Maximum value is A" +a);
				}
				else if(b>c && b>a){

					System.out.println("Maximum value is B" +b);
				}else {
					System.out.println("Maximum value is C" + c);
				}
				if (a<b && a<c) {
					System.out.println("Minimum value is A" + a );
				}else if(b<c && b<a) {
					System.out.println("Minimum value is B "+ b);
				}else {
					System.out.println("Minimum value is C "+ c);
				}
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		
	}

}

	


