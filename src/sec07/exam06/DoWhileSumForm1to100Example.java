package sec07.exam06;

public class DoWhileSumForm1to100Example {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
			
		}while(i<=100);
		System.out.println("1~" + (i - 1) + "합 : " + sum);///이거 짝수만 더하게 한번 해보기

	}

}
//do while 문 이해다시하기