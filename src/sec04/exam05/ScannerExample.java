package sec04.exam05;

import java.util.Scanner;



public class ScannerExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String inputdate;
		
		while(true) {
			inputdate = sc.nextLine();
			System.out.println("입력된 문자열: \"" + inputdate + "\"");
			if(inputdate.equals("q")){
				break;
				
			}
		
		}
		System.out.println("종료");
		
		
		
	}

}
