package practice;

import java.util.Scanner;

public class practice1 {

	{
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 |3.잔고 |4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());//엔터치기전에 있는 모든 문자를 출력하는 느낌?
			
			switch (menuNum) {
			case 1:
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출급액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("잔고> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 4:
				run = false;
				break;
				
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}



