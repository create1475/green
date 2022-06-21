package sec07.exam03;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		
		for (int m =2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");//이건 첫번쨰for문 여기서 만족을하면 아래있는 2번째for문으로 들어간다.
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));//순차적으로 대입을 하고 여기서 false가 나오면 for문을 빠져나감 그리면 안에있는 for문은 밖에 있는 for문에 걸려서 다시 1번 for문으로 간다.
				
				
			}
		}
		//2단만 나오게 한다.
		for (int m =2; m <= 2; m++) {
			System.out.println("*** " + m + "단 ***");//이건 첫번쨰for문 여기서 만족을하면 아래있는 2번째for문으로 들어간다.
			for (int n = 1; n <=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));//순차적으로 대입을 하고 여기서 false가 나오면 for문을 빠져나감 그리면 안에있는 for문은 밖에 있는 for문에 걸려서 다시 1번 for문으로 간다.
				
				
			}
		}
		
		
	} 

}
