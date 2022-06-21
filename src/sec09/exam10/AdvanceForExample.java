package sec09.exam10;

public class AdvanceForExample {

	public static void main(String[] args) {
		int[]scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;//요거 공식 다시 생각해보기....
		}
		System.out.println("점수 총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 : " + avg);
	}

}
