package firstPack;

import java.util.Scanner;

public class FirstClass {
	
	public static void main(String[] args) {
		System.out.print ("Enter a first num1:");
		Scanner nums = new Scanner(System.in);
		int num1 = nums.nextInt();
		System.out.print ("Enter a first num2:");
		int num2 = nums.nextInt();
		
		float num3 = (float) num1 / num2; 
		System.out.print("Sum of "+num1 +" and "+ num2 +" is "+num3);
	}

}
