package sec14.exam05;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("123456-1234567", "오서준");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "오서준123";
		System.out.println(p1.name);
		
		
		
		
//		p1.nation = "use";
//		System.out.println(p1.nation);	
	}

}

