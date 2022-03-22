import java.util.Scanner;
public class GreatestCommonDivisor {

	public GreatestCommonDivisor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please imput positive integer to");
		System.out.println("Input first integer: ");
		int num1 = sc.nextInt();
		System.out.println("Input second integer: ");
		int num2 = sc.nextInt();
		Detect D1 = new Detect(num1,num2);
		System.out.println(D1.toString());
		Calculation C1 = new Calculation(num1,num2);
		System.out.println("The greatest common divisor for " + num1 + 
				" and " + num2 + " is " + C1.gcd());
	}

}
