package studyclass;

import java.util.Arrays;

public class study7 {

	public static void main(String[] args) {

		//숫자 섞기 로또번호 생성
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9};//일단 배열 생성
		System.out.println(Arrays.toString(arr));//to string을 써서 배열 출력
		
		
	for(int i=0; i< 100; i++) {
		int n = (int)(Math.random()*10);//일단 숫자를 섞어야 하니 매스 랜덤값을 써서 그 변수를 n에 저장
		int tmp = arr[0];//tmp라는 인덱스를 arr[0]번지에 저장한다.
		arr[0] = arr[n];//arr[0]번지를 arr[n]에 나온 값을 저장한다.
		arr[n]= tmp; //arr[n]를 tmp에 저장한다.
	}
	System.out.println(Arrays.toString(arr));	
		
	}

}
