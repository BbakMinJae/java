package star;

import java.util.Scanner;

public class star4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			for(int j = num; j > i; j--)
				System.out.print(" ");
			
			for(int k = 1; k <= i * 2 - 1; k++)
				System.out.print("*");
				
			System.out.println();
		}
	}

}
