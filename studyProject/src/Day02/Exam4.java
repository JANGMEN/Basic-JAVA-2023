package Day02;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		// 문제1) 숫자 5를 입력하면 아래 처럼 출력하시오.
		// 1 2 3 4 5 4 3 2 1
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= a; i++) {
			System.out.print(i + " ");
		}
		for(int j = 4; j > 0; j--) {
			System.out.print(j + " ");
		}

	}

}
