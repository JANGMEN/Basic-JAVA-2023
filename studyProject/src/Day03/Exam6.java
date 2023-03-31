package Day03;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		// 문제) 숫자 10을 입력하면 홀수의 합, 짝수의 합 각각 구하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int sum1 = 0;
		
		for(int i = 1; i <= a; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
			else {
				sum1 = sum1 + i;
			}
		}
		System.out.println("짝수의 합은 " + sum + "입니다.");
		System.out.println("홀수의 합은 " + sum1 + "입니다.");
		

	}

}
