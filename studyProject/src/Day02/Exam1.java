package Day02;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// 숫자 1개를 입력받아 3의 배수에만 1을 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= a; i++) { // 변수 i를 a보다 작거나 같을 때까지 반복
			if(i%3 == 0) { // 3의 배수이면
				System.out.print("1 "); // 1을 출력
			}
			else { // 그 외의 상황이면
				System.out.print("0 "); // 0을 출력
			}
		}

	}

}
