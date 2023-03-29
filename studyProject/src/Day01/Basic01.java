package Day01;

// 한 줄 주석문 사용
/*여
 러
 줄
 주
 석
 */
// 폰트 크기 변경 : ctrl + 더하기, 빼기
// 클래스명 첫번째 문자는 대문자 ex) Student Car StudentClass
// 변수명 소문자 ex) car student studentAge
// 메소드(함수)명 ex) printMyAge

public class Basic01 {

	public static void main(String[] args) {
		// 타입 변수명 = 초기화값
		// 정수형 : byte, short, int(32bit), long(64bit) ex) 3, -1
		// 문자형 : char ex) 'a', '1', '0', 'N'
		// 실수형 : float, double ex) 1.0, 1.34
		// 논리형 : boolean ex) true, false(참, 거짓)
		
		/*
		int a = 15;
		int b = 16;
		
		System.out.println(a); // 콘솔창에 결과값을 보여줌
		System.out.println(b);
		
		System.out.println(a + b); // 덧셈
		System.out.println(a - b); // 뺄셈
		System.out.println(a * b); // 곱셈
		System.out.println(a / b); // 나눗셈(몫), 정수 / 정수 = 정수, 정수 / 실수 = 실수
		System.out.println(a % b); // 나머지 */
		
		/* 문제 1) int a = 124일 경우 각 자리 수의 합을 구하시오. (100 ~ 999)
		int a = 124;
		
		int a1 = (a % 10); // 마지막 자리 수 구하기
		int a2 = (a / 10 % 10); // 두 번째 자리 수 구하기
		int a3 = (a / 100); // 첫 번째 자리 수 구하기
		
		System.out.println(a1 + a2 + a3); // 세 자리 합 구하기 */
		
		// 문제 2) 1000~9999의 숫자를 뒤집어서 출력하시오. ex) 2451 => 1542
		int a = 2451;
		
		int a1 = a % 10;// 마지막 자리 수 구하기
		int a2 = a / 10 % 10; // 세 번째 자리 수 구하기
		int a3 = a / 100 % 10;// 두 번째 자리 수 구하기
		int a4 = a / 1000;// 첫 번째 자리 수 구하기
		
		int a5 = (a1*1000) + (a2*100) + (a3*10) + a4;
		System.out.println(a5);
		

	}

}
