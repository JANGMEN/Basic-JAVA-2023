package Day03;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// 문제) 숫자 13을 입력하면 3의 배수의 합 구하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		sc.close();
		
		for(int i = 1; i <= a; i++) {
			if(i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}

}
