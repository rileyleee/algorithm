package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1204 {
	public static void main(String[] args) { // 14분 소요
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {
			int testNum = sc.nextInt();
			int[] students = new int[1001];
			int[] cntSt = new int[1001];

			for (int s = 1; s <= 1000; s++) {
				students[s] = sc.nextInt();
				cntSt[students[s]]++;
			}

			int fluent = Integer.MIN_VALUE;
			int fluentIdx = -1;
			for (int i = 1; i < 1001; i++) {
				if (fluent <= cntSt[i]) {
					fluent = cntSt[i];
					fluentIdx = i;
				}
			}
			System.out.println("#" + testNum + " " + fluentIdx);
		}
		sc.close();
	}
}
