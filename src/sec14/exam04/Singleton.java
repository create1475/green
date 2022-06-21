package sec14.exam04;

public class Singleton {

	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
		
	}


}
///먼 말이고????
//이건 다시 해야것다.
