/**
 * 2023-04-04
 * 박민재
 * 숫자를 반복적으로 입력받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 */
package chap05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Anum = 0;
		int num, cnt = 0;
		
		while(true)
		{
			num = sc.nextInt();
			Anum += num;
			cnt++;
			if (Anum >= 1000)
				break;
			
		}
		System.out.println("1000을 넘은 수 : " + num + "\n평균 : " + Anum / cnt);
	}

}
