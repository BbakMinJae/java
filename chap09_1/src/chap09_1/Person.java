package chap09_1;

public class Person {
	final String nation = "Korea";
	final String ssn; //생성자로 초기화
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
