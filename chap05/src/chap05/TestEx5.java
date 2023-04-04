/**
 * 2023-04-04
 * 박민재
 * 두 숫자를 입력 받아서 두 수 사이의 합계 출력 하기
 * #문제분석
 *  - 변수 : first, second, total
 * #알고리즘
 *  1. 정수 입력(first, second)
 *  2. 선택문(if (first<second))
 *  3. 반복문(for (first; second; first++;)
 *  			total = total + first
 */
package chap05;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int second = sc.nextInt();
		int total = 0, temp = 0;
		
		if (first > second)
		{
			temp = first;
			first = second;
			second = temp;
		}
		
		for (int i = first; i <= second; i++)
			total += i;
		
		System.out.println("두 수의 합 : " + total);
	}

}
