package studyclass;


class Mypoint{
	int x;
	int y;
}

//class Circle extends Mypoint{
//
//	int r;
//}



class Circle {
	Mypoint p = new Mypoint();
	int r;
}
public class study2 {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.toString());
		
		}

}
