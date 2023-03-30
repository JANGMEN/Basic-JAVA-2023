package Day01;

import java.util.Scanner; // ctrl + shift + o를 사용하여 임포트 할 수 있음

public class Scanner_Use {

	public static void main(String[] args) {
		//클래스명 객체명 = new 클래스명(준비물);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 점수입력? "); // syso까지 치고 ctrl + space를 이용하면 쉽게 칠 수 있음
		int a = sc.nextInt(); // nextInt() : int 타입, 입력 대기
		
		System.out.println("두번째 점수입력? ");
		int b = sc.nextInt();
		
		System.out.println("세번째 점수입력? ");
		int c = sc.nextInt();
		
		int d = a + b + c; // 입력받은 변수를 모두 더함
		float e = d / (float)3; // 반드시 실수 변수 필요 why? float형 변수를 선언했음
		
		System.out.println("입력한 세 점수의 합은 = " + d);
		System.out.println("입력한 세 점수의 평균은 = " + e);

	}

}
