package sec14.exam03;

public class Car {

	
	int speed;
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
	}
}
//메인 클래스 안에서 카 클래스 를 호출하려면 새로 다시 지정해 줘야한다??
//
