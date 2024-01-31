package sample_project_practice;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		// Verify the given marks are pass or fail
	    Scanner s = new Scanner(System.in);
	    for (int i = 1; i <=5; i++) {
	    	System.out.println("Enter u r marks");
	    	int marks =s.nextInt();
			if (marks>=47) {
				System.out.println("PASS::::::"+marks);
			}
			else
			{
				System.out.println("FAIL::::::"+marks);
			}
		}

	}

}
