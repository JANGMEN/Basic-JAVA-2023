package Day02;

import java.util.Scanner;

public class For_Repeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 정수형 변수를 입력받음
		int b = sc.nextInt();
		
		sc.close();
		// 문제) 두 개의 숫자를 입력받아서 범위만큼 출력
		// ex) 2 5 => 2 3 4 5, 4 2 => 2 3 4
		int i;
		if(a < b) {
			for(i = a; i <= b; i++) {
				System.out.println(i);
			}
		}
		else if(a > b) {
			for(i = b; i <= a; i++) {
				System.out.println(i);
			}
		}
		

	}

}
