class point {
	
	int x;
	int y;
	
	point(int x, int y){
		this.x=x;
		this.y=y;
	}
	String getLocation() {
		return "x : " + x + " y: " + y;
	}
}

class point3D extends point{
	int z;
	
	public point3D(int x, int y, int z) {
		super(x, y);
		this.z=z;
	}
	String getLocation() {
		return "x : " + x + "y:" + y + "z:"+ z;
	}
}


public class PointTest {

	public static void main(String[] args) {
		PointTest p3 = new PointTest();
		System.out.println(p3);
		
		
		
	}

}
