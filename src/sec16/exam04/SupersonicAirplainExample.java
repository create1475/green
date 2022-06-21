package sec16.exam04;

public class SupersonicAirplainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		supersonicAirplane sa = new supersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = supersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = supersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		
		
		
		
	}

}
