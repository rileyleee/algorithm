package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_2058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 정수 n을 문자형로 변환 (1)
//		String num = String.valueOf(n);

		// 정수 n을 문자형로 변환 (2) : 정수 + string은 string
		String num = n + ""; 

		// 문자열을 한글자씩 분리하여 배열에 값 입력
		String[] digits = num.split("");
		// 정수형 배열 선언
		int[] numdigits = new int[digits.length];
		// Integer클래스의 parseInt 함수는 문자형 배열을 인자 값으로 받으면
		// 해당 값을 10진수의 Integer형으로 반환
		for (int i = 0; i < digits.length; i++) {
			numdigits[i] = Integer.parseInt(digits[i]);
		}
		// 모든 배열 요소의 합 구하기
		int sum = 0;
		for (int i = 0; i < numdigits.length; i++) {
			sum += numdigits[i];
		}
		System.out.println(sum);
		sc.close();
	}
}
