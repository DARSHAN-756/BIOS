package bios;
import java.util.Scanner;

public class q2 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		int Sum= num1+num2;
		System.out.println("Sum of number: "+ Sum);
	
		
		sc.close();
	}

}

