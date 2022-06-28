package studyclass;


public class study13stack {

	public static void main(String[] args) {

		
		
		//호출스택----밑이 막힌 상자 위에 차곡차곡 쌓인다.
		
		
		
		//기본형 매개변수-- 변수의 값을 읽기만 할수 있다.
		//참조형 매개변수-- 변수의 값을 읽고 변경할수 있다.
		
		
		Data d = new Data();//1.참조변수로 객체를 생성 
		d.x=10;
		System.out.println("main() : x  " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x " + d.x);
		
		
	}
	static void change(int x) {
		x=1000;
		System.out.println("change() : x  = " + x);
	}

}
class Data{int x;}

