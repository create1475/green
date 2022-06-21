package sec07.exam08;

public class BreakOutterExample {

	public static void main(String[] args) {
		outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break outter;
//뒤에 써져있는outter은 outter문 빠져나가라는 뜻					
				}
			}
		}
	System.out.println("프로그램 실행 종료");
	}
	

}
//이거 대문자a부터 h 그리고 소문자는 a부터 f까지만 나오게해보기

