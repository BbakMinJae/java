/**
 * 2023-04-04
 * 박민재
 * 1~100까지의 숫자 중에서 사용자로부터 입력 받은 숫자의 배수의 합을 구하라.
 * (while, continue 이용)
 * 
 */
package chap05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0, sum = 0;
		
		while(i <= 100)
		{
			i++;
			if (i % num == 0)
				sum += i;
			else continue;
		}
		System.out.println("합 : " + sum);
	}

}
