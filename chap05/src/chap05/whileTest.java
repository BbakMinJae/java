/**
 * 2023.03.28
 * 박민재
 * 반복문(while) - 1~10 합계 구하기
 */
package chap05;

public class whileTest {

	public static void main(String[] args) {
		// while 반복
		int sum = 0, cnt = 1;
		
		while (cnt <= 10)
		{
			sum = sum + cnt;
			cnt = cnt + 1;
		}
		System.out.println("1~10 total : " + sum);
		
		// for 반복
		sum = 0;
		
		for (int i = 0; i < 10; i++)
		{
			sum = sum + (i + 1);
		}
		System.out.println("1~10 total : " + sum);
		
		// do~while 반복
		sum = 0; cnt = 0;
		do
		{
			sum = sum + cnt;
			cnt = cnt + 1;

		}while(cnt <= 10);
		
		System.out.println("1~10 total : " + sum);
	}
	

}
