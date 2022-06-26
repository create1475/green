package studyclass;

public class study6 {

	public static void main(String[] args) {

		//최대값 최소값 구하기
		
		int[] score = { 79,88,91,33,100,55,95};
		
		int max = score[0];//score[0]을 선언한건 0번지에 최소값이 들어가 있으라고 선언
		int min =score[0];//위와같이 최소값을 0번지에 저장
		
		for(int i=0; i< score.length; i++) {
			if(score[i]> max ) {
				max = score[i];//반복문을 통해 i값이 최대값인 맥스보다 클떄 그값을 max에 저장
			}else if( score[i]< min ) {
				min = score[i];//반복문을 통해 제일 작은 값은 최소값에 저장
			}
		}
		
		System.out.println("최댓값 : " + max);
		System.out.println("최소값 : " + min);
		
		
	}

}
