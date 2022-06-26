package studyclass;

import java.util.Arrays;

public class study5 {

	public static void main(String[] args) {

		String[] arr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<5; i++) {
			int tmp = ((int)(Math.random()*3));
			System.out.println(arr[tmp]);
		}
		
	}
	
}
