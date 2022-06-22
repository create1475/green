
import java.util.Scanner;

public class asdasd {

	public static void main(String[] args) {

		int a;
		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("년도입력 : ");
			a = sc.nextInt();
			if(a % 4 == 0) {
				if(a % 400 == 0) {
					System.out.println("윤년");
					continue;
				}else if(a % 4 == 0) {
					System.out.println("윤년");
					continue;
				}
			}else if(a % 100 != 0) {
				System.out.println("평년");
				continue;
			}
			
		
		
		
		
		}
	}
}
