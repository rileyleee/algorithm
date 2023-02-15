package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long test = sc.nextInt();
		for (long t = 0; t < test; t++) {
			int iterNum = sc.nextInt();
			String str = sc.next();
			char[] s = str.toCharArray();
			String result = ""; // 요구하는 출력의 타입이 문자열이기 때문에

			for (int i = 0; i < s.length; i++) {
				for (int j = 0; j < iterNum; j++) {
					result += s[i]; // 단순 출력이 아닌 문자열로 반환해주어야 한다.
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}
