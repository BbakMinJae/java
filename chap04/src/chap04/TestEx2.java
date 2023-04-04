/**
 * 2023.03.28
 * 박민재
 * 입력된 숫자가 양수, 0, 음수인지 판별하는 프로그램 작성
 */
package chap04;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0)
			System.out.println("양수");
		else if(num < 0)
			System.out.println("음수");
		else
			System.out.println("0");
	}

}
