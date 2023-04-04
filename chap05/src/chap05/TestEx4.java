/**
 * 두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더하여 출력하는
 * 프로그램 작성
 * #문제분석
 *  변수 - num1, num2, sum
 * #알고리즘
 *  1. 두 정수 입력(num1, num2)
 *  2. 선택문(if (num1 < num2))
 *  3. 복합논리 (반복문 안에 선택문 포함)
 *  	while(num1 <= num2){
 *  		if(num1 % 2 == 1){
 *  			sum = sum + num1
 *  		}
 *  		num1 = num1 + 1
 *  	}
 */

package chap05;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int temp, total = 0;
		
		if(num1 > num2)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (int i = num1; i <= num2; i ++)
		{
			if(i % 2 == 0) continue;
			total += i;
		}
		
//		while (num1 < num2)
//		{
//			if (num1 % 2 == 1)
//			{
//				total = total + num1;
//			}
//			num1 = num1 = 1;
//		}
		
		System.out.println("두 숫자 사이의 홀수값 : " + total);
	}

}
