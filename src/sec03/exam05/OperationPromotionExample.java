package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
		int intvalue1 = bytevalue1 + bytevalue2;
		System.out.println(intvalue1);
		
		char charvalue1 = 'A';
		char charvalue2 = 1;
		int intvalue2 = charvalue1 + charvalue2;
		System.out.println("유니코드=" + intvalue2);
		System.out.println("출력문자:"+ (char)intvalue2);
		
		int intvalue3 = 10;
		int intvalue4 = intvalue3 / 4;
		System.out.println(intvalue4);
		
		int intvalue5 = 10;
		double doublevalue = intvalue5/4.0;
		System.out.println(doublevalue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
		
		
	}

}
