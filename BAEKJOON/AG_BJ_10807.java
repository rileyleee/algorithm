package algorithm.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class AG_BJ_10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		int norm = sc.nextInt();

		int cnt = 0;

		for (int i = 0; i < num; i++) {
			if (arr[i] == norm) {
				cnt++;
			} else {
				continue;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(cnt);
		sc.close();
	}

}
