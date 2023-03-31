package Day03;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		// 숫자 7을 입력하면 구구단 7단 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(a + "*" + i + "=" + a*i);
		}

	}

}
