package qedge.june22;

import java.util.Scanner;

public class If_Condition1 {

	public static void main(String[] args) {
		// Verify Given Marks are Pass or Fail
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <=5; i++) {
			System.out.println("Enter your marks:::::::::");
			int marks = s.nextInt();
		if (marks>=35) {
			System.out.println("Pass::::::"+marks);
		}
		else
		{
			System.out.println("Fail:::::::"+marks);
		}
		
		}
	}
}
	
		
	
	
	
