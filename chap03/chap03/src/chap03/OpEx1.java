/**
 * 동전교환 프로그램
 * 입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전으로 교환해주는 프로그램 작성
 * 조건1 : 동전의 총개수를 최소화
 * 조건2 : 고액의 동전 우선 교환
 * 
 */
package chap03;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = input.nextInt();
		
		System.out.println("500원 : " + money / 500 + "개");
		money %= 500;
		System.out.println("100원 : " + money / 100 + "개");
		money %= 100;
		System.out.println("50원 : " + money / 50 + "개");
		money %= 50;
		System.out.println("10원 : " + money / 10 + "개");
		
	}

}
