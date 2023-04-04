/**
 * 2023.03.28
 * 박민재
 * 입력받은 단의 구구단 출력하기
 */
package chap05;

import java.util.Scanner;

public class GugudanTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++)
		{
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
		
	}

}
