/**
 * 1~1000까지의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램
 * for로 작성
 */
package chap05;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
		{
			if(i % num == 0)
				sum = sum + i;
		}
		System.out.println("1 ~ 1000까지의 정수 중에서 " + num + "의 배수들의 합 : " + sum);
		
		
	}

}
