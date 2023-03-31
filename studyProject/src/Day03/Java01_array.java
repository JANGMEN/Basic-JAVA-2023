package Day03;

public class Java01_array {

	public static void main(String[] args) {
		// 배열의 번호는 0부터 시작(전체 개수 -1개)
		int[] age = {1, 2, 4, 5, 12}; // 나이 변수가 5개 생성, int a부터 e까지 선언하는 것과 같음 (배열)
//		for(int i = 0; i < age.length; i++) { // age.length = age의 길이 (5)
//			System.out.println(age[i]);
//		}
		
		// 역으로 출력하기
//		for(int i = age.length-1; i >= 0; i--) {
//			System.out.println(age[i]);
//		}
		
		// 역으로 출력하기 Ver2.
		for(int i = 0; i < age.length; i++) {
			System.out.println(age[4-i]);
		}

	}

}
