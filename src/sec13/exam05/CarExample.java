package sec13.exam05;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car myCar = new Car();
		myCar.keyTurnon();
		myCar.run();
		int speed =myCar.getspeed();//왜 여기는 또 에러인가.......
		
		System.out.println("현재속도: " + speed + "km/h");
	}

}

