package sec05.exam08;

public class CompareOperatorExample {

	public static void main(String[] args) {
	
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);//true int랑 double랑 만나면 더블형으로 바뀜 그래서 트루
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);//false 왜나하면 더블은 소수 15자리 플로트는 6자리까지 니까 일치하지 않음
		System.out.println((float)v4 == v5);//플로트 형으로 바꿔야함 왜나하면 이건 큰수에 일치시키는게 아니라 소수 6자리까지 일치시켜야 하니 작은값을 일치시킨다
		System.out.println((int)(v4*10) == (int)(v5 * 10));//둘다 int형으로 바꾸니 true
		
		
		
		
	}

}
