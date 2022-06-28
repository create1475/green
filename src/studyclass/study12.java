package studyclass;

public class study12 {

	public static void main(String[] args) {

		
		//메소드란 문장들 묶은것
		//값을 받아서 처리하고 결과를 반환(출력)
		//   반환타입      메소드이름      매개변수선언
		//    int          add        (int x ,int y);{
		//         		int result = x + y;
		//이런식으로 선언된다
		
		//메소드는 꼭꼭꼭  클래스 안에 있어야 한다.
		//장점-코드의 중복을줄일수 있다.
		//코드 관리가 쉽고 재사용이 가능하고 간결해서 이해하기 쉽다
		
		//반환타입이 없을때는 void 를 쓴다
		//지역변수----메서드 내에 선언된 변수
		
		
		
		
		//메소드 호출
		//메소드이름(값1,값2,값3,값4-----);
		//작업결과를 저장할 변수를 꼭 선언해줘여야 한다.
		//매개변수--메소드를 호출한 쪽에서 add메소드의 전달하는 중간 역활을 한다해서 매개변수라 한다.
		
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);//add메소드 호출 작업을 마치면 호출한 곳으로 돌아온다.
		long result2 = mm.subtract(5L, 3L);//
		long result3 = mm.multiply(5L, 3L);
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	
		//메소드의 실행 흐름
		//객체생성 ----매소드 호출=-------return 값으로 호출한곳으로 돌아간다.
		
		
		
		
	}

}

class MyMath{
	long add(long a, long b) {
	long result = a+b;
	return result; 
			}
	
	long subtract (long a, long b) { return a-b;}
	long multiply (long a, long b) { return a*b;}


}