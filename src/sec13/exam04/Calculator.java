package sec13.exam04;

public class Calculator {

	int plus(int x , int y) {
		int result = x + y;
		return result;
		}

	double avg(int x,int y) {
		double sum = plus(x,  y);
		double result = sum / 2;
		return result;
	}
	void execute() {
		double result = avg(7,  10);
		println("실행결과: " + result);
	}
	void println(String message) {
		System.out.println(message);
	}
	
	
	//println은 개발자 함수라서 다른거 써도 상관 없음.
	
	

}
