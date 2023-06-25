/*add, sub, mul, div 클래스 생성*/
package chap11;

abstract class Calculator{
	abstract int add(int x, int y);
	abstract int sub(int x, int y);
	abstract int mul(int x, int y);
	abstract int div(int x, int y);
}

class Cal extends Calculator{
	@Override
	int add(int a, int b) {
		return a + b;
	}
	
	@Override
	int sub(int a, int b) {
		return a - b;
	}

	@Override
	int mul(int a, int b) {
		return a * b;
	}

	@Override
	int div(int a, int b) {
		return a / b;
	}
}

public class Test1 {

	public static void main(String[] args) {
		Calculator cal = new Cal();
	}

}
