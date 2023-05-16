package chap09_1;

public class PersonTest {
	
	public static void main(String[] args) {
		Person p1 = new Person("1234-56789", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa"; //final 변경불가
		//p1.ssn = "777-7777"; //final 변경불가
		p1.name = "kim";
		
	}
}
