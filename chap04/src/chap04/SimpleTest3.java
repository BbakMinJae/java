package chap04;

import java.util.Scanner;

public class SimpleTest3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("input score : ");
		int grade = stdin.nextInt();

		switch (grade / 10)
		{
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		
	}

}
