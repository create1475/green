package sec04.exam03;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		int keycode;
		
		while(true) {
			keycode = System.in.read();
			System.out.println("keycode: " + keycode);
			
		}
		
		
	}

}
