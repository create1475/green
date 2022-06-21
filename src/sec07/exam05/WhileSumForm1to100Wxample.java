package sec07.exam05;

public class WhileSumForm1to100Wxample {

	public static void main(String[] args) {
	
		
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~" + (i - 1) + "합 : " + sum);//(i-1)을 해주는 이유는 i값은 101까지 나오니 100에 맞춰주려면 1을 뺴야한다.
		
		
	}

}
