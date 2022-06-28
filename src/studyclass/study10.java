package studyclass;

 

public class study10 {

	public static void main(String[] args) {

		//Card c = new Card();----객체를 생성
		//c.kind = "heart"; ----객체 사용
		//c.number = 5;-----객체 사용
		
		 System.out.println("Card.width=" + Card.width);
		 System.out.println("Card.height=" + Card.height);
		
		 Card c1 = new Card();
		 c1.kind = "heart";
		 c1.num = 7;
		 
		 Card c2 = new Card();
		 c2.kind = "Spade";
		 c2.num = 4;
		 
		 System.out.println("C1은 " + c1.kind + " , " + c1.num + "이며 , 크기는 =" + c1.width + " , "+ c1.height);
		
		
		
		
	}

}



class Card{
	String kind;//스트링 참조변수에 kind선언
	int num;//인트 참조변수에 num선언
	static int width = 100; 
	static int height = 250;
	
}
