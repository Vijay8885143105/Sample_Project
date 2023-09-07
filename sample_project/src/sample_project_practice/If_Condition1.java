package sample_project_practice;

import java.util.Scanner;

public class If_Condition1 {

	public static void main(String[] args) {
		//Verifying given marks are pass or fail
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <=6; i++) {
			System.out.println("Enter your marks");
			int marks =s.nextInt();
			if (marks>=35) {
				System.out.println("PASS::::"+marks);
			}
			else
			{
				System.out.println("FAIL::::"+marks);
			}
		}

	}

}
