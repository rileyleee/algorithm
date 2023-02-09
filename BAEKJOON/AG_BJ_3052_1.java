package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_3052_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt() % 42;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					arr[i] = 1001; // 값은 1000이하인 수 이기 때문에 중복값을 배제하기 위한 임의의 수
			}
		}

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1001)
				cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}