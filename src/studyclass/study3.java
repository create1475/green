package studyclass;

public class study3 {

	public static void main(String[] args) {
	
		int num = 12345; 
		int sum = 0;
		
		for(num=12345; num>0; num = num /10) {
		System.out.println(num%10);
		sum += num % 10;
		}
		System.out.println("sum" + sum);
	} 

}
