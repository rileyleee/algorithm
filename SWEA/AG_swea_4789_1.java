package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_4789_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			String str = sc.next();

			int len = str.length();

			int[] arr = new int[len];
			int[] counts = new int[len];

			for (int i = 0; i < len; i++) {
				arr[i] = str.charAt(i) - 48;
			}
			System.out.println(Arrays.toString(arr));
			int result = 0;

			counts[0] = arr[0];
			for (int i = 1; i < len; i++) {
				if (arr[i] >= 1 && i > counts[i - 1]) {
					counts[i] = arr[i] + i;
					result += i - counts[i - 1];
					System.out.println(Arrays.toString(counts));
					System.out.println(i + "일 때의 result  :" + result);
				} else
					counts[i] = arr[i] + counts[i - 1];
			}

			System.out.printf("#%d %d\n", tc, result);
		}

	}

}
