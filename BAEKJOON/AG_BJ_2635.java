package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2635 {
	public static void main(String[] args) { // 두번째 양의 정수는 첫번째 숫자와 같을 수도 있음 경계값 분석!!!!

		Scanner sc = new Scanner(System.in);

		int firstLetter = sc.nextInt();
		int first = firstLetter;
		int second = 0;
		int next = 0;
		int cnt = 0;
		int max = Integer.MIN_VALUE;
		int nomi = 0;

		for (int i = firstLetter; i >= 1; i--) { // 두번째 수 고르기 //첫번째와 같은 값일 수도 있음
			cnt = 2; // 첫 수와 두번째 수를 더해줘야 함
			first = firstLetter;
			second = i;
//			System.out.println("secondLetter: " + i);

			while (true) {

				next = first - second;
				cnt++;
//				System.out.print("next: " + next + " ");
//				System.out.println("cnt: " + cnt);

				if (next < 0) {
					cnt--;
					break;

				} else {
					first = second;
					second = next;
				}
			}

			if (cnt > max) {
				max = cnt;
				nomi = i;
//				System.out.println("temp nomi: " + nomi);
			}
//			System.out.println();
		}

		// 정답 출력
		System.out.println(max);
//		System.out.println("nomi:" + nomi);

		System.out.print(firstLetter + " " + nomi);
		first = firstLetter;
		while (true) {
			next = first - nomi;
//			System.out.print("next: " + next + " ");
//			System.out.println("cnt: " + cnt);

			if (next < 0) {
				break;

			} else {
				first = nomi;
				nomi = next;
				System.out.print(" " + next);
			}
		}
		sc.close();
	}
}