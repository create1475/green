package sec12.exam04;

public class Car1 {

	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	Car1(){
		
	}
	Car1(String model){
		this(model, null,0);
		
	}
	Car1(String model, String color){
		this(model,color, 0); 
		
		
	}
	
	Car1(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
		
	}
}