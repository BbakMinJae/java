/**
 * 2023.04.18 (화)
 * null과 NullPointException
 * 참조변수의 ==연산 과 equals()메소드
 */
package chap06;

public class ArrayReference1 {

	public static void main(String[] args) {
//		int[] intArray = null;
//		intArray[0] = 10; //참조객체 없으므로 Nullpointexception
		
		String strVal1 = "java";
		String strVal2 = "java";
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1, strVal2 same reference.");
		}else {
			System.out.println("strVal1, strVal22 diferent reference");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1, strVal2 same string.");
		}
		
		String strVal3 = new String("mjPark");
		String strVal4 = new String("mjPark");
		
		if (strVal3 == strVal4) {
			System.out.println("strVal3, strVal4 same reference.");
		}else {
			System.out.println("strVal3, strVal4 diferent reference.");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3, strVal4 same string.");
		}
	}

}
