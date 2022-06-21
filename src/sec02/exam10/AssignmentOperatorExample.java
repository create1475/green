package sec02.exam10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		
		int result = 0;
		result +=10;
		System.out.println("result= " +result);//10 왜나면 더하고나뒤에 result값에 넣어라
		result -= 5;
		System.out.println("result= " +result);//5 왜나면 앞에 ;뒤에 나온값은 10 그 10에 -5를 해서 값을 출력
		result *= 3;
		System.out.println("result= " +result);//15 왜냐면 앞에 결과값이 5이니까 거기에 곱하기 3을 해서 값을 출력해라
		result /= 5;
		System.out.println("result= " +result);//3
		result %= 3;
		System.out.println("result= " +result);//0
		
		
		
		
		
	}

}
