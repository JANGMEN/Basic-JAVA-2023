package Day02;

public class Exam2 {

	public static void main(String[] args) {
		int num = 5;
		
		for(int i = 1; i <= num; i++) { // 줄의 개수
			for(int j = 1; j <= i; j++) { // 별의 개수
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
