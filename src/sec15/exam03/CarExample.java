package sec15.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();
		
		myCar.setspeed(-50);
		
		System.out.println("현재속도 : " + myCar.getspeed());
		
		myCar.setspeed(60);
		//System.out.println("지금속도: " + myCar.getspeed());
		if(!myCar.isstop()) {
			myCar.setstop(true);
		}
		
		System.out.println("현재속도 : " + myCar.getspeed());
	}

}
//이거 속도 60 넣어보기





