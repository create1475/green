package sec13.exam03;



public class Carexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Car1 myCar1 = new Car1();
		
		myCar1.setGas(5);
		
		boolean gasState = myCar1.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar1.run();
			
		}
		
		if(myCar1.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
			
			
		}else {
			System.out.println("gas를 주입하세요");
		}
		
		
		
		
	}

}
