package sec12.exam04;



public class Car1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Car1 car1 = new Car1();
		System.out.println("Car1.company : " + car1.company);
		System.out.println();
		
		Car1 car2 = new Car1("자가용");
		System.out.println("Car2.company : " + car2.company);
		System.out.println("Car2.model : " + car2.model);
		System.out.println();
		
		Car1 car3 = new Car1("자가용", "빨강");
		System.out.println("Car3.company : " + car3.company);
		System.out.println("Car3.model : " + car3.model);
		System.out.println("Car3.color : " + car3.color);
		System.out.println();
		
		Car1 car4 = new Car1("자가용","검정",300);
		System.out.println("Car4.company : " + car4.company);
		System.out.println("Car4.model : " + car4.model);
		System.out.println("Car4.color : " + car4.color);
		System.out.println("Car4.maxspeed : " + car4.maxspeed);
		System.out.println();
		
		
	}

}
