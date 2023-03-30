package Day02;

import java.util.Scanner;

public class If_ElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a1 = sc.nextFloat(); // 실수형 변수를 입력받음
		float a2 = sc.nextFloat();
		float a3 = sc.nextFloat();
		
		float avg = (a1 + a2 + a3) / 3.0f; // 여기서 3.0f 대신 3도 사용 가능(Why? 변수들이 실수형)
		
		
		if(avg >= 90) {
			System.out.println("평균은 " + avg + "이고 성적은 A입니다.");
		}
		else if(avg >= 80) {
			System.out.println("평균은 " + avg + "이고 성적은 B입니다.");
		}
		else {
			System.out.println("평균은 " + avg + "이고 성적은 B입니다.");
		}
		
		sc.close();
	}
}
