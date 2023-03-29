package Day01;

import java.util.Scanner;

// 비교연산자
// = : 값을 넣음(대입)
// == : 같은가?
// != : 같지 않은가?
// && : AND
// || : OR


public class Basic03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 숫자입력? ");
//		int a = sc.nextInt();
		
//		if(a >= 90 && a <= 100) { // 90 ~ 100
//			System.out.println("A");
//		}
//		else if(a >= 80 && a <= 89) { // 80 ~ 89
//			System.out.println("B");
//		}
//		else if(a >= 70 && a <= 79) { // 70 ~ 79
//			System.out.println("C");
//		}
//		else { // 나머지
//			System.out.println("D");
//		}
		
		// 문제 3) 입력받은 숫자가 3, 5, 3 5인지 확인 ex) 15 => 3 5 출력, 5 => 5만 출력
		System.out.println("숫자를 입력하세요. ");
		int b = sc.nextInt();
		
		if (b%3 == 0 && b%5 == 0) { // b % 15 == 0도 사용 가능함
			System.out.println("3 5");
		}
		else if(b%3 == 0) {
			System.out.println("3");
		}
		else if(b%5 == 0) {
			System.out.println("5");
		}
		
		sc.close(); // 스캐너 종료
		

	}

}
