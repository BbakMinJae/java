/**
 * 2023.03.28
 * 박민재
 * 직급과 나이를 입력 받아서 직급이 7 또는 8이고 나이가 40대이면 "연금 80%"
 * 직급이 5 또는 6이고 나이가 50대 이면 "연금 100%"
 * 그 외의 경우는 "연금 대상자 아님"
 * 을 출력하는 프로그램
 */
package chap04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		if ((num == 7 || num == 8) && (num2 / 10 == 4))
			System.out.println("연금 80%");
		else if ((num == 5 || num == 6) && (num2 / 10 == 5))
			System.out.println("연금 100%");
		else
			System.out.println("연금 대상자 아님");
	}

}
