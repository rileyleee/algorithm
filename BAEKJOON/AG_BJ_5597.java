package algorithm.BAEKJOON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AG_BJ_5597 {
	public static void main(String[] args) {
		// 카운팅 배열 이용 문제

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[28];
		int[] cnt = new int[30];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			cnt[arr[i] - 1] = 1;
		}
		List<Integer> who = new ArrayList<>();
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == 0) {
				who.add(i + 1);
			}
		}
		Collections.sort(who);
		for (int i = 0; i < who.size(); i++)
			System.out.println(who.get(i));

		sc.close();
	}
}
