package chap10;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC; //초음속비행 변환
		sa.fly();
		sa.flyMode = SupersonicAirplane.NOMAL; //일반비행 변환
		sa.fly();
	}

}
