package Day03;

public class Java02_array {

	public static void main(String[] args) {
		// 문제) age의 값들의 합과 평균을 구하시오.
		
//		int[] age = {1, 2, 4, 5, 12};
//		int sum = 0;
//		float avg = 0.0f;
//		
//		for(int i = 0; i < age.length; i++) {
//			sum = sum + age[i];
//			avg = sum / (float)age.length; // 정수 / 실수 = 실수
//		}
//		System.out.println(sum);
//		System.out.println(avg);
		
		// 문제) age 5개 중에서 짝수만 출력하시오.
//		int[] age = {1, 2, 4, 5, 12};
//		for(int i = 0; i < age.length; i++) {
//			if(age[i] % 2 == 0) { // i % 2 == 0으로 조건을 주면 배열의 자리가 짝수인 값들로 결과가 나옴
//				System.out.println(age[i]);
//			}
//		}
		
		String str = new String("Hello World"); 
		String str1 = "Hello World"; // str과 str1은 같은 결과값이 나옴
		
		String[] ret = str.split(" "); 
		// split은 원하는 기준 문자로 분할하기 때문에 공백을 입력했으므로 ret[0] = Hello, ret[1] = World로 나옴 
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(ret[0]);
		System.out.println(ret[1]);
		System.out.println(str.substring(0, 3));

	}

}
