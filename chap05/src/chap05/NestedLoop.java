/**
 * 2023-04-04
 * 박민재
 * 입력받은 숫자만큼 줄수를 반복하면서 직각삼각형 출력
 * #문제분석
 *  - 변수 : num, i, j
 * #알고리즘
 *  1. 줄 수 입력(num)
 *  2. 중첩반복
 *  	while(i <= num) // 줄 반복
 *  		{
 *  			while(j <= i) // 별 찍기 반복
 *  				별 찍기
 *  		}
 */

package chap05;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 입력 : ");
		int num = sc.nextInt();
		
		int i = 1, j = 1;
		while(i <= num)
		{
			while(j <= i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			j = 1;
			i++;
		}
		
		
	}

}
