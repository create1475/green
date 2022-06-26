package studyclass;

import java.util.Arrays;

public class study4 {

	public static void main(String[] args) {

		int[] ball = new int[45];
		
		
		
		for(int i=0; i<ball.length; i++) 
		ball[i] = i + 1 ;//이걸 하는 이유는 인덱스가 0~44 까지 인데 이건 로또 번호 구하는 거니 1~45 까지 구하기 위해 +1을 해워야 한다. 
		int tmp = 0;
		int j = 0;
		
		
		for(int i=0; i<6; i++) {
			
			j = (int)(Math.random()*45);
			tmp = ball[i];
			ball[i]= ball[j];
			ball[j] =tmp;
			System.out.println(Arrays.toString(ball));
			
		}
		
		
		}
		
	}
	

