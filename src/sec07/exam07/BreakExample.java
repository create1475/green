package sec07.exam07;

public class BreakExample {

	public static void main(String[] args) throws Exception{
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;//random이라 숫자는 랜덤으로 나온다. 값이 항상 다르다.
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		

	}

}
