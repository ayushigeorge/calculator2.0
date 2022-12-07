
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class Calculator2.0 {

	public static void main(String[] args)
	{
		// stores two numbers
		double num1, num2, num3;

		// Take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		// take the inputs
		num1 = sc.nextDouble();

		num2 = sc.nextDouble();
    num3 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/)");

		char op = sc.next().charAt(0);

		double o = 0;

		switch (op) {

	
		case '+':

			o = (num1 + num2) + num3;

			break;

		
		case '-':

			o = (num1 - num2) - num3;

			break;

		
		case '*':

			o = (num1 * num2) * num3;

			break;

	
		case '/':

			o = (num1 / num2)/ num3;

			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");

		System.out.println();

		// print the final result
		System.out.println(num1 + " " + op + " " + num2 + " " +op+ num3 + " = " + o);
	}
}
