package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1860_1 { // 동교 붕어빵

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int[] arr = new int[11112];
			int[] arrSum = new int[11112];
			int[] cnt = new int[11112];

			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();

//            System.out.printf("%d %d %d ", N, M, K);

			for (int j = 0; j < N; j++) {
				int S = sc.nextInt();
				cnt[S]++;
//                System.out.println(S);
			}

			for (int i = 0; i < 11112; i++) {
				if (M * i < 11112)
					arr[M * i] = K;
			}

			arrSum[0] = arr[0] - cnt[0];
			for (int i = 1; i < 11112; i++) {
				arrSum[i] = arr[i] + arrSum[i - 1] - cnt[i];
			}

//            System.out.print(Arrays.toString(arrSum));
//            System.out.println();

			String result = "Possible";
			for (int i = 0; i < 11112; i++) {
				if (arrSum[i] < 0)
					result = "Impossible";
			}

			System.out.printf("#%d %s\n", (t + 1), result);
		}

	}
}