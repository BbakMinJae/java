/**
 * 2023.03.28
 * 박민재
 * 조건문 연습
 */
package chap04;

import java.util.Scanner;

public class SimpleTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("input score");
		int grade = stdin.nextInt();
		
		if (grade >= 90)
		{
			System.out.print("합격");
		}
		else
			System.out.println("불합격");
			
		
	}

}