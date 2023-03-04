package algorithm.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class AG_BJ_1026 {
	public static void main(String[] args) { // 20분 소요
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] aArr = new int[num];
		int[] bArr = new int[num];

		for (int a = 0; a < num; a++) {
			aArr[a] = sc.nextInt();
		}
		for (int b = 0; b < num; b++) {
			bArr[b] = sc.nextInt();
		}

		Arrays.sort(aArr);
		Arrays.sort(bArr);

		// Arrays.sort(B, Collections.reverseOrder());
		// 이렇게 작성하면 밑에서 곱할 때 역순으로 곱할 필요 없다.

		int sum = 0;
		for (int a = 0; a < num; a++) {
			sum += aArr[a] * bArr[num - 1 - a];
		}

		System.out.println(sum);
		sc.close();

	}

}
