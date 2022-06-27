package studyclass;

import java.util.Scanner;

public class study8 {

	public static void main(String[] args) {
		
		String[][]  words = { 
			{"chair","의자"},//words[0][0]  words[0][1]
			{"Computer","컴퓨터"},//words[1][0] words[1][1]
			{"integer","정수"}//words[2][0]  words[2][1]
		
		};
		
		Scanner sc = new Scanner(System.in);//스캐너 입력문을 받는다.
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?" ,i+1 , words[i][0]);//프린트 f를 써서 q1번문제 에 1번 단어의 뜻을 찾는거다
			
			String tmp = sc.nextLine();//받은 숫자를 저장할 공간인 tmp를 설정
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
			}
		}
		
	}

}
