package sec05.exam11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
	
		int score = 85;
		char grade = (score > 90) ? 'A' :((score > 80) ? 'B' : 'C');
		System.out.println(score + " 점은" + grade + " 등급입니다.");
		
//		int score = 85;
//		String grade = (score > 90) ? "ABCD" :((score > 80) ? "ACSDB" : "C");
//		System.out.println(score + " 점은" + grade + " 등급입니다.");
		
//		String a = "";
//		if(score > 90) {
//			System.out.println("a");
//			}else if(score > 80) {
//				a = "b";
//			}else {
//				System.out.println("c");
//			}
//		System.out.println("제 점수는" +  a  + "입니다.");
//		
	
	
		
	}

}








