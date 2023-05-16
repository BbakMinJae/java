/*add, sub, mul, div 클래스 생성
 * 각 클래스의 공통 필드 메소드
 * -int, a, b : 2개의 피연산자
 * -void setValue(int a, int b) : 피연산자 값 객체 내에 저장
 * -int calculate() : 클래스 목적에 맞는 연산 실행 후 결과 return
 * main()메소드
 * -add, sub, mul, div 객체 생성
 * -setValue, Calculate()호출 후 결과 출력
 * 실행결과
 * - 두 정수 연산자 입력 >> 5 7 *
 * 	35
 */
package Test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력 & 연산자 기호 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String ch = sc.next();
		

		if (ch.equals("+")) {
			add.setValue(num1, num2);
			System.out.println(add.calculate());
		}
		else if (ch.equals("-")) {
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
		}
		else if (ch.equals("*")) {
			mul.setValue(num1, num2);
			System.out.println(mul.calculate());
		}
		else if (ch.equals("/")) {
			div.setValue(num1, num2);
			System.out.println(div.calculate());
		}
	}

}
