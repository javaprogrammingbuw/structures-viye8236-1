import java.util.Scanner;


public class SwitchCaseMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.*/
		 if (b>0 && b<10) {
			 System.out.println("The values entered is ");
		
		 
//		 
		/* 
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */

		 int modulo = a%b;
		 System.out.println(modulo);
		 
		 switch (modulo) {
		 
		 case 0:
			 System.out.println(" The modulus is 0");
			 break;
		 case 1:
			 System.out.println(" The modulus is 1");
			 break;
		 case 2:
			 System.out.println(" The modulus is 2");
			 break;
		 case 3:
			 System.out.println(" The modulus is 3");
			 break;
		 case 4:
			 System.out.println(" The modulus is 4");
			 break;

		 case 5:
			 System.out.println("The modulus is 5");
		 case 6:
			 System.out.println(" The modulus is 6");
			 break;
		 case 7:
			 System.out.println(" The modulus is 7");
			 break;
		 case 8:
			 System.out.println(" The modulus is 8");
			 break;

		 case 9:
			 System.out.println("The modulus is 9");
		 case 10:
			 System.out.println("The modulus is 10");
			 default :
			 System.out.println("The modulus is not found");
				 
		 }
		 }
		 else {
			 
			 System.out.println("The value is entered is wrong");
		 }
	}

}
