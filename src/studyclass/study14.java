package studyclass;

public class study14 {

	public static void main(String[] args) {
		
		Data3 d = new Data3();
		d.x = 10;
		System.out.println("d.x =" + d.x);
		
		Data3 d2 = copy(d);
		 
		
		
		//참조형 반환타입 다시
	}
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x;
		return tmp;
	}

}
class Data3{int x;}




//인스턴스 메소드는 선언할떄 참조변수.메소드이름() 이렇게 선언한다. 인스턴스 멤버와 관련있는 작업을 하는 메소드

//결론 --- 인스턴스 변수를 사용하냐 안하냐 차이다

//static 메소드는 클래스이름.메소드이름() 이렇게 선언한다.----인스턴스 멤버와 관련없는 작업을 하는 메소드


//인스턴스 변수는 매개변수가 필요없다.(입력값이 없다)

//객체생성없이 호출 가능한 메소드 이건  static 메소드
//iv(인스턴스 변수)를 사용하지 않으면 그냥 다 static붙인다.
