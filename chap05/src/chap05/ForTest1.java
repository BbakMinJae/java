/**
 * 2023-04-04
 * 박민재
 * 입력받은 숫자의 약수를 모두 출력하시오.
 * #문제분석
 *  - 변수 : num, i
 * #알고리즘
 *  1. 약수를 구할 숫자 입력(num)
 *  2.
 *  3.
 */
package chap05;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
				System.out.print(i + " ");
		}
		
	}

}
